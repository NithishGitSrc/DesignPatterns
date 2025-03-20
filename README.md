# Design Patterns in Java

Welcome to the **Design Patterns Repository**, a comprehensive collection of design pattern implementations in Java. This repository serves as a learning resource for developers aiming to understand and apply design patterns effectively in real-world projects.

---

## 📌 Overview

Design patterns are essential in software development, providing reusable solutions to common problems. This repository is structured to demonstrate various **creational, structural, and behavioral** design patterns with well-documented Java implementations.

---

## 📁 Project Structure

The repository is organized by design pattern categories:
```
Design Patterns/
├── src/
│   ├── creational/
│   │   ├── singleton/
│   │   │   ├── thread_safe/
│   │   │   │   ├── Logger.java
│   │   │   │   ├── TicketReservation.java
│   │   │   │   └── User.java
│   │   │   └── ... (other singleton implementations)
│   │   ├── factory/
│   │   │   └── ...
│   │   └── ... (other creational patterns)
│   ├── structural/
│   │   ├── adapter/
│   │   │   └── ...
│   │   ├── decorator/
│   │   │   └── ...
│   │   └── ... (other structural patterns)
│   ├── behavioral/
│   │   ├── observer/
│   │   │   └── ...
│   │   ├── strategy/
│   │   │   └── ...
│   │   └── ... (other behavioral patterns)
│   └── Main.java
├── .gitignore
└── README.md
```


Each category contains subdirectories for individual patterns, where you’ll find Java source code along with necessary documentation.

---

## 📌 Implemented Design Patterns

### 🏗️ Creational Patterns
Patterns that focus on efficient object creation.

- **Singleton**  
  - Implemented a **thread-safe Singleton Logger** using **double-checked locking**.
  - Demonstrated usage through a **multithreaded Ticket Reservation system**.

- **Factory Method** *(To be added)*  
- **Abstract Factory** *(To be added)*  
- **Builder** *(To be added)*  
- **Prototype** *(To be added)*  

### 🏛️ Structural Patterns
Patterns that deal with class and object composition.

- **Adapter** *(To be added)*  
- **Decorator** *(To be added)*  
- **Facade** *(To be added)*  
- **Proxy** *(To be added)*  

### 🔄 Behavioral Patterns
Patterns that focus on communication between objects.

- **Observer** *(To be added)*  
- **Strategy** *(To be added)*  
- **Command** *(To be added)*  
- **State** *(To be added)*  

---

## ▶️ How to Run the Examples

### 1️⃣ Clone the Repository  
```bash
git clone <repository_url>
```

### 2️⃣ Navigate to the Project Directory

```bash
cd Design-Patterns
```

## 3️⃣ Compile and Run

**Using an IDE (IntelliJ IDEA, Eclipse, etc.):**

1.  Import the project as a Maven/Gradle project.
2.  Run `Main.java` or specific pattern implementations.

**Using the Command Line:**

1.  Compile Java files:

    ```bash
    javac -d out src/**/*.java
    ```

2.  Run the main class:

    ```bash
    java -cp out Main
    ```

## 4️⃣ Explore the Code

Browse the `src` directory to find implementations for various design patterns.

## 🤝 Contributing

Contributions are welcome! To contribute:

1.  Fork the repository.
2.  Create a new branch for your feature or bug fix.
3.  Commit your changes with a meaningful message.
4.  Push your branch to your forked repository.
5.  Submit a Pull Request for review.

## ✅ Coding Guidelines

* Follow the Google Java Style Guide.
* Maintain clean and well-documented code.
* Write unit tests wherever applicable.
* Use meaningful variable and method names.
* Commit messages should follow the format:

    ```
    <type>[optional scope]: <description>
    ```
