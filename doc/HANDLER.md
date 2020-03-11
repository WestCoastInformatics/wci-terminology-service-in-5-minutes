<a name="top" />

Using the "handler" parameter
=============================

The "find concept" API endpoints make use of a "handler" parameter that controls
the nature of the search algorithm used to perform the search. Handlers can be configured on an instance-by-instance basis, but typically some standard handlers are included.

### Standard Hanlders

The following standard handler values can be used.

 - **DEFAULT**: Performs a very basic lucene search with the value passed in.
 - **ATOM**: needs more explanation.
 - **NLP**: Performs an "exact string" search after normalizing punctuation, whitespace, and case-sensitivity. 
 - **NGRAM**: Performs an ngram-based search to be tolerant of incomplete words, spelling issues, etc.

If the handler parameter is not specified, DEFAULT is used.

### Custom Handlers

Needs discussion.

