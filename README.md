FRC-3482-2012
=============

A few things you will need before diving in:

*   An installation of the JDK, Netbeans, and the FRC Plugins (see below).
*   An installation of git and a working knowledge of git, as well as a GitHub
    account.
*   You'll need to know how the CommandBased Robot template works (see *WPILib
    Robot Programming Cookbook*).
*   Be sure to document your code *clearly* by explaining exactly what your code
    does using comments. This is so others can improve and
    debug your code more efficiently.


### To Install the JDK and Netbeans ###

Quoted from the *Getting Started with Java for FRC* document 
(download available in the Resources section).

> #### Installing JDK and NetBeans on Windows - Internet ####
> To install the latest versions of NetBeans and Java from the Internet:
> 
> 1.  Open your browser and go to: http://java.sun.com/javase/downloads.
> 2.  Select the "JDK 6 Update 17 with NetBeans 6.7.1" (or later version) by
>     clicking the "Download" button. (The specific version may change since
>     both NetBeans and Java are often updated, but the steps should be similar
>     even with later builds.)
>     If a JDK is already installed, you can download NetBeans only from 
>     http://netbeans.org/downloads/, choosing the "Java SE" bundle will be fine
>     for this.
> 3.  Select the "Continue" button on the left, under the "Platform" drop down.
> 4.  On the "Log In for Download" pop-up, click on "Skip this step" or close
>     the pop-up.
> 5.  If Internet Explorer beeps and presents a "To help protect your security,
>     Internet Explorer blocked this site from downloading files to your
>     computer. Click here for options..." then click and select "Download File"
> 6.  You will be presented with a "File Download - Security Warning" dialog,
>     with "Run", "Save" and "Cancel" for options.
> 7.  Choose "Save" if you wish to take this file and bring it to another
>     machine, and then proceed to the rest of these instructions to install the
>     downloaded bundle.
> 8.  Choose "Run", or launch the downloaded executable.
> 9.  Accept all the default settings and let the installer install the JDK and
>     NetBeans on your system.
> 10. When presented with the "Setup Complete" panel from the "Java SE
>     Development Kit and NetBeans IDE Installer", press "Finish" You can choose
>     to accept the two check boxes presented, or not.
> 
> You should find a new shortcut on your desktop labeled "NetBeans IDE 6.7.1".
> 
> 
> #### Installing JDK and NetBeans on Linux - Internet ####
> NetBeans and Java work equally well on Linux although we have focused our
> testing on Windows and Mac OS X. You may try developing on Linux platforms by
> following these steps:
> 
> 1.  Install the Java JDK if it is not already present on the computer.
> 2.  Download and install the latest version of the NetBeans IDE.
> 3.  Installing the plugins from the update site as shown in the instructions
>     provided in "<strong>Installing the FRC Plugins</strong>", later on in
>     this document.
> 
> This should provide a working development system.
> 
> 
> #### Installing JDK and NetBeans on Mac OS X - Internet ####
> Java is already part of Mac OS X so it doesn't need to be installed.
> Follow these steps:
>
> 1.  Download and install the latest version of the NetBeans IDE.
> 2.  Installing the plugins from the update site as shown in the instructions
>     provided in "<strong>Installing the FRC Plugins</strong>" later on in this
>     document.


### Installing the FRC Plugins ###

Quoted from the *Getting Started with Java for FRC* document 
(download available in the Resources section).

