# Java Basics & Debugging Assessment

A beginner-friendly Java assessment project designed to test fundamentals including data types, conditional structures, loops (standard and for-each), and troubleshooting logic bugs. 

This project is configured using **Maven** and includes automated unit tests via **JUnit 5** to verify your solutions.

---

## 📂 Project Structure

The repository follows the standard Maven directory layout architecture:

```text
java-basics-assessment/
├── pom.xml                               # Maven configuration & dependencies
├── README.md                             # Documentation and instructions
└── src/
    ├── main/java/JavaAssessment.java     # Target file where you write your code
    └── src/test/java/JavaAssessmentTest.java # Unit tests to verify your solutions
🚀 Getting Started & Workflow
1. Requirements
Make sure you have the Java Development Kit (JDK 17 or higher) and Maven installed on your machine.

2. Implementation Tasks
Open src/main/java/JavaAssessment.java and complete the following five methods:

Question 1 (fizzBuzzSa): A modified FizzBuzz counting loop mapping South African language milestones.

Question 2 (loadSheddingSchedule): Array filtration logic without using stream utilities.

Question 3 (computeFare): Debugging logical errors and arithmetic typos in a taxi fare calculator.

Question 4 (atmWithdrawal): Validating compound financial boundary criteria.

Question 5 (checkStudentPass): Fixing integer division bugs and logical expressions within educational passing rubrics.

🛠️ Essential Maven Commands
Run these commands from your terminal at the root directory of the project:

Compile the Code
To check if your syntax is valid and compiles cleanly without errors:

Bash
mvn compile
Run Automated Tests
To run the automated JUnit test suite against your solutions:

Bash
mvn test
Clean the Target Workspace
If you want to clear out old compilation artifacts and cache before starting fresh:

Bash
mvn clean

Run the Entire Test Suite
To run all tests across every file simultaneously:

mvn test

Run All Tests inside One Specific File
If you have multiple test files but only want to run the tests inside JavaAssessmentTest:

mvn test -Dtest=JavaAssessmentTest

Run a Single, Specific Question Test
If you are working on a single problem and want to run only that specific test method without running the others, use this format: Class#methodName

To test Question 1 (fizzBuzzSa):
mvn test -Dtest=JavaAssessmentTest#testFizzBuzzSa

To test Question 2 (loadSheddingSchedule):
mvn test -Dtest=JavaAssessmentTest#testLoadSheddingSchedule

To test Question 3 (computeFare):
mvn test -Dtest=JavaAssessmentTest#testComputeFare

To test Question 4 (atmWithdrawal):
mvn test -Dtest=JavaAssessmentTest#testAtmWithdrawa[

To test Question 5 (checkStudentPass):
mvn test -Dtest=JavaAssessmentTest#testCheckStudentPass

GOODLUCK!!
