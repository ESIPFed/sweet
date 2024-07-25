# SWEET Ontologies

[![Chat on Slack](https://img.shields.io/badge/chat-on%20slack-ff69b4.svg)](https://esip-all.slack.com/) on channel #sweetontology 

<img src="https://d9-wret.s3.us-west-2.amazonaws.com/assets/palladium/production/s3fs-public/styles/full_width/public/thumbnails/image/esip-logo_0.png" align="right" width="300" />

# Introduction
Official repository for Semantic Web for Earth and Environmental Terminology (SWEET) Ontologies.

## Accessing SWEET (base ontology)
This table provides links to access the base SWEET ontology, which contains import directives to bring in all the other ontologies. 
If you want to browse the entire content SWEET, see the next section below.
<table>
  <tbody>
    <tr>
      <td><a href="http://sweetontology.net/sweetAll">View in pyLODE</a></td>
      <td><a href="http://www.visualdataweb.de/webvowl/#iri=https://raw.githubusercontent.com/ESIPFed/sweet/master/src/sweetAll.ttl">View in WebVowl</a></td>
      <td><a href="http://cor.esipfed.org/ont#/so/sweetontology">View in ESIP COR</a></td>
    </tr>
    <tr>
      <td><a href="https://github.com/ESIPFed/sweet/blob/master/src/sweetAll.ttl">View in GitHub</a></td>
      <td><a href="https://raw.githubusercontent.com/ESIPFed/sweet/master/src/sweetAll.ttl">View raw RDF</a></td>
      <td><a href="http://cor.esipfed.org/ont/api/v0/ont?format=rdf&iri=http://sweetontology.net/sweetAll">Download RDF</a></td>
    </tr>
  </tbody>
</table>

## Accessing SWEET (all content)

The base URL for SWEET is [http://sweetontology.net/sweetAll](http://sweetontology.net/sweetAll). You can use this URL in any
OWL-compliant tool, including applications such as Protégé or TopBraid as well as ontology tools such as ROBOT.


<table>
  <tbody>
    <tr>
      <td><a href="https://bioportal.bioontology.org/ontologies/SWEET">SWEET in BioPortal</a></td>
      <td><a href="https://bioportal.bioontology.org/ontologies/SWEET/?p=classes&conceptid=root">View all classes</a></td>
      <td><a href="https://data.bioontology.org/ontologies/SWEET/download?apikey=8b5b7825-538d-40e0-9e9e-5ab9274a9aeb&download_format=rdf">Download RDF</a></td>
    </tr>
  </tbody>
</table>

# What is SWEET?
SWEET is a highly modular ontology suite with ~6000 concepts in ~200 separate ontologies covering Earth system science. SWEET is a mid-level ontology and consists of nine top-level concepts that can be used as a foundation for domain-specific ontologies that extend these top-level SWEET components. SWEET’s own domain-specific ontologies, which extend the upper level ontologies, can provide users interested in further developing a particular domain with a solid set of concepts to get started. SWEET ontologies are written in [W3C Turtle](https://www.w3.org/TR/turtle/); the Terse RDF Triple Language.

# SWEET as Linked Data
Details of how HTTP requests against http://sweetontology.net are processed can be found [here](https://github.com/ESIPFed/sweet/wiki/sweetontology.net).

# SWEET IRI Patterns for Ontologies and their Terms
See the relevant [wiki documentation](https://github.com/ESIPFed/sweet/wiki/SWEET-IRI-Patterns-for-Ontologies-and-their-Terms).

# Community
SWEET is governed by the [ESIP Semantic Technologies Committee](http://wiki.esipfed.org/index.php/Semantic_Technologies) (STC) meaning that all proposed changes are evaluated by a number of subject matter experts. If you would like to learn more about SWEET, or are interested in joining the community, please join our [community mailing list](https://lists.esipfed.org/mailman/listinfo/esip-semantictech).

# Recognition of SWEET Contributors
[Ensure you are recognized for your contributions](https://github.com/ESIPFed/sweet/wiki/Recognition-of-SWEET-Contributors).

# Development
Please see the [CONTRIBUTING documentation](https://github.com/ESIPFed/sweet/blob/master/CONTRIBUTING.md).

Additionally, if you wish to discuss SWEET issues with the STC, please contact us via the [WG email list](http://lists.esipfed.org/mailman/listinfo/esip-semantictech). 

# Using local copies of ontology
The sweetall.ttl ontology imports all the other sweet components via URL. If you are offline, or working on updates that require using the local copies of the ontology files, copy the catalog-v001.xml file from the root directory of the repository into the src directory before opening sweetAll.ttl in Protege. 

# License/Copyright
SWEET is available under the [CC0 1.0 Universal Public Domain Dedication](https://creativecommons.org/publicdomain/zero/1.0/).
<p xmlns:dcterms="http://purl.org/dc/terms/">
  <a rel="license"
     href="http://creativecommons.org/publicdomain/zero/1.0/">
    <img src="http://i.creativecommons.org/p/zero/1.0/88x31.png" style="border-style: none;" alt="CC0" />
  </a>
  <br />
  To the extent possible under law,
  <a rel="dcterms:publisher"
     href="https://github.com/ESIPFed/sweet">
    <span property="dcterms:title">SWEET Ontology Developers</span></a>
  have waived all copyright and related or neighboring rights to the
  <span property="dcterms:title">Semantic Web for Earth and Environmental Terminology (SWEET) Ontology Suite</span>.
</p>
A copy of the CC0-1.0 ships with this repository.

Prior to SWEET 3.5.0, SWEET was licensed under the Apache License v2. For more information on the change, see [here](https://github.com/ESIPFed/sweet/issues/173).
