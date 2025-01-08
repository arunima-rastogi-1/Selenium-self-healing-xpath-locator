# Cucumber TestNG Example

This repository demonstrates how to use **Cucumber** with **TestNG** to write and run behavior-driven development (BDD) tests in a Java project. The project uses **Maven** for dependency management and build automation.

## Features
- Integration of Cucumber with TestNG.
- Example feature files and step definitions.
- Maven-based project setup for seamless configuration.

## Prerequisites
- Java 8 or higher installed.
- Maven installed.
- Git installed.

## Getting Started
1. Clone the repository:
   ```bash
   git clone https://github.com/arunima-rastogi-1/Cucumber-TestNG-Example.git
   cd Cucumber-TestNG-Example```
   
2. Run tests:
   ```bash
   mvn test```

## Project Structure
src/main/java: Contains application code.
src/test/java: Contains Cucumber step definitions and TestNG test runners.
src/test/resources: Contains feature files written in Gherkin syntax.


## Dependencies
Key dependencies used in this project:
```bash
Cucumber
TestNG
Maven
```

## Test Execution
To execute tests using TestNG, the test runner class is configured with annotations to link feature files and step definitions.
Reports are generated automatically after the tests are run.
