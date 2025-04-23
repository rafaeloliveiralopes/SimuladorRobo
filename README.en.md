![Robot Project Banner](https://github.com/user-attachments/assets/4cfc9f99-497b-4120-9ee6-40d67677ed3e)

# Robot Simulator

> [Versão em Português (pt-BR)](README.md)

---

## About the Project

This project was developed as part of the Object-Oriented Programming (OOP) module in Java, Unit II, Lesson II (Decision Structures, Control, and Loops) from the Software Engineering course. Its main goal is to simulate the operation of a robot in a 2D environment using classes, objects, and control structures to demonstrate fundamental OOP concepts.

---

## Table of Contents

- [Technologies and Tools](#technologies-and-tools)
- [Project Goals](#project-goals)
- [Implemented Features](#implemented-features)
- [How to Run](#how-to-run)
- [Interactive Mode](#interactive-mode)
- [Future Improvements](#future-improvements)
- [Conclusion](#conclusion)
- [Contact](#contact)

---

## Technologies and Tools

- Java: Version 17
- Maven: Version 3.8.7
- IDE: IntelliJ IDEA

---

## Project Goals

- Practice core OOP concepts in Java: creating classes, objects, constructors, methods, and attributes.
- Model entities (robot, box, 2D world) as described in the project prompt.
- Simulate robot movement on a two-dimensional plane by manipulating x and y coordinates.
- Demonstrate the use of control structures (`if/else`, `switch-case`) and loops (`while`, `for`).

---

## Implemented Features

### 🔹 `Mundo2D` Class
- Represents the environment where the robot moves, with x and y dimensions.

### 🔹 `Caixa` Class
- Models boxes in the environment, including attributes such as name, quantity, and physical dimensions (height, width, weight, etc.).

### 🔹 `Robo` Class
- Robot with position (x, y), orientation (`FRENTE`, `TRAS`, `DIREITA`, `ESQUERDA`), speed, traction type, and cargo.
- Methods for movement and position display.
- Implements keyboard-based movement logic.

### 🔹 `App` Class (main)
- Interprets command-line arguments (`--help`, `--author`, etc.).
- Includes an **interactive mode**, activated with `--move`, enabling real-time keyboard control of the robot.

---

## How to Run

### 🔹 Clone the repository:
```bash
git clone https://github.com/rafaeloliveiralopes/SimuladorRobo.git
cd SimuladorRobo
```

### 🔹 Compile with Maven:
```bash
mvn clean compile
```

### 🔹 Run with arguments:
```bash
# Display the author's name
java -cp target/classes com.roboproject.App --author

# Display available commands
java -cp target/classes com.roboproject.App --help
```

---

## Interactive Mode

### 🔹 Start interactive mode:
```bash
java -cp target/classes com.roboproject.App --move
```

### 🔹 Available commands in interactive mode:
- `w` → move the robot forward
- `a` → move the robot left
- `s` → move the robot backward
- `d` → move the robot right
- `1` → display the robot's current position
- `0` → exit the program

### 🧠 Tip:
Interactive mode allows real-time control and simulation of robot movement. The robot's position is updated after each command input.

---

## Future Improvements

- **Limit movement within the 2D world**: prevent the robot from exceeding defined boundaries.
- **Box collision detection**: enable the robot to interact with objects in the environment.
- **Graphical user interface (GUI)** for visual representation of movements.
- **Unit testing (JUnit)** to validate the behavior of classes.

---

## Conclusion

This project is a practical application of core **Object-Oriented Programming (OOP)** principles in Java, aligned with the topics covered in the academic module:

- **Creation and use of classes and objects** (`Robo`, `Caixa`, `Mundo2D`);
- **Encapsulation of attributes and methods** using getters and setters;
- **Inheritance and abstraction** through the abstract classes `RoboIdeia` and `CaixaIdeia`;
- **Use of enums** to represent constant values (`Orientacao`);
- **Method overriding (`@Override`)** and polymorphism;
- **Constructor overloading** for reuse and specialization;
- **Control structures** (`if`, `switch-case`, `while`);
- **User input with `Scanner`** for interactive keyboard control;
- **Formatted output with `System.out.printf`** for readable status display;
- **Input validation and exception handling** (`IllegalArgumentException`).

The project is modular, reusable, and extensible. Future features such as graphics, collision detection, and test automation can be easily integrated.

---

## Contact
🔹 **Author:** Rafael Oliveira Lopes  
🔹 **Email:** rafaellopes.dev@email.com  
🔹 **LinkedIn:** [LinkedIn](https://www.linkedin.com/in/rafael-lopes-desenvolvedor-fullstack/)  
🔹 **Website:** [rafaellopes.dev](https://rafaellopes.dev)

