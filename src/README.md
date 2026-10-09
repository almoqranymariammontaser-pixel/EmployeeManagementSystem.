
# Employee Management System

**Student Name:** YOUR FULL NAME

**Student ID:** YOUR STUDENT ID

## Project Description

A Java application that manages employees and departments.

The project demonstrates:
- Object-Oriented Programming (OOP)
- Inheritance and polymorphism
- Abstract classes and enums
- Constructors, getters, and setters
- Employee salary calculations
- Department employee management

## Project Structure

- `Employee.java`: Abstract base class
- `MonthlyEmployee.java`: Monthly salary employee
- `HourlyEmployee.java`: Hourly salary employee
- `CommissionEmployee.java`: Commission-based employee
- `Department.java`: Department management
- `Gender.java`: Gender enum
- `Main.java`: Main application
- `MainTest.java`: Additional test program

## Requirements

- Java JDK 21 or later

## How to Run

Open a terminal in the project root folder.

Compile the project:

`javac -d out src/model/*.java src/Main.java src/test/MainTest.java`

Run the main application:

`java -cp out Main`

Run the test program:

`java -cp out test.MainTest`