# 🧱 Day 6: `static`, `this`, and `final` Keywords

Welcome to **Day 13** of the Java OOP Deep Dive! Today we master three of the most essential keywords in Java that govern memory ownership, object referencing, and immutability: **`static`**, **`this`**, and **`final`**.

---

## 📖 Key Concepts Explained

### 1. The `static` Keyword (Class-Level Members)
- **Belongs to the class**, not individual instances/objects.
- Can be called directly via `ClassName.memberName` without using `new`.
- **Static Variables**: Shared across *all* instances of the class (single memory location).
- **Static Methods**: Can only access other static members directly (no `this` reference available).
- **Static Blocks**: Executed once when the class is first loaded into memory.

### 2. The `this` Keyword (Current Object Reference)
- Points to the **current object instance**.
- **Use Cases**:
  1. Resolving variable shadowing (when parameter name matches field name: `this.age = age`).
  2. In getters and setters (`this.name = name`).
  3. Invoking another constructor in the same class: `this(...)` (constructor chaining).
  4. Passing the current object as an argument: `someMethod(this)`.

### 3. The `final` Keyword (Immutability & Constraints)
- **Final Variable**: Constant value that can only be assigned once. By convention, named in `UPPER_SNAKE_CASE`.
- **Final Method**: Cannot be overridden by any subclass (`@Override` is prohibited).
- **Final Class**: Cannot be inherited/extended (e.g., `java.lang.String` is a final class).

---

## 💻 Code Examples in this Directory

| File | Concept Illustrated |
| :--- | :--- |
| [`StaticMembersDemo.java`](./src/StaticMembersDemo.java) | Static vs non-static methods & variables, static initialization blocks. |
| [`ThisKeywordMastery.java`](./src/ThisKeywordMastery.java) | Resolving name shadowing, constructor chaining with `this()`, passing `this`. |
| [`FinalKeywordDemo.java`](./src/FinalKeywordDemo.java) | Final variables, final methods (non-overridable), and final classes (non-inheritable). |

---

## 🚀 How to Compile and Run

```bash
cd day06-static-this-and-final/src
javac StaticMembersDemo.java
java StaticMembersDemo

javac ThisKeywordMastery.java
java ThisKeywordMastery

javac FinalKeywordDemo.java
java FinalKeywordDemo
```
