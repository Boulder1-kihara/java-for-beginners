# ⚡ Day 5: Method Overriding & The `super` Keyword

Welcome to **Day 12** of the Java OOP Deep Dive! Today we explore **Method Overriding** (runtime polymorphism) and the 3 distinct powers of the **`super` keyword**.

---

## 📖 Key Concepts Explained

### 1. What is Method Overriding?
When a subclass defines a method that has the **exact same name, return type, and parameter list** as a method in its superclass, the subclass method **overrides** the parent method.
- At runtime, Java uses **dynamic method dispatch** to call the overridden method based on the actual object type in memory.
- The `@Override` annotation instructs the compiler to verify that you are indeed overriding a valid parent method.

### 2. The 3 Uses of the `super` Keyword

| Use Case | Syntax | What It Does |
| :--- | :--- | :--- |
| **1. Call Superclass Method** | `super.methodName()` | Executes the parent's version of a method that has been overridden in the child. |
| **2. Access Superclass Field** | `super.fieldName` | Accesses a parent field when the child class declares a field with the exact same name (shadowing). |
| **3. Call Superclass Constructor** | `super(...)` | Explicitly invokes the parent class constructor. **MUST be the first line** in the child constructor! |

```
 ┌───────────────────────────────────────────────────────────┐
 │ Subclass Constructor:                                     │
 │                                                           │
 │   Dog() {                                                 │
 │       super("Canine");   ◄─── MUST BE FIRST STATEMENT!    │
 │       this.breed = ...;                                   │
 │   }                                                       │
 └───────────────────────────────────────────────────────────┘
```

---

## 💻 Code Examples in this Directory

| File | Concept Illustrated |
| :--- | :--- |
| [`MethodOverridingDemo.java`](./src/MethodOverridingDemo.java) | `Animal.eat()` overridden by `Dog.eat()` ("I eat dog food") with `@Override`. |
| [`SuperMethodCallDemo.java`](./src/SuperMethodCallDemo.java) | Calling both local child method and `super.display()` to chain parent behavior. |
| [`SuperFieldAccessDemo.java`](./src/SuperFieldAccessDemo.java) | Resolving field shadowing: `type` (subclass) vs `super.type` (superclass). |
| [`SuperConstructorDemo.java`](./src/SuperConstructorDemo.java) | Passing arguments to parent parameterized constructor using `super(...)`. |

---

## 🚀 How to Compile and Run

```bash
cd day05-the-super-keyword/src
javac MethodOverridingDemo.java
java MethodOverridingDemo

javac SuperMethodCallDemo.java
java SuperMethodCallDemo

javac SuperFieldAccessDemo.java
java SuperFieldAccessDemo

javac SuperConstructorDemo.java
java SuperConstructorDemo
```
