# ModelSpeak

This repository provides a proof-of-concept tool for how moves in a simulation study can be translated into argument graphs capturing the current shared understanding of what they study says. The repository contains an example and a set of Eclipse plugins to enable the example to be tried out.

The repository provides the artefacts for the following paper:

- "Towards dialectic models for documenting and conducting simulation studies: A vision" accepted as a short paper for [PADS'25](https://sigsim.acm.org/conf/pads/2025/).

## Authors & Contacts

- Steffen Zschaler szschaler@acm.org
- Pia Wilsdorf
- Thomas Godfrey
- Adelinde Uhrmacher

## Requirements

There are no special hardware requirements for running this software. 

## Dependencies

The software requires Eclipse, Sirius, and Henshin. These can be installed as follows:

1. Install Eclipse (latest should be OK), use "[Eclipse IDE for Java and DSL Developers](https://www.eclipse.org/downloads/packages/release/2024-06/r/eclipse-ide-java-and-dsl-developers)", best via Oomph Installer. 
2. Install [Sirius via the Eclipse Marketplace](https://eclipse.dev/sirius/download.html)
3. Install Henshin. Take the latest nightly build. You will need to install via the [update site](http://download.eclipse.org/modeling/emft/henshin/updates/nightly). To do so go to "Help">"Install new software...", then click on "Add" and enter the above URL in the URL field, using "Henshin nightly" for the name.

For analysing argument graphs, it will be useful to install an argument solver. We have used [plato](https://nms.kcl.ac.uk/odinaldo.rodrigues/solvers.html), but other solvers probably work as well.

## Paper claims

The paper proposes a vision of documenting (and supporting the conduct of) simulation studies through argumentation-based dialogues, where individual dialogue moves update an argument graph that captures the currently agreed state of the simulation study. This repository provides prototypical tooling for modelling moves and generating argument graphs as well as deriving abstract argumentation frameworks that can be analysed using standard argument solvers. The repository also contains an illustrative example. It, thus, provides proof of concept that modelling simulation studies in this way is possible.

## Running the example

1. In the running Eclipse, right-click in the project explorer view on the left-hand side and choose "Import projects">"From Git", go through the wizard and add the Git clone URL for this repository in the appropriate place. Import all projects except for the three `.design` projects and the `modelSpeakTest` project. Your Eclipse may not initially show a "project explorer", but may show a "model explorer". This will work equally well. Alternatively, you may be able to get things going by going to "Window">"Perspective">"Reset Perspective" in the main menu. 
2. You should now be able to right-click on one of the projects and select "Run As">"Eclipse Application" to get a second Eclipse instance in which you can start playing with things. If you do see errors in the projects imported, you may have to find the `.xtext` files in the `.agents` and the `.theorystore` projects (you may need to look inside the hierarchical `.parent` projects), right-click on them and select "Run As">"Generate Xtext artefacts". You may still have some errors on the `.henshin` or the `.henshin_diagram` files, but these shouldn't stop you from running the project.
3. In the new Eclipse instance, again right-click on the project explorer and import projects from git. This time import only the three `.design` projects and `modelSpeakTest`.
4. Open file `src/lrp6.mspeak` in the "modelSpeakTest" project -- this is where the moves are defined. Every time you save this, files `src-gen/lrp6.arguments` and `src-gen/lrp6.abstract_arguments` are updated. If you open the `.aird` file, you should be able to navigate to a "view" called "SimStudyArgumentDiagram", which is the graphical rendering of the argument.
5. To identify the acceptable arguments within a argument diagram, you can use the corresponding `.tgf` file contained in the `src-gen/` folder of hte `modelSpeakTest` project and manually feed it into a suitable argument solver. We have used [`plato`](https://nms.kcl.ac.uk/odinaldo.rodrigues/solvers.html), but other solvers probably work as well. This is currently not fully integrated into the tooling and remains a manual step with command-line output. For `plato`, the command line would be
   ```bash
   plato -p EE-CO -fo tgf -f <path-to-tgf-file>
   ```
   This should produce the following output for `lrp6.tgf`:
   ```
   [
      [7,14,4,3,2,1,0]
   ]
   ```
   Removing the final move, the output should be:
   ```
   [
      [6,4,3,2,1,0,5]
   ]
   ```
   To help match the numerical IDs of arguments to the original argument graph, you can open the corresponding `.abstract_arguments` model. Again, go via the `.aird` file to open the corresponding diagram rather than the tree view of the model. In the diagram, you can hover over the numbers to see information about the original element in the argument graph. Equally, the argument graph diagram contains small rectangles that indicate the argument numbers corresponding to elements of the argument graph. It's then possible to see that the first result doesn't include the argument number `5`, which is the overall conclusion of the simulation study.
