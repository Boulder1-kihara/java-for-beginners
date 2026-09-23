# 🧬 Day 4: Java Inheritance & The IS-A Relationship

Welcome to **Day 11** of the Java OOP Deep Dive! Today we master **Inheritance**, the cornerstone of code reuse and polymorphic hierarchies in Java.

---

## 📖 Key Concepts Explained

### 1. What is Inheritance?
**Inheritance** is an OOP mechanism that allows a new class to inherit attributes and methods from an existing class.
- **Subclass** (Child / Derived class): The class that inherits.
- **Superclass** (Parent / Base class): The class being inherited from.
- **`extends` keyword**: Used in Java to establish inheritance.

```java
class Superclass { ... }
class Subclass extends Superclass { ... }
```

### 2. The IS-A Relationship
In Java, inheritance represents an **IS-A** relationship. You should use inheritance only when the child class *is a* type of the parent class:
- 🚗 **Car IS-A Vehicle** (Inherit: `class Car extends Vehicle`)
- 🍊 **Orange IS-A Fruit** (Inherit: `class Orange extends Fruit`)
- 🩺 **Surgeon IS-A Doctor** (Inherit: `class Surgeon extends Doctor`)
- 🐕 **Dog IS-A Animal** (Inherit: `class Dog extends Animal`)

---

## 🌳 The 5 Types of Inheritance in Java

```
1. Single            2. Multilevel         3. Hierarchical
   ┌─────────┐          ┌─────────┐           ┌─────────┐
   │ Class A │          │ Class A │           │ Class A │
   └────┬────┘          └────┬────┘           └──┬───┬──┘
        │                    │                   │   │
        ▼                    ▼                   ▼   ▼
   ┌─────────┐          ┌─────────┐         ┌─────┐ ┌─────┐
   │ Class B │          │ Class B │         │  B  │ │  C  │
   └─────────┘          └────┬────┘         └─────┘ └─────┘
                             │
                             ▼
                        ┌─────────┐
                        │ Class C │
                        └─────────┘

4. Multiple (Via Interfaces)           5. Hybrid (Combined)
   ┌─────┐  ┌─────┐                        ┌─────────┐
   │  A  │  │  B  │                        │ Class A │
   └──┬──┘  └──┬──┘                        └──┬───┬──┘
      │        │                              │   │
      └────┬───┘                              ▼   ▼
           ▼                                ┌───┐ ┌───┐
     ┌───────────┐                          │ B │ │ C │
     │  Class C  │                          └──┬┘ └──┬┘
     │(implements)                          │   │
     └───────────┘                          └───┬───┘
                                                ▼
                                           ┌─────────┐
                                           │ Class D │
                                           └─────────┘
```

> [!NOTE]
> **Why Doesn't Java Support Multiple Inheritance with Classes?**
> To avoid the **Diamond Problem** (ambiguity when two parents define the same method with different implementations). Java achieves multiple inheritance safely through **Interfaces**.

---

## 💻 Code Examples in this Directory

| File | Concept Illustrated |
| :--- | :--- |
| [`BasicInheritanceDemo.java`](./src/BasicInheritanceDemo.java) | `Animal` superclass and `Dog extends Animal` subclass reusing fields and methods. |
| [`IsARelationshipDemo.java`](./src/IsARelationshipDemo.java) | Modeling real-world IS-A relationships: `Vehicle` -> `Car`, `Doctor` -> `Surgeon`. |
| [`MultilevelInheritanceDemo.java`](./src/MultilevelInheritanceDemo.java) | 3-tier inheritance chain: `Animal` -> `Mammal` -> `Dog`. |
| [`HierarchicalInheritanceDemo.java`](./src/HierarchicalInheritanceDemo.java) | Single superclass with multiple sibling subclasses: `Animal` -> `Dog` & `Cat`. |

---

## 🚀 How to Compile and Run

```bash
cd day04-inheritance-and-is-a/src
javac BasicInheritanceDemo.java
java BasicInheritanceDemo

javac IsARelationshipDemo.java
java IsARelationshipDemo

javac MultilevelInheritanceDemo.java
java MultilevelInheritanceDemo

javac HierarchicalInheritanceDemo.java
java HierarchicalInheritanceDemo
```
