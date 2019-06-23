# Webdriver Starter Template

This is a template for initialising a junit 5 java 11 webdriver gradle project for UI testing
This readme will walk you through getting this up and running.

#### First you need a Java Development Kit JDK
if you don't have one I used:
AdoptOpenJDK 11 (hotspot!) from https://adoptopenjdk.net

(If you want to use Java 8 that is fine - 
but you will have to change the build.gradle file so it says sourceCompatibility = 1.8 instead of 1.11
and you may need to change the run configurations to run JUnit tests. Better to try to stay up to date :) )

#### Second you need an IDE to edit, compile, run the java, I used:
Intellij Community edition 2019 https://www.jetbrains.com/idea/download/

#### Then you need to clone this git repository to your local computer
I used Intellij but you might prefer to use SourceTree or Github Desktop

For intellij: choose new project from version control > git
Give this repository as the url i.e.

https://github.com/mike-james-rust/webdriver-template.git

This will download the project to the directory you choose.
However, Intellij cannot tell from this that is a gradle project. Gradle downloads looks after all the libraries that are needed for the project.

#### Open the project as a gradle project
To get intellij to recognise that it is a gradle project, open intellij and choose new project from existing sources: File>New>Project from existing sources
Then navigate to the file build.gradle and open that.
It will then ask you for the gradle JVM - choose the location of the JDK that you installed, eg:
C:\Program Files\AdoptOpenJDK\jdk-11.0.3.7-hotspot
Click ok and Intellij and gradle will take over and install of of the dependency libraries :)

#### Get the right chromedriver
In the resources folder, you will need to put the chromedriver.exe , this controls chrome. This can replace the placeholderforchromedriver.md file.

Chromedriver is not included in this repository, you will need to download the version of chromedriver 
that matches your version of chrome and your operating system from http://chromedriver.chromium.org/downloads

You can also use geckodriver for firefox and other drivers for other browsers, see https://www.seleniumhq.org/download/ and the notes on the SampleTest class

#### Windows or Mac or Linux?
This is set up to run on Windows. The biggest difference betweeen running windows vs mac & linux 
is that windows directories are written with backslash \ whereas mac and linux are written with forward slash / 
In Java, the backslash has a special meaning, it is used to "escape" a character. For this reason, windows directories are actually written in the code with a double \\ 
See the notes in the DuckDuckGoHomeTest class and the "get the right chromedriver" section above, if you want to run this on mac or linux.

#### Running the test
In Intellij, to run the test, go to the DuckDuckGoHomeTest class and click the little green arrow next to the line class DuckDuckGoHome
and select Run. 

It will open Chrome, go to "https://duckduckgo.com/" and then check for the logo on the page.

####What to learn next?
To build a reliable test suite, you'll need to learn about xPaths - as not all HTML elements have an ID.

Then you should look into PageObject models - as these are an industry standard.
