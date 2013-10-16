ObjectiveGit
ObjectiveGit provides Cocoa bindings to the libgit2 library.

Not all libgit2 features are available yet. If you run across something missing, please consider contributing a pull request!

Getting Started

To start building the framework, clone this repository and then run script/bootstrap. This will automatically pull down and install any dependencies.

Note that the bootstrap script automatically installs some libraries that ObjectiveGit relies upon, using Homebrew. If you want this behavior, please make sure you have Homebrew installed.

Importing ObjectiveGit on OS X

It is simple enough to add the ObjectiveGit framework to a desktop application project. An example of this is the CommitViewer example on GitHub. In summary:

Drag the ObjectiveGitFramework.xcodeproj file into the project navigator.
Add the ObjectiveGit framework as a target dependency of your application.
Link your application with ObjectiveGit.framework.
Add a new "Copy Files" build phase, set the destination to "Frameworks" and add ObjectiveGit.framework to that. This will package the framework with your application as an embedded private framework.
Don't forget to #import <ObjectiveGit/ObjectiveGit.h> as you would with any other framework.
Importing ObjectiveGit on iOS

Getting started is slightly more difficult on iOS because third-party frameworks are not officially supported. ObjectiveGit offers a static library instead:

Drag ObjectiveGitFramework.xcodeproj into the Project Navigator.
Add ObjectiveGit-iOS as a target dependency of your application.
Link your application to libObjectiveGit-iOS.a.
In your target's build settings:
Set "Always Search User Paths" to YES
Add $(BUILT_PRODUCTS_DIR)/usr/local/include and PATH/TO/OBJECTIVE-GIT/External/libgit2/include to the "User Header Search Paths"
Add -all_load to the "Other Linker Flags"
Contributing

Fork the repository on GitHub, make it awesomer (preferably in a branch named for the topic), send a pull request.

All contributions should match GitHub's Objective-C coding conventions.