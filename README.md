Todo List Automation using **Selenium**, **Cucumber**, **Maven**, and **Java Language** 
---
---

## Requirements 

#### 1. Java Development Kit (JDK)
* [Download](https://www.oracle.com/technetwork/java/javase/downloads/index.html) and [install](https://docs.oracle.com/javase/10/install/installation-jdk-and-jre-macos.htm#JSJIG-GUID-F575EB4A-70D3-4AB4-A20E-DBE95171AB5F) JDK
* Setting the system variables
    * Create and open your .bash_profile using Terminal
        ```sh
        $ cd ~/
        $ touch .bash_profile
        $ open -e .bash_profile
        ```
    * Set the Java paths in your .bash_profile file
        ```
        export JAVA_HOME=/Library/Java/JavaVirtualMachines/{JDK_VERSION_FOLDER}/Contents/Home
        export PATH=$PATH:$JAVA_HOME/bin
        ```
    * Save and exit your .bash_profile
     
* Type `java -version` in your Terminal to verify installation and find out your java version
* See the output of [java version](https://prnt.sc/p8zd7s)

#### 2. Maven
* [Download Maven](https://maven.apache.org/download.cgi) as your build tools
* Extract downloaded maven into your current directory
* Set the Maven environment path
* Add path variable to .bash_profile file
    ```
    export HOME=/{YOUR_DIRECTORY}/apache-maven-{YOURVERSION}
    export PATH=$PATH:$HOME/bin
    ```
* Verify maven installation using `mvn -version` in Terminal

#### 3. Intellij IDEA
* Download and install IDE using [Intellij IDEA](https://www.jetbrains.com/idea/download/) 
* Open IDE and Create new project using Maven Project
    * Select File, New, Project from Existing sources
    * Project window opened
---
## Execution

#### 1. Run the Test
* Automate http://todomvc.com/examples/vue/ by translating the user stories into different scenarios using Gherkins Given,When,Then
* Run the test by using `mvn clean verify` from Terminal

#### 2. Test Result
* See the results inside `target/site/serenity/index.html` after finishing the test execution
* Open the html file in browser and can see the detailed report of the completed test execution

#### 3. Sample Test Execution Report for Reference
    ![image1](https://github.com/Singtel_QA_Assessment/Sample_test_report/screenshot_1.png)
    ![image2](https://github.com/Singtel_QA_Assessment/Sample_test_report/screenshot_2.png)

