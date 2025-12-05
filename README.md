Employee Team Manager – Java OOP Project
------------------------------------------------------------
A console-based Java application built using Gradle and solid
Object-Oriented Programming principles.

The system models a company team with Normal Employees and
Super Employees who can be assigned special powers. The project
follows strict separation between user interface (Menu) and
domain logic (Employee, Team, SuperPower, etc.).


PROJECT STRUCTURE
------------------------------------------------------------
src/main/java/
se/company/menu/        -> Menu system (only file allowed to use System.in/out)
se/company/resource/    -> Domain classes and logic

Menu      = handles input/output
Resource  = handles business logic (models, behavior, data)

This design follows clean architecture principles.


FEATURES IMPLEMENTED
------------------------------------------------------------

1) Gradle Project Setup
- Project initialized using "gradle init"
- Application runs with:
    ./gradlew run --console plain -q

2) Menu-Driven Console Application
Options:
1  Create new empty team
2  Add normal employee
3  Add predefined employees (John, Jane, JR)
4  Print out work being done
5  Add super employee
6  Add three super employees with powers
7  Salary report (optional)
m  Print menu
q  Quit program

Menu handles all I/O. No domain class prints directly.

3) Employee Model (UML-Based Design)
Employee (base class)
- name, work, salary (salary private)
- work() returns generic empty text
- toString() prints employee summary

NormalEmployee
- Extends Employee
- Overrides work() to describe actual work being done

SuperEmployee
- Extends Employee, salary = 0
- Holds a list of SuperPower objects
- addPower(), getPowers()
- Overrides work() and toString()

SuperPower
- type (ex: "Flight")
- description (ex: "Fly at supersonic speeds")
- usePower() returns formatted description of the power

4) Team Management
Team maintains a list of Employee objects.

Methods:
- add(Employee)
- toString(): prints all employees
- work(): prints:
    • The work of each employee
    • Additional lines for each superpower used

Uses polymorphism. Team does not know employee type in advance,
it simply calls work() and inspects the runtime type if needed.

5) Super Employee Power System
Option 6 in the menu demonstrates:
- Creating SuperEmployees
- Assigning multiple powers
- Adding them to the team

Example output:
Sup: Clark Kent is saving the day in IT.
    Using superpower: Flight - Fly at supersonic speeds.
    Using superpower: Strength - Really strong to lift a house.

Illustrates inheritance, composition, and dependency injection.


OPTIONAL FEATURES SUPPORTED
------------------------------------------------------------
(Architecture already supports these even if not implemented)

- Unique employee IDs using static counters
- Salary report summarizing monthly costs
- Javadoc generation using:
      ./gradlew javadoc
- UML extension and structured report writing


DESIGN PRINCIPLES FOLLOWED
------------------------------------------------------------

Encapsulation
- Private fields with controlled access

Inheritance
- NormalEmployee and SuperEmployee extend Employee

Polymorphism
- Team.work() uses overridden work() behavior dynamically

Composition
- SuperEmployee contains a list of SuperPower objects

Dependency Injection
- Menu creates SuperPower objects and injects them into SuperEmployee

Separation of Concerns
- Menu handles terminal I/O
- Domain classes handle logic only


RUNNING THE APPLICATION
------------------------------------------------------------

From the project root:
    ./gradlew run --console plain -q

Opening project in IntelliJ:
    code .


AUTHOR
------------------------------------------------------------
Vikram Khajuria
Software Development Student – HKR University

Focused on learning strong OOP fundamentals through
real-world Java projects and clean architectural design.
