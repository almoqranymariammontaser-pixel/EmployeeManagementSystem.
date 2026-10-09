# Employee Management System

## 📌 Project Overview

The Employee Management System is a Java application designed to manage employees and departments using Object-Oriented Programming (OOP) principles.

The project demonstrates inheritance, abstraction, encapsulation, polymorphism, and the use of Java collections.

## ✨ Features

* Manage different types of employees.
* Support Monthly, Hourly, and Commission-based employees.
* Calculate salaries according to each employee type.
* Organize employees into departments.
* Add and remove employees from departments.
* Find employees and display employee information.
* Calculate the total department payroll.

## 🏗️ Project Structure

```text
EmployeeManagementSystem/
├── src/
│   ├── Main.java
│   ├── README.md
│   ├── model/
│   │   ├── Employee.java
│   │   ├── Gender.java
│   │   ├── MonthlyEmployee.java
│   │   ├── HourlyEmployee.java
│   │   ├── CommissionEmployee.java
│   │   └── Department.java
│   └── test/
│       └── MainTest.java
├── .gitignore
└── README.md
```

## 🛠️ Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Java Collections Framework
* Git and GitHub

## 👥 Employee Types

### 1. Monthly Employee

Receives a monthly salary with a bonus percentage and other employee-related information.

### 2. Hourly Employee

Receives payment based on hours worked, including overtime.

### 3. Commission Employee

Receives a base salary plus commission based on sales.

## 🚀 How to Run the Project

Make sure the Java Development Kit (JDK) and Git are installed.

Open a terminal in the project root directory and run:

```bash
javac -d out src/model/*.java src/Main.java src/test/MainTest.java
java -cp out Main
java -cp out test.MainTest
```

## 📚 Concepts Demonstrated

* Abstract classes and methods
* Inheritance
* Encapsulation
* Polymorphism
* Enums
* ArrayList and collections
* Salary calculation
* Basic testing

## 👩‍💻 Author

**Mariam AlMoqrany**

## 📄 License

This project was developed for educational purposes.
