#!/bin/sh
#
# Prerequisite: PGDATABASE, PGHOST, PGUSER, and PGPASSWORD must be set
#
# Script to load WCI terminology service data from .dump and .zip artifacts
# For the first parameter
#  - pass a URL to a dump or dump.gz file OR
#  - pass a path to a locally downloaded dump or dump.gz file 
# For the second parameter
#  - pass a URL to an indexes .zip file OR
#  - pass a path to a indexes .zip file 
# For the third parameter
#  - pass the path to the index folder you want to use
# Use --force if the index folder already has data and you want to replace it
#
while [[ "$#" -gt 0 ]]; do case $1 in
  --force) force=1;;
  *) arr=( "${arr[@]}" "$1" );;
esac; shift; done

if [ ${#arr[@]} -ne 3 ]; then
  echo "Usage: $0 <dump file/url> <index file/url> <indexDir> [--force]"
  echo "  e.g. $0 \$dumpUrl \$indexUrl /index/data"
  echo "  e.g. $0 \$dumpUrl \$indexUrl /index/data --force"
  exit 1
fi

dumpUrl=${arr[0]}
indexUrl=${arr[1]}
indexDir=${arr[2]}

echo "-----------------------------------------------------"
echo "Starting ...$(/bin/date)"
echo "-----------------------------------------------------"
echo "  dump url  = $dumpUrl"
echo "  index url = $indexUrl"
echo "  index dir = $indexDir"
if [[ $force -eq 1 ]]; then
    echo "  FORCE mode"
fi
elasticsearch=0
if [[ $indexUrl =~ elasticsearch ]]; then
    elasticsearch=1
    echo "  ELASTICSEARCH mode"
fi

error=0
# check env
for p in PGDATABASE PGHOST PGUSER PGPASSWORD; do
    if [[ -z ${!p+x} ]]; then
        echo "ERROR $p must be set first"
        error=1
    elif [[ $p == "PGPASSWORD" ]]; then
        echo "  $p = *************"
    else
        echo "  $p = ${!p}"
    fi
done
echo ""

# check dependencies
for p in wget psql dropdb createdb pg_restore; do
    which $p >> /dev/null 2>&1
    if [[ $? -ne 0 ]]; then
        echo "ERROR: $p must be installed"
        error = 1
        exit 1
    fi
done

# validate index dir
if [[ -e $indexDir ]]; then
	ct=`ls $indexDir | wc -l`
	if [[ $ct -ne 0 ]] && [[ $force -eq 0 ]]; then
        echo "ERROR: $indexDir has contents but --force was not used, please re-run with --force"
        error=1
    else
        echo "    Cleanup existing \$indexDir"
        /bin/rm -rf $indexDir/*
	fi
else
    mkdir --parents $indexDir
fi

if [[ $error -eq 1 ]]; then
    echo ""
    echo "completed with errors..."
    exit 1
fi

# Prepare data file
echo "    Prepare data from \$dumpUrl ...`/bin/date`"
plain=0
if [[ $dumpUrl =~ http.*dump.gz ]]; then
    wget -O data.$$.dump.gz $dumpUrl > /tmp/x.$$.log 2>&1
    if [[ $? -ne 0 ]]; then
      cat /tmp/x.$$.log | sed 's/^/      /'
      echo "ERROR downloading $dumpUrl file"
      exit 1
    fi
    dumpUrl=data.$$.dump.gz
    plain=1
elif [[ $dumpUrl =~ http.*dump ]]; then
    wget -O data.$$.dump $dumpUrl > /tmp/x.$$.log 2>&1
    if [[ $? -ne 0 ]]; then
      cat /tmp/x.$$.log | sed 's/^/      /'
      echo "ERROR downloading $dumpUrl file"
      exit 1
    fi
    dumpUrl=data.$$.dump
    plain=0
elif [[ $dumpUrl =~ .*dump.gz ]]; then
    plain=1
elif [[ $dumpUrl =~ .*dump ]]; then
    plain=1
else
    echo "ERROR: bad dumpUrl = $dumpUrl"
    exit 1
fi

# Prepare index file
echo "    Prepare indexes from \$indexUrl ...`/bin/date`"
if [[ $indexUrl =~ http.*zip ]]; then
    wget -O index.$$.zip $indexUrl > /tmp/x.$$.log 2>&1
    if [[ $? -ne 0 ]]; then
      cat /tmp/x.$$.log | sed 's/^/      /'    
      echo "ERROR downloading $indexUrl file"
      exit 1
    fi
    indexUrl=index.$$.zip
fi

# Load the database
echo "    Load $PGDATABASE from $dumpUrl ...`/bin/date`"
dbexists=`psql -lqt | cut -d \| -f 1 | grep -qw $PGDATABASE | wc -l`
if [[ $force -eq 1 ]]; then
    echo "      kill any active db sessions"
    psql $PGDATABASE << EOF > /tmp/x.$$.log 2>&1
SELECT pg_terminate_backend(pg_stat_activity.pid)
FROM pg_stat_activity
WHERE datname = current_database()
  AND pid <> pg_backend_pid();
EOF
    echo "      drop $PGDATABASE"
    dropdb $PGDATABASE
fi

# create database
if [[ $dbexists -eq 0 ]] || [[ $force -eq 1 ]]; then
    echo "      create $PGDATABASE"
    createdb --encoding=UTF8 $PGDATABASE 
    if [[ $? -ne 0 ]]; then
        echo "ERROR creating database"
        exit 1
    fi
fi

echo "    restore dump to db ...`/bin/date`"
if [[ $plain ]]; then
    pg_restore -O -n public -Fc -j 2 -d $PGDATABASE $dumpUrl | sed 's/^/    /'
else
    gunzip -c $dumpUrl | psql -U $PGUSER $PGDATABASE
fi
if [ $? -ne 0 ]
then
    echo "ERROR restoring $dumpUrl to $PGDATABASE"
    exit 1
fi
#
# Unpack and load the indexes (for elasticsearch)
#

if [[ $elasticsearch -eq 1 ]]; then
    echo "    TODO: Implement THIS PART"
#echo "  unzip indexes ...`/bin/date`"
#unzip $indexUrl >> /dev/null 2>&1

#echo "  load indexes ...`/bin/date`"
#echo "    url = $ELASTICSEARCH_URL"
#for file in com*.json; do
#  index=`echo $file | sed 's/.json//'`
#  /bin/rm -f /tmp/x.$$.log
#  echo "    delete index $index ...`/bin/date`"
#  curl -X DELETE "$ELASTICSEARCH_URL/$index" >> /dev/null 2>&1
#  echo "    load index $index ...`/bin/date`"
#  elasticdump --input=${index}.json --output="$ELASTICSEARCH_URL/$index" --type=data >> /tmp/x.$$.log
#  if [ $? -ne 0 ]
#  then
#    cat /tmp/x.$$.log | sed 's/^/    /'
#    echo "ERROR loading $index"
#    break
#  fi
#done

else
    echo "    Unpack $indexUrl"
    unzip $indexUrl -d $indexDir > /tmp/x.$$.log 2>&1
    if [[ $! -ne 0 ]]; then
        cat /tmp/x.$$.log | sed 's/^/    /'
        echo "ERROR unzipping $indexUrl to $indexDir"
        exit 1
    fi
fi


# Cleanup
echo "    Cleanup ...`/bin/date`"
/bin/rm -f data.$$.dump{,.gz} index.$$.zip /tmp/x.$$.log

echo "-----------------------------------------------------"
echo "Finished ...$(/bin/date)"
echo "-----------------------------------------------------"
