# SWEET Ontologies

<img src="http://www.esipfed.org/sites/default/files/esip-logo.png" align="right" width="300" />

<a href="http://esipfed.org">![](http://badge.esipfed.org/testbed.svg?display=logo)</a>
<a href="http://wiki.esipfed.org/index.php/Semantic_Technologies">![](http://badge.esipfed.org/semanticweb.svg?display=logo)</a>

# Introduction
Official repository for Semantic Web for Earth and Environmental Terminology 
(SWEET) Ontologies. For more information, see [https://sweet.jpl.nasa.gov](https://sweet.jpl.nasa.gov).

# What is SWEET?
SWEET ontologies are written in the OWL ontology language and are publicly available. 
SWEET version 2.3 is highly modular with 6000 concepts in 200 separate ontologies. 
You can view the entire concept space from an OWL tool such as [Protege](http://protege.stanford.edu/)
by reading in [sweetAll.owl](https://github.com/ESIPFed/sweet/blob/master/sweet2.3/sweetAll.owl). Alternatively, these ontologies can be viewed individually. 

SWEET 2.3 consists of nine top-level concepts/ontologies. 
SWEET is a middle-level ontology; most users add a domain-specific ontology using the components 
defined here to satisfy end user needs.

# Community
SWEET is governed by the ESIP Semantic Technologies [Committee]
(http://wiki.esipfed.org/index.php/Semantic_Technologies) (STC) meaning that all proposed 
changes are evaluated by a number of subject matter experts. If you would like to learn more about
SWEET, or are interested in joining the community, please 
join our community mailing [list](http://lists.esipfed.org/mailman/listinfo/esip-semanticweb).

# Development
The development process for SWEET follows the [Review-then-Commit](https://www.apache.org/foundation/glossary.html#ReviewThenCommit) software development 
process. For more information, see the Subsection below

## How to work with us on Github
The following is the SWEET Github development workflow:
 1. create a local copy of the ESIPFed sweet repo ```git clone https://github.com/esipfed/sweet.git```
 2. configure remotes on local - specify the ESIPfed sweet repo remote as 'upstream': ```git remote add upstream https://github.com/esipfed/sweet.git```
 3. fetch the branches and their respective commits from the upstream repository: ```git fetch upstream```
 4. as with many projects, `master` is our main branch, so if you are proposing to change the codebase, skip to 5 below
 5. log an issue in the [sweet issue tracker](https://github.com/ESIPFed/sweet/issues).  Please use [labels](https://help.github.com/articles/applying-labels-to-issues-and-pull-requests/) to classify your issue. If you need a new label to be created then please state this in your issue description. 
 6. create a branch in your local repo which tracks master in upstream. The branch name should reflect the issue number you created above e.g. [SWEET-1](https://github.com/ESIPFed/sweet/issues/1) ```git checkout -b SWEET-1 upstream/master```
 7. make the changes in your branch & commit - with commit message please! e.g. ```git commit -m "SWEET-1 Test Issue for SWEET"```
 8. synchronise your changes with upstream: ```git push upstream SWEET-1```
 9. within GitHub, create a Pull Request from SWEET-1 into master ... at this point, you might assign the Pull Request to someone else (preferabbly a subject matter expert) to check before merging
 10. **EDITORS ONLY**: Once a review has been undertaken and consensus exists that it is OK, within GitHub, merge the changes into master
 12. bring all those changes back into your local repo: ```git fetch upstream```
 13. rebase (don't 'pull' - because this creates another commit) changes on your branch: ```git rebase upstream/master```

Additionally, if you wish to discuss SWEET issues with the STC, please contact us via the [WG email list](http://lists.esipfed.org/mailman/listinfo/esip-semanticweb). 

# License
SWEET is licensed permissively under the [Apache License v2.0](https://www.apache.org/licenses/LICENSE-2.0) a
copy of which ships with this source code.
