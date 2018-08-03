# Development

The development process for SWEET follows the [Review-then-Commit](https://www.apache.org/foundation/glossary.html#ReviewThenCommit) software development process. For more information, see the Subsection below

## How to work with us on Github
The following is the SWEET Github development workflow:
 1. create a local copy of the ESIPFed sweet repo ```git clone https://github.com/esipfed/sweet.git```
 2. configure remotes on local - specify the ESIPfed sweet repo remote as 'upstream': ```git remote add upstream https://github.com/esipfed/sweet.git```
 3. fetch the branches and their respective commits from the upstream repository: ```git fetch upstream```
 4. as with many projects, `master` is our main branch, so if you are proposing to change the codebase, skip to 5 below
 5. log an issue in the [sweet issue tracker](https://github.com/ESIPFed/sweet/issues).  Please use [labels](https://help.github.com/articles/applying-labels-to-issues-and-pull-requests/) to classify your issue. If you need a new label to be created then please state this in your issue description. 
 6. create a branch in your local repo which tracks master in upstream. The branch name should reflect the issue number you created above e.g. [ISSUE-1](https://github.com/ESIPFed/sweet/issues/1) ```git checkout -b ISSUE-1 upstream/master```
 7. make the changes in your branch & commit - with commit message please! e.g. ```git commit -m "ISSUE-1 Test Issue for SWEET"```
 8. synchronise your changes with upstream: ```git push upstream ISSUE-1```
 9. within GitHub, create a Pull Request from ISSUE-1 into master ... at this point, you might assign the Pull Request to someone else (preferabbly a subject matter expert) to check before merging
 10. **EDITORS ONLY**: Once a review has been undertaken and consensus exists that it is OK, within GitHub, merge the changes into master
 12. bring all those changes back into your local repo: ```git fetch upstream```
 13. rebase (don't 'pull' - because this creates another commit) changes on your branch: ```git rebase upstream/master```

Additionally, if you wish to discuss SWEET issues with the STC, please contact us via the [WG email list](http://lists.esipfed.org/mailman/listinfo/esip-semanticweb). 

## Before you write a new request, please consider the following: 

- **Does the term already exist?** Before submitting suggestions for new ontology terms, check whether the term exist, either as a primary term or a synonym term. You can search using [Github search](https://github.com/ESIPFed/sweet/search?utf8=%E2%9C%93&q=&type=).

## Guidelines for creating GitHub tickets with contributions to the ontology:

1. **Write a detailed request:** Please be specific and include as many details as necessary, providing background information, and if possible, suggesting a solution. SWEET editors will be better equipped to address your suggestions if you offer details regarding *'what is wrong'*, *'why'*, and *'how to fix it'*.

2. **Provide examples and references:** Please include URI's or external links for new term requests, and include also screenshots, or URLs illustrating the current ontology structure for other types of requests. 

3. **For new term request:** Be sure to provide suggestions for label (name), definition, references, position in hierarchy, etc.

4. **For updates to relationships:** Provide details of the current axioms, why you think they are wrong or not sufficient, and what exactly should be added or removed.

5. Please consider using the [issue template](https://github.com/ESIPFed/sweet/blob/master/issue_template.md) for structuring your issue.

On behalf of the SWEET editorial team, Thanks!
