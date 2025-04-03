# ModelSpeak

This repository provides a proof-of-concept tool for how moves in a simulation study can be translated into argument graphs capturing the current shared understanding of what they study says. The repository contains an example and a set of Eclipse plugins to enable the example to be tried out.

## Installation

1. Install Eclipse (latest should be OK), use "[Eclipse IDE for Java and DSL Developers](https://www.eclipse.org/downloads/packages/release/2024-06/r/eclipse-ide-java-and-dsl-developers)", best via Oomph Installer. 
2. Install [Sirius via the Eclipse Marketplace](https://eclipse.dev/sirius/download.html)
3. Install Henshin. Take the latest nightly build. You will need to install via the [update site](http://download.eclipse.org/modeling/emft/henshin/updates/nightly). To do so go to "Help">"Install new software...", then click on "Add" and enter the above URL in the URL field, using "Henshin nightly" for the name.
4. Now right-click in the project explorer view on the left-hand side and choose "Import projects">"From Git", go through the wizard and add the Git clone URL for this repository in the appropriate place. Import all projects except for the three `.design` projects and the `modelSpeakTest` project.
5. You should now be able to right-click on one of the projects and select "Run As">"Eclipse Application" to get a second Eclipse instance in which you can start playing with things. If you do see errors in the projects imported, you may have to find the `.xtext` files in the `.agents` and the `.theorystore` projects (you may need to look inside the hierarchical `.parent` projects), right-click on them and select "Run As">"Generate Xtext artefacts". You may still have some errors on the `.henshin` or the `.henshin_diagram` files, but these shouldn't stop you from running the project.
6. In the new Eclipse instance, again right-click on the project explorer and import projects from git. This time import only the two `.design` projects and `modelSpeakTest`.
7. Open file `src/lrp6.mspeak` in the "modelSpeakTest" project -- this is where the moves are defined. Every time you save this, files `src-gen/lrp6.arguments` and `src-gen/lrp6.abstract_arguments` are updated. If you open the `.aird` file, you should be able to navigate to a "view" called "SimStudyArgumentDiagram", which is the graphical rendering of the argument.
