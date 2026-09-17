# 📘 Day 5: Java Multidimensional & Jagged Arrays

Welcome to Day 5! Today we explore **Multidimensional Arrays** (2D and 3D arrays), including a unique feature of Java: **Ragged (Jagged) Arrays**.

---

## 🎯 What is a Multidimensional Array?

In Java, a multidimensional array is simply an **array of arrays**. Each element in a multidimensional array is a reference to another array!

### 2D Array Syntax:
```java
int[][] a = new int[3][4]; // 3 rows, 4 columns (12 total elements)
```

Visual Layout:
```
           Col 0     Col 1     Col 2     Col 3
Row 0     a[0][0]   a[0][1]   a[0][2]   a[0][3]
Row 1     a[1][0]   a[1][1]   a[1][2]   a[1][3]
Row 2     a[2][0]   a[2][1]   a[2][2]   a[2][3]
```

---

## ⚡ Java Ragged (Jagged) Arrays

Unlike C/C++ where 2D arrays are strictly rectangular matrices in contiguous blocks, **Java rows can have completely different lengths**!

```java
int[][] a = {
    {1, 2, 3},       // Row 0 has 3 elements (length = 3)
    {4, 5, 6, 9},    // Row 1 has 4 elements (length = 4)
    {7}              // Row 2 has 1 element  (length = 1)
};
```

This flexibility saves memory when dealing with irregularly sized datasets.

---

## 🧊 3-Dimensional Arrays

A 3D array is an array of 2D arrays:
```java
String[][][] data = new String[3][4][2]; // 3 * 4 * 2 = 24 elements
```

Iterating through a 3D array requires 3 nested loops:
```java
for (int[][] plane : test) {
    for (int[] row : plane) {
        for (int item : row) {
            System.out.println(item);
        }
    }
}
```

---

## 🗂️ Day 5 Source Code Files

| File | Description |
| :--- | :--- |
| [`TwoDimensionalArrayDemo.java`](./src/TwoDimensionalArrayDemo.java) | Basics of 2D arrays, indexing, and calculating row lengths using `a[i].length`. |
| [`RaggedArrayDemo.java`](./src/RaggedArrayDemo.java) | Detailed demonstration of ragged/jagged arrays with varying row lengths. |
| [`TwoDArrayTraversal.java`](./src/TwoDArrayTraversal.java) | Comparing nested traditional `for` loops vs nested `for-each` loops. |
| [`ThreeDimensionalArrayDemo.java`](./src/ThreeDimensionalArrayDemo.java) | Declaring, initializing, and iterating through 3-dimensional arrays. |

---

## 💻 How to Compile and Run

```bash
cd day05-multidimensional-arrays/src

javac TwoDArrayTraversal.java
java TwoDArrayTraversal
```

### Expected Output:
```
1
-2
3
-4
-5
6
9
7
```
