---
layout: ontology_detail
id: sweet
title: sweet
jobs:
  - id: https://travis-ci.org/ESIPFed/sweet
    type: travis-ci
build:
  checkout: git clone https://github.com/ESIPFed/sweet.git
  system: git
  path: "."
contact:
  email: esip-semanticweb@lists.esipfed.org
  label: ESIP Semantic Technologies Committee
description: sweet is an ontology describing Semantic Web for Earth and Environmental Terminology
domain: stuff
homepage: https://github.com/ESIPFed/sweet
products:
  - id: sweetAll.owl
  - id: sweetAll.obo
dependencies:
tracker: https://github.com/ESIPFed/sweet/issues
license:
  url: https://www.apache.org/licenses/LICENSE-2.0
  label: ALv2.0
---

SWEET ontologies are written in the OWL ontology language and are publicly available. SWEET version is highly modular with 6000 concepts in 200 separate ontologies. You can view the entire concept space from an OWL tool such as Protege by reading in sweetAll.owl. Alternatively, these ontologies can be viewed individually. SWEET consists of nine top-level concepts/ontologies. SWEET is a middle-level ontology; most users add a domain-specific ontology using the components defined here to satisfy end user needs.
