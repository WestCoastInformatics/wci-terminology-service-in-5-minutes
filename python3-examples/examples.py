from urllib.request import urlopen
from urllib.parse import quote
import json

baseUrl = 'http://localhost:8080/api/v1'

#Prints fsn of a concept
def getConceptById(term):
    url = baseUrl + '/search?' + urllib.urlencode({ 'term': term})
    response = urlopen(url).read()
    data = json.loads(response.decode('utf-8'))

    print (data['fsn']['term'])

termSearch('melanoma')

