# 📦 Day 7: Java Packages & Directory Architecture

Welcome to **Day 14** of the Java OOP Deep Dive! Today we learn how Java organizes code into namespaces and file system hierarchies using **Packages** and **Import Statements**.

---

## 📖 Key Concepts Explained

### 1. What is a Package?
A **Package** is a container that groups related classes, interfaces, and sub-packages.
- **Namespace Reservation**: Prevents name collisions. For example, Java includes two different `Date` classes:
  - `java.util.Date`: General-purpose date.
  - `java.sql.Date`: Database-specific date.
- **Access Protection**: Package-private access restricts visibility to classes inside the same package.
- **Maintainability**: Makes large applications modular and easy to navigate.

### 2. Package Naming Conventions
Java packages use the **reverse domain name** convention to guarantee global uniqueness:
```
com.companyname.projectname.module
```
On your file system, every dot (`.`) corresponds to a subdirectory:
```
src/
└── com/
    └── learning/
        ├── utils/
        │   └── Helper.java         -> package com.learning.utils;
        ├── models/
        │   └── Student.java        -> package com.learning.models;
        └── main/
            └── MainApp.java        -> package com.learning.main;
```

### 3. How to Import Packages
- **Specific Class**: `import com.learning.utils.Helper;`
- **Entire Package**: `import com.learning.utils.*;`
- **Fully Qualified Name**: `com.learning.utils.Helper.getFormattedDollar(50.0);`

---

## 💻 Code Examples in this Directory

| File | Package | Purpose |
| :--- | :--- | :--- |
| [`Helper.java`](./src/com/learning/utils/Helper.java) | `com.learning.utils` | Reusable utility method for currency formatting (`getFormattedDollar`). |
| [`Student.java`](./src/com/learning/models/Student.java) | `com.learning.models` | Encapsulated model class representing student data. |
| [`MainApp.java`](./src/com/learning/main/MainApp.java) | `com.learning.main` | Application entry point importing and integrating classes from other packages. |

---

## 🚀 How to Compile and Run Packages

When compiling code with package declarations, always use the `-d` flag with `javac` to automatically generate the required directory structure:

```bash
cd day07-packages-and-imports/src

# 1. Compile all packages into a target directory (e.g., current directory '.')
javac -d . com/learning/utils/Helper.java com/learning/models/Student.java com/learning/main/MainApp.java

# 2. Run the main class using its fully qualified name:
java com.learning.main.MainApp
```
