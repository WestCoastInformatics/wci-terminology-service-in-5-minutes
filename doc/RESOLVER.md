<a name="top" />

Using the "resolver" parameter
=============================

The "find concept" API endpoints make use of a "resolver" parameter that controls
how much data the given call should return. Resolvers can be configured on an instance-by-instance basis, but typically some standard resolvers are included.

### Standard Resolvers

The following special "resolver" values are for convenience:

DEFAULT,NLP,NLP2,ATOM,NGRAM,RXNORM,MIN,LOOKUP,CODING

 - **CODING**: indicates minimal information plus "synonyms", "definitions" and "properties" should be included. Equivalent to using "synonyms,definitions,properties" as the "include" value. 
 - **DEFAULT**: indicates to return a standard summary of all concept information except for relationships.
 - **EXACT**: used with the EXACT search handler, it causes the concept to only be returned with the actual atoms that matched the search criteria
 - **LOOKUP**: indicates to return all available data (never a default).
 - **MIN**: indicates minimal information should be included - local, active, name, code, and terminology.

If the resolver parameter is not specified, DEFAULT is used.

### Custom Resolvers

Needs discussion.

