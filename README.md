## Introduction

The purpose of this project is to provide a simulation of a process in which different kinds of coffee are produced in a setting similar to a coffee shop. In this program, the user interfaces with a Barista (a person who prepares the drink) through a console, along with selecting coffee intensity and ordering a drink, some examples of drinks include, an Americano, Cappuccino, or a Pumpkin Spice Latte. The project also illustrates the concepts of object-oriented programming such as abstraction, inheritance, polymorphism, and interface segregation in Java.

## Theory
The program applies Object-Oriented Programming (OOP) principles to model real-world entities:
	•	Encapsulation — each class hides its implementation details and exposes only necessary methods (for example, Barista handles drink preparation, while ConsoleUI deals with user interaction).
	•	Inheritance — classes such as Americano, Cappuccino, and PumpkinSpiceLatte inherit from a base class Coffee.
	•	Polymorphism — the same method prepare() behaves differently depending on the coffee type.
	•	Abstraction — Coffee is an abstract representation of a drink, defining a common interface for all subclasses.

These concepts are reinforced by the SOLID principles, ensuring flexibility, maintainability, and scalability of the code

 ## Description of the Project (SOLID Implementation)
 
### 1.Single Responsibility Principle (SRP)
Each class has one clear purpose:
	•	Coffee — defines properties and behavior of coffee drinks.
	•	Barista — responsible for preparing and serving coffee.
	•	ConsoleUI — handles user interaction.
	•	InputProvider and ConsoleInput — manage input logic.
### 2.	Open/Closed Principle (OCP)
The system is open for extension but closed for modification.
Adding a new drink (e.g., Latte.java) doesn’t require changing existing classes — just extend Coffee and override its methods.
### 3.	Liskov Substitution Principle (LSP)
Any subclass of Coffee can replace the parent type without breaking the system.
For instance, a Barista can prepare any Coffee type — Cappuccino, Americano, etc. — without needing to know their internal details.

## Conclusion
This example demonstrates the benefits of using the SOLID principles in Java when creating clean, modular, reusable code. The system is easily extendable for new drink types or UI components without breaking the original logic of the program. It serves as a pedagogical example of structuring an object-oriented design in a small but coherent application.
