# 📘 Day 6: Java Polymorphism & OOP

Welcome to Day 6! Today we study one of the four foundational pillars of Object-Oriented Programming (OOP): **Polymorphism**.

---

## 🎯 What is Polymorphism?

The word **Polymorphism** is derived from two Greek words:
- **Poly**: Many
- **Morph**: Forms

In programming, polymorphism is the ability of a single entity (such as a method, an operator, or an object reference) to perform different actions in different scenarios.

---

## 🧭 The Two Faces of Polymorphism in Java

Java supports polymorphism in two main flavors:

```
                  Java Polymorphism
                         │
        ┌────────────────┴────────────────┐
        ▼                                 ▼
Compile-Time Polymorphism        Runtime Polymorphism
(Static Binding)                 (Dynamic Method Dispatch)
- Method Overloading             - Method Overriding (@Override)
- Built-in Operator '+'
```

---

## 1. Runtime Polymorphism (Method Overriding)

Occurs during **Inheritance**:
- If a subclass defines a method with the **same name, same return type, and same parameters** as its superclass, the subclass **overrides** the superclass method.
- **Dynamic Method Dispatch**: The method that actually runs is determined at *runtime* depending on the actual object being referenced.

```java
class Polygon {
    public void render() { System.out.println("Rendering Polygon..."); }
}
class Square extends Polygon {
    @Override
    public void render() { System.out.println("Rendering Square..."); }
}
```

---

## 2. Polymorphic Variables

In Java, an object reference variable of a parent class can hold a reference to an instance of its child class:

```java
ProgrammingLanguage pl;

pl = new ProgrammingLanguage();
pl.display(); // Prints: I am Programming Language.

pl = new Java(); // Valid! Java IS-A ProgrammingLanguage
pl.display(); // Prints: I am Object-Oriented Programming Language.
```

Here, `pl` is a **polymorphic variable** because it refers to different object types under different conditions.

---

## 3. Operator Overloading in Java

Some operators in Java exhibit polymorphic behavior:
- The **`+` operator**:
  1. With numbers (`5 + 6`): Performs mathematical addition (`11`).
  2. With strings (`"Java " + "Programming"`): Performs string concatenation (`"Java Programming"`).

> ⚠️ **Note**: Unlike C++, Java **does not support user-defined operator overloading**. You cannot redefine what `+` or `*` does for custom classes.

---

## 🗂️ Day 6 Source Code Files

| File | Description |
| :--- | :--- |
| [`ShapePolymorphismDemo.java`](./src/ShapePolymorphismDemo.java) | The Polygon, Square, and Circle example showing consistent `render()` method behavior. |
| [`LanguageInheritanceDemo.java`](./src/LanguageInheritanceDemo.java) | Superclass `Language` and subclass `Java` demonstrating `@Override` and Dynamic Method Dispatch. |
| [`PolymorphicVariablesDemo.java`](./src/PolymorphicVariablesDemo.java) | Demonstrates how a single parent reference variable `pl` can point to different subclass objects. |
| [`OperatorOverloadingDemo.java`](./src/OperatorOverloadingDemo.java) | Illustrates Java's built-in polymorphism for the `+` operator with numbers vs strings. |

---

## 💻 How to Compile and Run

```bash
cd day06-polymorphism/src

javac ShapePolymorphismDemo.java
java ShapePolymorphismDemo
```

### Expected Output:
```
Rendering Square...
Rendering Circle...
```
