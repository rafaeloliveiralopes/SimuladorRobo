# Robot Simulator

> [Versão em Português (pt-BR)](README.md)

## About the Project

This project was developed as part of the Object-Oriented Programming (OOP) studies in Java, Unit II, Lesson II (Decision Structures, Control and Loops) from the Software Engineering course. The main goal is to **simulate** a robot operating in a 2D environment, using classes, objects, and decision/loop structures to demonstrate basic OOP concepts.

## Table of Contents

1. [Technologies and Tools](#technologies-and-tools)
2. [Project Goals](#project-goals)
3. [Implemented Features](#implemented-features)
4. [How to Run](#how-to-run)
5. [Future Improvements](#future-improvements)
6. [Contribution](#contribution)
7. [Contact](#contact)

---

## Technologies and Tools

- **Java**: Version 17
- **Maven**: Version 3.8.7 (or later)
- **IDE**: Visual Studio Code

---

## Project Goals

- **Practice Java OOP concepts**: creation of classes, objects, constructors, methods, and attributes.
- **Model entities** (robot, box, 2D world), based on the assignment requirements.
- **Simulate robot movements** in a square pattern, manipulating x and y coordinates.
- **Demonstrate the use of decision structures** (`if/else`, `switch-case`) and nested loops (`for`).

---

## Implemented Features

1. **Mundo2D Class**

   - [x] Represents the "room" or environment where the robot moves, with x and y dimensions.

2. **Caixa (Box) Class**

   - [x] Models boxes in the environment, including attributes such as item name, quantity, and dimensions (height, width, weight, etc.).

3. **Robo (Robot) Class**

   - [x] Contains position (X, Y) and orientation (FRONT, BACK, RIGHT, LEFT).
   - [x] Includes a method to move (`move(int, int)`) and print the current position (`printPosicao()`).
   - [x] Uses decision structures to adjust orientation based on keyboard input (w, a, s, d).

4. **App (main) Class**
   - [x] Contains two nested `for` loops, controlling direction and number of steps the robot takes.
   - [x] Uses `switch-case` to move the robot along the (x, y) axes, forming a square path.

---

## How to Run

1. **Clone or download** this repository:
   ```bash
   git clone https://github.com/rafaeloliveiralopes/SimuladorRobo.git
   cd SimuladorRobo
   ```
2. **Build** the project using Maven or a compatible Java IDE.
   - Example using Maven in the terminal:
     ```bash
     mvn clean install
     mvn exec:java -Dexec.mainClass="com.roboproject.App"
     ```
3. **Observe the output** in the console, checking the robot's position at each movement step.

---

## Future Improvements

- [ ] **Effective integration between orientation and movement**: Instead of absolute coordinates in `App.java`, the robot could use its constants (FRONT, BACK, etc.) to automatically update `X` and `Y`.
- [ ] **Limit movement to Mundo2D**: Prevent the robot from exceeding the defined boundaries of the environment.
- [ ] **Object interaction**: Create methods for the robot to detect and interact with boxes (e.g., pick up an item or display box data).
- [ ] **User input**: Allow real-time orientation control by collecting keyboard input within `main` or via a graphical interface.
- [ ] **Unit Tests**: Add unit tests to validate the `Robo`, `Caixa`, and `Mundo2D` classes.

---

## Contribution

This project **demonstrates the use of OOP in Java** in a clear and educational way, serving as a starting point for more complex projects in the future.

All contributions are welcome. Feel free to open **issues** and **pull requests** with suggestions for improvements or corrections.

---

## Contact

🔹 **Author**: Rafael Oliveira Lopes  
🔹 **Email**: rafaellopes.dev@email.com  
🔹 **LinkedIn**: [linkedin.com/in/rafael-lopes-desenvolvedor-fullstack/](https://www.linkedin.com/in/rafael-lopes-desenvolvedor-fullstack/)  
🔹 **Website**: [rafaellopes.dev](https://rafaellopes.dev)
