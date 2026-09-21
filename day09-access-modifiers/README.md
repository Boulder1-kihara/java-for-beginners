# 🔒 Day 2: Java Access Modifiers & Visibility

Welcome to **Day 9** of the Java OOP Deep Dive! Today we learn how Java controls who can see and modify your code using **Access Modifiers** (also known as *Visibility Modifiers*).

---

## 📖 The 4 Java Access Modifiers

Java provides 4 levels of access control:

| Modifier | Within Same Class | Within Same Package | Subclass in Different Package | Everywhere (World) |
| :--- | :---: | :---: | :---: | :---: |
| **`private`** | ✅ Yes | ❌ No | ❌ No | ❌ No |
| **Default** *(package-private)* | ✅ Yes | ✅ Yes | ❌ No | ❌ No |
| **`protected`** | ✅ Yes | ✅ Yes | ✅ Yes *(via inheritance)* | ❌ No |
| **`public`** | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes |

---

## 🔍 Conceptual Breakdown

### 1. `private` (Class-Level Only)
- Accessible **only** within the class in which it is declared.
- Used to protect sensitive data from direct outside tampering.
- Access to private fields is provided through public **getters and setters**.
- *Rule*: Top-level classes cannot be private, but nested inner classes can.

### 2. Default (Package-Private)
- When **no modifier** is specified, Java uses the default access level.
- Visible to all classes within the **same package**, but completely hidden from any code outside the package.

### 3. `protected` (Package + Subclasses)
- Accessible by any class in the **same package**, PLUS by any **subclass** (child class) even if the subclass is in a different package.
- *Rule*: Top-level classes cannot be protected.

### 4. `public` (Everywhere)
- Accessible from any class, anywhere in the application with zero scope restrictions.

---

## 💻 Code Examples in this Directory

| File | Concept Illustrated |
| :--- | :--- |
| [`DefaultAccessDemo.java`](./src/DefaultAccessDemo.java) | Package-private members and package boundary visibility. |
| [`PrivateAccessDemo.java`](./src/PrivateAccessDemo.java) | Private variables, compiler error upon direct access, and getter/setter solution. |
| [`ProtectedAccessDemo.java`](./src/ProtectedAccessDemo.java) | Superclass `Animal` with `protected void display()` accessed by `Dog extends Animal`. |
| [`PublicAccessDemo.java`](./src/PublicAccessDemo.java) | Unrestricted access to public classes, public fields, and public methods. |

---

## 🚀 How to Compile and Run

```bash
cd day02-access-modifiers/src
javac DefaultAccessDemo.java
java DefaultAccessDemo

javac PrivateAccessDemo.java
java PrivateAccessDemo

javac ProtectedAccessDemo.java
java ProtectedAccessDemo

javac PublicAccessDemo.java
java PublicAccessDemo
```
