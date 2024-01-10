Selenium Automation Framework for 
    Travel Booking Platform
URL: https://flights.booking.com/

Overview
This repository contains an automated testing framework designed for the travel booking platform using Java and Selenium. The framework aims to provide a scalable,
maintainable, and platform-independent solution for testing flight search, selection, and booking processes.

Prerequisites
Before running the tests, ensure you have the following installed:

Java Development Kit (JDK)
Maven
Chrome Browser

Setup
1.Clone the repository:
command: git clone https://github.com/yourusername/travel-booking-automation.git

2.Navigate to the project directory:
command: cd travel-booking-automation

3.Install dependencies:
command: mvn clean install

Framework Structure
The framework follows the Page Object Model (POM) design pattern and includes:

src/main/java/BaseTest: BaseTest contains the BaseClass in which all the page objects are inheriting the common basic features from it.
src/main/java/PageObjects: It contains all the page clases representing the different Pages of an application.
                         /HomePage: Initial Page of the Flight Booking Application
                         /FlightSelect: page where we are going to select the customized Flight.
                         /ContactInformationPage: Here It takes the details of the travellers.
                         /SeatSelection: Selection of the Flight Tickets in this Page.
                         /DetailsVerification:After all the Flights and Details are selected It will be landed into the payment Page that gives the Information about the contact details,
                          traveller and the baggage details will be verified here.
src/main/java/Utilities/ReadPropertyFile: ReadPropertyFile, provides a method (getProperty1) for reading a specified key's value from a configuration file (Config.properties).
src/main/resources: It contains the Configuration Properties
src/test/java/BookingFlight: Test class implementing scenarios.
pom.xml: It contains configuration information related to the project's build process, dependencies, plugins, and other settings. 

Project Information:
Group ID: Identifies the project's group.
Artifact ID: Specifies the project's unique identifier.
Version: Represents the version of the project.

<groupId>org.example</groupId>
    <artifactId>AuzmorAutomatioFramework</artifactId>
    <version>1.0-SNAPSHOT</version>

Dependencies
Selenium WebDriver (4.14.0):
Selenium is a powerful tool for controlling web browsers through programs and performing browser automation.
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.14.0</version>
</dependency>


Log4j (1.2.17):
Log4j is a logging library for Java.
<dependency>
    <groupId>log4j</groupId>
    <artifactId>log4j</artifactId>
    <version>1.2.17</version>
</dependency>


JUnit (4.13.2):
JUnit is a simple framework to write repeatable tests.
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>


WebdriverManager (5.6.2):
WebDriverManager is a library that helps to automate the management of the binary drivers required by Selenium WebDriver.
<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>5.6.2</version>
</dependency>


TestNG (7.8.0):
TestNG is a testing framework inspired by JUnit and NUnit but introducing some new functionalities that make it more powerful and easier to use.
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.8.0</version>
    <scope>test</scope>
</dependency>

<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.8.0</version>
    <scope>compile</scope>
</dependency>


Apache POI (4.1.2):
Apache POI is a set of Java APIs to manipulate various file formats based on Microsoft Office standards.
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi</artifactId>
    <version>4.1.2</version>
</dependency>

<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi-ooxml</artifactId>
    <version>4.1.2</version>
</dependency>








