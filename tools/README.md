This directory contains some utilities and scripts for 
manipulation of the ontology files.

The `*.sc` files are Scala scripts to be run via the 
[Ammonite](http://ammonite.io/#ScalaScripts) tool, which in 
particular greatly the use of Java libraries like Jena and OWL-API,
two of the main libraries for ontology manipulation.

As an example, [`ttl_prettify.sc`](ttl_prettify.sc) was the
script used to resolve [#62](https://github.com/ESIPFed/sweet/issues/62).
See file source for details.