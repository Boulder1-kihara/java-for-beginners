# 💡 Day 1: Classes, Objects & Constructors

Welcome to **Day 8** of the Java OOP Deep Dive! Today we explore the fundamental building blocks of Object-Oriented Programming: **Classes**, **Objects**, and **Constructors**.

---

## 📖 Key Concepts Explained

### 1. What is a Class?
A **Class** is a blueprint or template from which individual objects are created. It defines:
- **Fields (State/Attributes)**: Data that objects hold (e.g., `gear`, `speed`, `isOn`).
- **Methods (Behavior)**: Actions that objects can perform (e.g., `turnOn()`, `speedUp()`, `applyBrake()`).

### 2. What is an Object?
An **Object** is an instance of a class. It occupies memory in the **Heap** and has its own distinct copy of instance variables.

```
       STACK MEMORY                         HEAP MEMORY
 ┌─────────────────────┐             ┌─────────────────────────┐
 │  myBike (reference) ├────────────►│ Bicycle Object          │
 ├─────────────────────┤             │  • gear = 5             │
 │  lamp1  (reference) ├──────┐      │  • speed = 25           │
 └─────────────────────┘      │      └─────────────────────────┘
                              │      ┌─────────────────────────┐
                              └─────►│ Lamp Object             │
                                     │  • isOn = true          │
                                     └─────────────────────────┘
```

### 3. What is a Constructor?
A **Constructor** is a special method used to initialize objects when they are created using the `new` keyword:
- Has the **exact same name** as the class.
- Has **no return type** (not even `void`).
- If you don't define any constructor, the Java compiler automatically provides a **default no-argument constructor**.
- You can **overload constructors** with different parameter lists.
- You can use `this(...)` to invoke one constructor from another (known as **constructor chaining**).

---

## 💻 Code Examples in this Directory

| File | Core Focus |
| :--- | :--- |
| [`Lamp.java`](./src/Lamp.java) | Modeling binary state (`isOn`), instance methods, state transitions. |
| [`Bicycle.java`](./src/Bicycle.java) | Parameterized constructors, instance fields, state updates. |
| [`ConstructorChainingDemo.java`](./src/ConstructorChainingDemo.java) | Default vs parameterized constructors, `this()` explicit constructor invocation. |

---

## 🚀 How to Compile and Run

Open your terminal in this directory:
```bash
cd day01-classes-and-constructors/src
javac Lamp.java
java Lamp

javac Bicycle.java
java Bicycle

javac ConstructorChainingDemo.java
java ConstructorChainingDemo
```
