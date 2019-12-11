# Development

The development process for SWEET follows the [Review-then-Commit](https://www.apache.org/foundation/glossary.html#ReviewThenCommit) software development process. For more information, see the Subsection below

## How to work with us on Github, using git command line:
The following is the SWEET Github development workflow:
* create a local copy of the ESIPFed sweet repo ```git clone https://github.com/esipfed/sweet.git```
* cd to the new repo directory ```cd sweet```
* fetch the branches and their respective commits from the upstream repository: ```git fetch origin```
* as with many projects, `master` is our main branch, so if you are proposing to change the codebase, skip to 5 below
* log an issue in the [sweet issue tracker](https://github.com/ESIPFed/sweet/issues).  Please use [labels](https://help.github.com/articles/applying-labels-to-issues-and-pull-requests/) to classify your issue. If you need a new label to be created then please state this in your issue description. 
* create a branch in your local repo which tracks origin master branch. The branch name should reflect the issue number you created above e.g. [ISSUE-1](https://github.com/ESIPFed/sweet/issues/1) ```git checkout -b ISSUE-1```. At this point, the branch exists in your local repo, but not in the repo on GitHub
* make the changes in your branch
* add the changed file to be committed
```git status``` will list the files that have been changed. These need to either be added for committing with ```git add {file name}```, or use ``` -a``` option on the following git commit command (see below)

* commit - with commit message please! e.g. ```git commit -m "ISSUE-1 Test Issue for SWEET"``` or
```git commit -a -m "ISSUE-1 Test Issue for SWEET"``` if you don't explicitly add the changed files in the commit

* synchronise your changes with origin: ```git push origin ISSUE-1```. This will push the new branch to the orgin--which is the online Github repo. If you look at the repo with your browser, you should be able to see your new 'ISSUE-1' branch there. 

* Proceed to 'Pull Request...' section, below.


## How to work with us on Github, using GitHub Desktop v1.3.2 (Windows) :
See the [user guide](https://help.github.com/desktop/guides/) for more in depth help. This secion assumes you have installed the [GitHub Desktop software](https://desktop.github.com/) on your local computer. 

* create a local copy of the ESIPFed sweet repo. Open the [SWEET repository](https://github.com/ESIPFed/sweet) in a web browser, and click the green 'Clone or download' on the center right side of the repository page, select 'Open in Desktop' from the context menu.  GitHub Desktop should open, with a dialog to select the local path where the directory containing the repository will be created. Set the path and enter, the repository files will be copied from GitHub into your local computer.

* log an issue in the [sweet issue tracker](https://github.com/ESIPFed/sweet/issues).  Please use [labels](https://help.github.com/articles/applying-labels-to-issues-and-pull-requests/) to classify your issue. If you need a new label to be created then please state this in your issue description. 

* In the GitHub Desktop application, click on the 'Current branch' control, top center. Make sure you're on the 'Branches' tab in the drop-down menu, and click the 'New Branch' button (top right, next to the text box), and enter the new branch name. The branch name should reflect the issue number you created above e.g. [ISSUE-1](https://github.com/ESIPFed/sweet/issues/1).  The 'Current branch' control should show the name of the new branch, indicating that that's the branch your file system is connected to now.

* make changes in the appropriate files in your checked out local version of the repository. 

* changed files should show up in the 'Changes' tab on the left side of the GitHub desktop window. Select the files you want to commit into your local repository, and enter a short, informative, commit comment explaining what changes were made in the Summary text box (bottom of the 'Changes' tab). Add details in the Description text box if appropriate

* Click the blue 'Commit to {your branch name}' button at the bottom of the Changes tab.

* click the 'Push origin' button on the right side of the row of buttons below the standard windows menus at the top of the screen.  

* Your new branch, with the updated files should now be visible when you look at the repository online in your web browser. Proceed to pull request section (below)


## Pull Request to get changes merged into the master

* head over to the origin repository on GitHub, create a Pull Request from the new ISSUE-1 branch into master ... at this point, you might assign the Pull Request to someone else (preferabbly a subject matter expert) to check before merging.  Look at the pull request page in your browser, on the right hand side you can select Reviewers, assignees, labels. Reviewers and assignees have to have access to the repository; identify them by their github user name.

* **EDITORS ONLY**: Once a review has been undertaken and consensus exists that it is OK, within GitHub, merge the changes into master and delete the development branch


## AFTER the Editor has reviewed and merged changed into the GitHub master: 

### From command line:
* bring all those changes back into your local repo: ```git fetch origin```

* rebase (don't 'pull' - because this creates another commit) changes on your branch: ```git rebase origin```

### From Github Desktop 1.3.2 (Windows):

Github Desktop does not seem to have a 'rebase' option; clicking 'Pull Origin' will generate a commit that synchronizes your local repo with the online master. In general this shouldn't be a problem unless multiple people are working on different branches, in which case things can get confusing. See [this discussion](https://www.atlassian.com/git/tutorials/merging-vs-rebasing) for more information. 

# Discussion of SWEET issues 
If you wish to discuss SWEET issues with the STC, please contact us via the [WG email list](http://lists.esipfed.org/mailman/listinfo/esip-semanticweb).

## Avoiding presence of http://org.semanticweb.owlapi/error#Error(n) in contributions when editing using Protege

We have noticed that the rogue IRI http://org.semanticweb.owlapi/error#Error(n) can be inadventently written to files when a contributor saves thier work locally before contributing. Although we are not entirely sure about why this happens, we think that it stems from bug(s) in the underlying [OWLAPI](http://owlcs.github.io/owlapi/) (used a dependency within Protege) which is used to format and write data to the files. Please review you contribution carefully and pay extra attention to the presence of this annoying anomaly.

## Before you write a new request, please consider the following: 

- **Does the term already exist?** Before submitting suggestions for new ontology terms, check whether the term exist, either as a primary term or a synonym term. You can search using [Github search](https://github.com/ESIPFed/sweet/search?utf8=%E2%9C%93&q=&type=).

## Guidelines for creating GitHub tickets with contributions to the ontology:

1. **Write a detailed request:** Please be specific and include as many details as necessary, providing background information, and if possible, suggesting a solution. SWEET editors will be better equipped to address your suggestions if you offer details regarding *'what is wrong'*, *'why'*, and *'how to fix it'*.

2. **Provide examples and references:** Please include URI's or external links for new term requests, and include also screenshots, or URLs illustrating the current ontology structure for other types of requests. 

3. **For new term request:** Be sure to provide suggestions for label (name), definition, references, position in hierarchy, etc.

4. **For updates to relationships:** Provide details of the current axioms, why you think they are wrong or not sufficient, and what exactly should be added or removed.

5. Please consider using the [issue template](https://github.com/ESIPFed/sweet/blob/master/issue_template.md) for structuring your issue.

On behalf of the SWEET editorial team, Thanks!
