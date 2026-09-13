# 📘 Day 1: Java Methods Fundamentals

Welcome to Day 1! Today, you will learn one of the most fundamental building blocks of programming: **Methods** (often called functions in other languages).

---

## 🎯 What is a Method?

A **method** is a block of code designed to perform a specific task. 

Imagine you are building a drawing application. You might need:
1. A block of code to **draw a circle**.
2. A block of code to **color the circle**.

Instead of writing all this logic in one giant tangled mess, you break it down into smaller, self-contained chunks.

### Key Benefits:
- **Code Reusability**: Write once, reuse as many times as you want without duplicating lines.
- **Readability**: Makes your program clean, organized, and easy to read.
- **Maintainability & Debugging**: If something goes wrong, you only need to check the specific method.

---

## 🔍 Anatomy of a Java Method

Here is the complete syntax to declare a method in Java:

```java
modifier static returnType methodName(parameter1, parameter2, ...) {
    // Method body (the code statements to execute)
    return value; // (required if returnType is not void)
}
```

### Breakdown of Terms:
1. **`modifier`**: Specifies access level (e.g., `public`, `private`, `protected`). `public` means it is accessible from anywhere.
2. **`static`**: Indicates that the method belongs to the class itself rather than an instance (object) of the class. If a method is `static`, you can call it directly without creating an object with `new`.
3. **`returnType`**: The type of data the method gives back after finishing (e.g., `int`, `double`, `String`). If the method does not return any value, use the keyword **`void`**.
4. **`methodName`**: A meaningful identifier used to call the method (by convention, written in `camelCase`, like `calculateTotal()`).
5. **`parameters`**: Variables listed in the method signature that accept incoming values.
6. **`method body`**: The code between the curly braces `{ ... }` that runs when the method is invoked.

---

## 🔄 Formal Parameters vs. Actual Arguments

Beginners often confuse **parameters** and **arguments**:

```
Method Definition:
  public int addNumbers(int a, int b)   <-- 'a' and 'b' are FORMAL PARAMETERS (placeholders)

Method Call:
  obj.addNumbers(25, 15);               <-- 25 and 15 are ACTUAL ARGUMENTS (real values)
```

Because Java is a **strongly typed language**, the data type of the actual argument must match the formal parameter. Passing a `String` into an `int` parameter will cause a compile-time error.

---

## 🗂️ Day 1 Source Code Files

| File | Description |
| :--- | :--- |
| [`BasicsOfMethods.java`](./src/BasicsOfMethods.java) | Shows how to declare methods, use return values, and call non-static methods via objects. |
| [`MethodParameters.java`](./src/MethodParameters.java) | Compares methods without parameters vs single/multiple parameters. |
| [`CodeReusabilityDemo.java`](./src/CodeReusabilityDemo.java) | Demonstrates the "Write Once, Reuse Many Times" principle using a loop. |
| [`StandardLibraryMethods.java`](./src/StandardLibraryMethods.java) | Demonstrates Java's built-in standard library methods (e.g., `Math.sqrt()`). |

---

## 💻 How to Compile and Run

Open your terminal or command prompt:

```bash
cd day01-methods/src

# Compile any file:
javac BasicsOfMethods.java

# Run the compiled bytecode:
java BasicsOfMethods
```

### Expected Output for `BasicsOfMethods`:
```
Sum is: 40
Squared value of 10 is: 100
```
