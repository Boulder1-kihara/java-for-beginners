# 📘 Day 2: Java Method Overloading

Welcome to Day 2! Today, we explore **Method Overloading**, a key aspect of compile-time polymorphism that helps keep your code intuitive, expressive, and concise.

---

## 🎯 What is Method Overloading?

In Java, **two or more methods can have the exact same name inside the same class**, provided their parameter lists differ.

Imagine you need to add numbers:
- Adding 2 numbers: `sum(int a, int b)`
- Adding 3 numbers: `sum(int a, int b, int c)`

Without method overloading, you'd be forced to invent clumsy method names like `sum2Numbers()` and `sum3Numbers()`. Overloading lets you use one unified, intuitive name: `sum()`.

---

## ⚖️ The Rules of Method Overloading

Java distinguishes between overloaded methods by looking at their **method signature** (name + parameter types):

### How to Overload:
1. **By changing the number of arguments:**
   ```java
   void display(int a) { ... }
   void display(int a, int b) { ... }
   ```
2. **By changing the data type of arguments:**
   ```java
   void display(int a) { ... }
   void display(String a) { ... }
   ```
3. **By changing the sequence of data types:**
   ```java
   void display(int a, String b) { ... }
   void display(String b, int a) { ... }
   ```

### ⚠️ What does NOT count as Overloading:
> **Changing the return type alone does NOT overload a method.**
> ```java
> int func(int a) { ... }
> double func(int a) { ... } // ❌ COMPILE ERROR: Duplicate method signature!
> ```
> The compiler wouldn't know which method to call if you wrote `func(10);`!

---

## ⚡ Compile-Time Polymorphism

Method overloading is also known as **Compile-Time Polymorphism** (or Static Binding). 
This is because the Java compiler determines *at compile-time* exactly which method version to execute based on the types and number of arguments provided in the call.

---

## 🗂️ Day 2 Source Code Files

| File | Description |
| :--- | :--- |
| [`OverloadingByParameterCount.java`](./src/OverloadingByParameterCount.java) | Overloading a method by changing the number of parameters. |
| [`OverloadingByParameterType.java`](./src/OverloadingByParameterType.java) | Overloading a method by passing different types (`int` vs `String`). |
| [`RealWorldHelperService.java`](./src/RealWorldHelperService.java) | Real-world example: A formatting service that formats integers, doubles, and string values differently. |
| [`PatternPrinter.java`](./src/PatternPrinter.java) | Practical pattern printing with default character (`*`) vs user-chosen character (`#`). |

---

## 💻 How to Compile and Run

```bash
cd day02-method-overloading/src

javac RealWorldHelperService.java
java RealWorldHelperService
```

### Expected Output:
```
Formatted int: 500
Formatted double: 89.993
Formatted String: 550.00
```
