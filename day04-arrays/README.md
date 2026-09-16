# 📘 Day 4: Java Arrays (1D)

Welcome to Day 4! Today, we dive into **Arrays**—the foundational data structure in Java for storing collections of elements.

---

## 🎯 What is an Array?

An **array** is a collection of similar types of data stored in contiguous memory locations.
- **Fixed Size**: Once an array is created, its size cannot be changed.
- **Homogeneous**: All elements must be of the same data type (e.g., all `int`, all `String`, etc.).

```
Index:    [0]   [1]   [2]   [3]   [4]
Value:   | 12  |  4  |  5  |  2  |  5  |
```

---

## 📝 Declaration & Memory Allocation

In Java, array creation is a two-step process (which can be combined):

### 1. Declaration
```java
dataType[] arrayName; // e.g., double[] data;
```
This simply tells the compiler that `data` is a reference variable that will point to an array of `double`s. No memory is allocated yet!

### 2. Allocation
```java
arrayName = new dataType[size]; // e.g., data = new double[10];
```
The `new` keyword allocates memory for 10 `double` elements on the **Heap**.

### Combined Statement:
```java
double[] data = new double[10];
```

### Direct Initialization:
If you already know the values ahead of time:
```java
int[] age = {12, 4, 5, 2, 5}; // Java automatically figures out size is 5
```

---

## 🔢 Zero-Based Indexing

In Java, array indices **always start at 0**:
- First element: `array[0]`
- Last element: `array[array.length - 1]`
- Array size: `array.length` (note: `length` is a property, NOT a method like `length()`).

> ⚠️ **Common Trap**: Trying to access `array[array.length]` throws `java.lang.ArrayIndexOutOfBoundsException`!

---

## 🔁 Traversal: Standard `for` vs. Enhanced `for-each`

### 1. Traditional `for` Loop:
Best when you need the index number:
```java
for (int i = 0; i < age.length; i++) {
    System.out.println("Index " + i + ": " + age[i]);
}
```

### 2. Enhanced `for-each` Loop:
Best when you only care about values:
```java
for (int a : age) {
    System.out.println(a);
}
```

---

## 🗂️ Day 4 Source Code Files

| File | Description |
| :--- | :--- |
| [`ArrayDeclarationAndInit.java`](./src/ArrayDeclarationAndInit.java) | Shows array declaration, memory allocation with `new`, and inline literal initialization. |
| [`ArrayAccessAndLoops.java`](./src/ArrayAccessAndLoops.java) | Accessing elements by index, using `.length`, and comparing standard `for` vs `for-each`. |
| [`ArraySumAndAverage.java`](./src/ArraySumAndAverage.java) | Practical algorithm: computing sum, array length, and type casting `(double)` to compute average. |
| [`CalculateAverageChallenge.java`](./src/CalculateAverageChallenge.java) | Complete solution with edge case testing for the challenge from the lesson notes. |

---

## 💻 How to Compile and Run

```bash
cd day04-arrays/src

javac CalculateAverageChallenge.java
java CalculateAverageChallenge
```

### Expected Output:
```
Test with {10, 20, 30, 40} (size 4): Expected = 25.0 | Actual = 25.0 -> PASS
```
