<a name="top"/>

West Coast Informatics Terminology Server - Load Data Documentation
===================================================================

This page provides documentation on a load script that may be helpful for loading the
postgres data .dump file and index .zip file.

Prerequisites
* wget must be installed
* postgres client must be installed (psql, dropdb, createdb, pg_restore)
* Postgres environment variables must be set, including: PGDATABASE PGHOST PGUSER PGPASSWORD

load-data.sh
------------
Parameterized script for loading data into a postgres database.  This script requires
three parameters
0. URL or file path to a .dump or .dump.gz (compressed plain-text dump) postgres dump file.
0. URL or file path to an index .zip file
0. Directory where to unpack indexes to

An optional "--force" flag can be used to drop/recreate the database and to overwrite the indexes directory.

All of this information should have been provided by West Coast Informatics, or you can
try with the default testing values which can be found here:
https://wci-wiki.atlassian.net/wiki/spaces/TSV2/pages/177078310/Getting+Started


```
$ dumpUrl=https://wci-us-west-2.s3-us-west-2.amazonaws.com/term-server-v2/data/wci-terminology-db-TEST-2020.dump
$ indexUrl=https://wci-us-west-2.s3-us-west-2.amazonaws.com/term-server-v2/data/wci-terminology-indexes-TEST-2020.zip
$ indexDir=/tmp/index/data
$ ./load-data.sh

```

[Back to Top](#top)

