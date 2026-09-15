# 📘 Day 3: Java Recursion & The Call Stack

Welcome to Day 3! Today we unravel **Recursion**—one of computer science's most fascinating and powerful paradigms.

---

## 🎯 What is Recursion?

In Java, a method that **calls itself** is known as a **recursive method**, and this process is called **recursion**.

> **Mental Model**:
> Imagine standing between two parallel mirrors. You see an infinite reflection of reflections. 
> In programming, we need a way to "break the mirror" when we reach our goal—otherwise our code would call itself forever!

---

## 🛑 The Golden Rule of Recursion: Base Condition

Every recursive method **MUST** have two parts:
1. **Base Condition (Termination Condition)**: A condition that stops recursion and returns an immediate answer.
2. **Recursive Step**: The method calling itself with a smaller, simpler input that moves closer to the base condition.

If you omit the base condition, your program runs infinitely until the memory runs out, crashing with a **`java.lang.StackOverflowError`**.

---

## 🧱 The Call Stack: How Java Executes Recursion

Whenever a method is invoked, Java allocates a **Stack Frame** in the call stack containing local variables and return addresses.

Let's trace `factorial(4)`:

```
[Stack Growth - Calling Phase]
  Step 1: factorial(4) -> waits for 4 * factorial(3)
  Step 2: factorial(3) -> waits for 3 * factorial(2)
  Step 3: factorial(2) -> waits for 2 * factorial(1)
  Step 4: factorial(1) -> waits for 1 * factorial(0)
  Step 5: factorial(0) -> BASE CASE REACHED! returns 1

[Stack Unwinding - Returning Phase]
  Step 5 returns 1 to Step 4: 1 * 1 = 1
  Step 4 returns 1 to Step 3: 2 * 1 = 2
  Step 3 returns 2 to Step 2: 3 * 2 = 6
  Step 2 returns 6 to Step 1: 4 * 6 = 24
  Result = 24
```

---

## ⚖️ Advantages vs. Disadvantages of Recursion

| Advantages | Disadvantages |
| :--- | :--- |
| **Clean & Elegant**: Much simpler to write and read for divide-and-conquer problems (e.g., tree traversal, factorial). | **Memory Consumption**: Every call creates a new stack frame on the stack memory. |
| **Fewer Loop Counters**: Eliminates complex nested while/for state variables. | **Performance Overhead**: Function call overhead makes recursion slightly slower than simple iteration. |

---

## 🗂️ Day 3 Source Code Files

| File | Description |
| :--- | :--- |
| [`RecursionBasics.java`](./src/RecursionBasics.java) | A beginner-friendly countdown demonstrating how a base condition stops recursion. |
| [`FactorialRecursive.java`](./src/FactorialRecursive.java) | The canonical factorial example with step-by-step console logging showing the call stack. |
| [`FactorialChallenge.java`](./src/FactorialChallenge.java) | The challenge from the notes implementing `calculateFactorial(num)` with unit test cases. |

---

## 💻 How to Compile and Run

```bash
cd day03-recursion/src

javac FactorialChallenge.java
java FactorialChallenge
```

### Expected Output:
```
Testing calculateFactorial(5): Expected = 120, Actual = 120 -> PASS
Testing calculateFactorial(4): Expected = 24,  Actual = 24  -> PASS
Testing calculateFactorial(0): Expected = 1,   Actual = 1   -> PASS
```
