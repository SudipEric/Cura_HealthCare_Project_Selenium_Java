# Cura_HealthCare_Project_Selenium_Java

**Overview**

This project is an Enterprise-level Test Automation Framework developed using Selenium WebDriver, Java, Cucumber (BDD), and TestNG to automate the Cura Healthcare Service web application.
The framework follows the Page Object Model (POM) design pattern and supports Behavior-Driven Development (BDD) using Cucumber for better readability, maintainability, and collaboration between technical and non-technical stakeholders.


**Tech Stack**

Language: Java
Automation Tool: Selenium WebDriver
BDD Framework: Cucumber
Test Runner: TestNG
Build Tool: Maven
Design Pattern: Page Object Model (POM)
Reporting: Cucumber HTML Reports
IDE: Eclipse


**Framework Architecture**
 
CuraHealthcare
│
├── src/test/java
│   ├── Pages
│   │    ├── HomePage_PF.java
│   │    ├── LoginPage_PF.java
│   │    ├── AppointmentPage_PF.java
│   │    ├── ConfirmationPage_PF.java
│   │    ├── HistoryPage_PF.java
│   │    ├── ProfilePage_PF.java
│   │    ├── OptionMenu_PF.java
│   │    ├── Common.java
│   │    └── Urls.java
│   │
│   ├── StepDefinitions
│   │    └── AppointmentSteps.java
│   │
│   ├── Hooks
│   │    └── Hooks.java
│   │
│   └── Runner
│        └── TestRunner.java
│
├── src/test/resources
│   ├── Features
│   │    └── HomePage.feature
│   │
│   └── driver
│        └── chromedriver.exe
│
└── pom.xml


**Features Automated:**

User Login
Book Appointment
Select Facility
Select Healthcare Program
Enter Visit Date and Comments
Confirm Appointment
View Appointment History
View Profile
Logout


**Framework Design Highlights**

**Page Object Model (POM)**

Each page has its own class containing:
Web elements
Page methods
Page validations

Example:
LoginPage_PF.java
AppointmentPage_PF.java
ConfirmationPage_PF.java

**Cucumber BDD Integration**

Feature file example:

Feature: Appointment Booking
Scenario: Book appointment successfully
   Given user is on the homepage
   When user clicks on the Make Appointment
   And user enters username "John Doe"
   And user enters password "ThisIsNotAPassword"
   Then user is on the Appointment Page

**Hooks Implementation**

Hooks are used for:

Browser setup before scenario
Browser teardown after scenario

@Before
public void setup()
 
@After
public void teardown()

**Test Runner**

TestNG is used as the test runner.
 
@CucumberOptions(
    features="src/test/resources/Features",
    glue={"StepDefinitions","Hooks"},
    plugin={"pretty","html:target/html-reports.html"},
    monochrome=true
)


**How to Run the Project**

Prerequisites
Java 8 or higher
Maven installed
Chrome browser installed
ChromeDriver compatible version
Eclipse


**Steps to Execute**

1. Clone the repository
   git clone https://github.com/SudipEric/Cura_HealthCare_Project_Selenium_Java.git
2. Open project in Eclipse
3. Update Maven dependencies
   Right click project → Maven → Update Project
4. Run TestRunner
   Right click TestRunner.java → Run As → TestNG Test


**Reports**

After execution, report will be generated at:
 
target/html-reports.html


**Key Automation Concepts Used**

* Selenium WebDriver
* Page Object Model
* Cucumber BDD
* TestNG Integration
* Hooks Implementation
* Explicit Waits
* Assertions and Validations
* Modular Framework Design


**Author**

Sudip Kar
QA Automation Engineer

GitHub:
https://github.com/SudipEric⁠�


**Future Enhancements**

Parallel execution
Cross-browser testing
Screenshot capture on failure
CI/CD integration (Jenkins)
Extent Reports integration
Docker support