> #### Installing Sun SPOT Java SDK for FRC and WPILib ####
> To install the plugins from the Internet follow the following procedure:
> 
> 1.  Run NetBeans using the Start menu or the desktop shortcut.
> 2.  Select "Tools" then "Plugins" from the main menu in NetBeans.
> 3.  Select the "Settings" tab, and then press the "Add" button to add a new
>     Update Center.
> 4.  For the name, enter "FRC Java" and for the URL enter:
> 
>         http://first.wpi.edu/FRC/java/netbeans/update/updates.xml
> 
>     and press the OK button. Be sure to check for the current update site at
>     http://first.wpi.edu since the update site may change as FPGA updates are
>     released.
> 5.  Select the "Available Plugins" tab and select all the plugins in the "FRC
>     Java" category and click the "Install" button.
> 6.  Advance by clicking the "Next" button and accept the agreements and
>     install the plugins. Ignore the "Validation Warning" dialog where it
>     informs you that "The following plugins are not signed:" and press the
>     "Continue" button.
> 7.  On the "Restart NetBeans IDE to complete the installation" window, use the
>     "Restart IDE Now" option and press the "Finish" button.
> 8.  After restarting NetBeans you should notice the FIRST logo button in the
>     toolbar. This confirms that the module has been installed properly.
>     The plugins are installed; a little configuration is required.
> 9.  Select "Tools" menu, and choose the "Options" menu options, from the
>     NetBeans menu bar.
> 10. Select the "Miscellaneous" tab. Then select the "FRC Configuration" tab
>     and enter your team number into the text field. Then press OK.
>     NetBeans will periodically check for new updates and offer to install them
>     when they become available. Be sure to keep your installation current to
>     get the latest bug fixes and improvements.


### To Get Started ###

1.  You'll want to clone this git respository by moving to the directory where
    you want the project file and executing

        git clone https://github.com/Team3482/FRC-3482-2012.git

2.  Now you should have a folder named "FRC-3482-2012". This is the Netbeans
    project which you'll want to open up using -- you guessed it -- Netbeans. 
    Change whatever code you'd like, and save.
3.  Next, you want to execute the following command to create a new "branch" for
    yourself.
    
        git branch <branch name>

    Be sure to replace `<branch name>` with a name specific to you --
    perhaps something like `<your name>s-branch`. You only have to do this
    once.

    You can use the `git branch` command to view all of the other
    branches available in the project, and an asterisk will be displayed next to
    the branch that you're currently in. To change branches, run

        git checkout <branch name>

    Make sure you are in the branch that you have just created before moving on
    to step 4.
4.  Once you're done making changes, execute the following to save your changes
    within the git project:

        git commit -a -m "<your message>"
    
    Be sure to replace `<your message>`  with a message that details the
    changes you made/features you added.  

    Once you're finished, run the following
    to update your changes on GitHub:

        git push origin master

5.  Use the `git fetch` command to update your local project to the most recent
    version.
6.  Please also learn more about the `git branch`, `git merge`, `git log`, `git
    status`, `git commit`,  and `git pull` commands
    (see **Git Basics (and more)** under **Resources**)

Resources
---------

### GitHub Application ###

[GitHub for Windows (url) ] (http://windows.github.com/)  
[GitHub for Mac (url) ] (http://mac.github.com/)  


### General ###

[FIRST Robotics Competition Website (url)](http://www.usfirst.org/roboticsprograms/frc)  
[FIRST Robotics Resource Center - Java (url)](http://first.wpi.edu/FRC/frcjava.html)  
[Getting Started with Java for FRC (pdf)](http://first.wpi.edu/Images/CMS/First/Getting_Started_with_Java_for_FRC.pdf)  
[WPILib User's Guide (pdf)](http://first.wpi.edu/Images/CMS/First/WPI_Robotics_Library_Users_Guide.pdf)  
[WPILib Javadoc (zip)](http://first.wpi.edu/Images/CMS/First/javadoc.zip)  
[FIRST Java Forums (url)](http://forums.usfirst.org/forumdisplay.php?f=1264)  
[Helpful Documents for the 2012 Game (url)](http://firstforge.wpi.edu/sf/docman/do/listDocuments/projects.wpilib/docman.root)  
[C++/Java Documentation (url)](http://firstforge.wpi.edu/sf/docman/do/listDocuments/projects.wpilib/docman.root.c_and_java_documentation)  
[WPILib Robot Programming Cookbook (pdf)](http://firstforge.wpi.edu/sf/docman/do/downloadDocument/projects.wpilib/docman.root.c_and_java_documentation/doc1297)  


### Git Basics (and more) ###

[GitCasts (url)](http://gitcasts.com/)  
[Git Magic (courtesy of Standford CS) (url)](http://www-cs-students.stanford.edu/~blynn/gitmagic/index.html)  
[Learn.GitHub (url)](http://learn.github.com/p/intro.html)  
[github:help](https://help.github.com/)  
[Pro Git](http://git-scm.com/)  
[More Git Resources!](https://help.github.com/articles/what-are-other-good-resources-for-using-git-or-github)  
