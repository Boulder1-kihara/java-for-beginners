# ☕ Java for Beginners: 14-Day Hands-On Bootcamp & OOP Mastery

Welcome to the **14-Day Java Bootcamp & OOP Mastery** repository! This repository is designed from the ground up for aspiring developers, computer science students, and anyone starting their journey with Java.

Every single line of code in this repository includes clear explanations, practical real-world scenarios, visual ASCII memory maps, and step-by-step challenges so you can learn with zero prior confusion.

---

## 📅 14-Day Learning Roadmap

### 🌟 Week 1: Core Fundamentals & GUI (Days 1 – 7)

| Day | Topic | Key Concepts | Code Examples & Challenges |
| :--- | :--- | :--- | :--- |
| **[Day 1](./day01-methods/)** | **Java Methods Fundamentals** | Definition, syntax, `void` vs return types, parameters vs arguments, code reusability | `BasicsOfMethods.java`<br>`MethodParameters.java`<br>`CodeReusabilityDemo.java`<br>`StandardLibraryMethods.java` |
| **[Day 2](./day02-method-overloading/)** | **Method Overloading** | Overloading rules, compile-time polymorphism, real-world formatting services | `OverloadingByParameterCount.java`<br>`OverloadingByParameterType.java`<br>`RealWorldHelperService.java`<br>`PatternPrinter.java` |
| **[Day 3](./day03-recursion/)** | **Recursion & Call Stack** | Self-calling methods, base conditions, call stack memory visualization, factorial | `RecursionBasics.java`<br>`FactorialRecursive.java`<br>`FactorialChallenge.java` |
| **[Day 4](./day04-arrays/)** | **Java Arrays (1D)** | Array memory allocation, zero-based indexing, `for` vs `for-each`, calculating average | `ArrayDeclarationAndAccess.java`<br>`ArrayAccessAndLoop.java`<br>`ArraySumAndAverage.java`<br>`CalculateAverageChallenge.java` |
| **[Day 5](./day05-multidimensional-arrays/)** | **Multidimensional & Ragged Arrays** | 2D matrices, ragged/jagged arrays, 3D arrays, nested loops | `TwoDimensionalArrayDemo.java`<br>`RaggedArrayDemo.java`<br>`TwoDArrayTraversal.java`<br>`ThreeDimensionalArrayDemo.java` |
| **[Day 6](./day06-polymorphism/)** | **Java Polymorphism** | Runtime polymorphism (`@Override`), compile-time polymorphism, polymorphic variables | `ShapePolymorphismDemo.java`<br>`LanguageInheritanceDemo.java`<br>`PolymorphicVariablesDemo.java`<br>`OperatorOverloadingDemo.java` |
| **[Day 7](./day07-swing-gui/)** | **Java GUI with Swing & AWT** | AWT vs Swing, MVC pattern, component hierarchy, buttons, checkboxes, full UI showcase | `AwtButtonDemo.java`<br>`AwtCheckboxDemo.java`<br>`SwingFirstApp.java`<br>`SwingComponentsShowcase.java` |

---

### 🚀 Week 2: Object-Oriented Programming (OOP) Deep Dive (Days 8 – 14)

| Day | Topic | Key Concepts | Code Examples & Challenges |
| :--- | :--- | :--- | :--- |
| **[Day 8](./day08-classes-and-constructors/)** | **Classes, Objects & Constructors** | Blueprints vs instances, Heap memory, constructor overloading, constructor chaining | `Lamp.java`<br>`Bicycle.java`<br>`ConstructorChainingDemo.java` |
| **[Day 9](./day09-access-modifiers/)** | **Access Modifiers & Visibility** | `public`, `private`, `protected`, default (package-private), visibility rules | `DefaultAccessDemo.java`<br>`PrivateAccessDemo.java`<br>`ProtectedAccessDemo.java`<br>`PublicAccessDemo.java` |
| **[Day 10](./day10-encapsulation-and-getters-setters/)** | **Encapsulation & Data Hiding** | Data protection, validated getters/setters, read-only fields, bank account model | `DataEncapsulationDemo.java`<br>`BankAccountEncapsulated.java`<br>`PersonRecord.java` |
| **[Day 11](./day11-inheritance-and-is-a/)** | **Inheritance & IS-A Hierarchy** | `extends` keyword, subclass vs superclass, IS-A rule, 5 inheritance models | `BasicInheritanceDemo.java`<br>`IsARelationshipDemo.java`<br>`MultilevelInheritanceDemo.java`<br>`HierarchicalInheritanceDemo.java` |
| **[Day 12](./day12-the-super-keyword/)** | **Method Overriding & `super`** | `@Override`, dynamic method dispatch, calling parent methods, fields, and constructors | `MethodOverridingDemo.java`<br>`SuperMethodCallDemo.java`<br>`SuperFieldAccessDemo.java`<br>`SuperConstructorDemo.java` |
| **[Day 13](./day13-static-this-and-final/)** | **`static`, `this`, and `final`** | Class vs instance members, static blocks, variable shadowing, `this()`, constants | `StaticMembersDemo.java`<br>`ThisKeywordMastery.java`<br>`FinalKeywordDemo.java` |
| **[Day 14](./day14-packages-and-imports/)** | **Java Packages & Architecture** | Reverse domain naming, modular directories, `package`, `import`, compiling with `javac -d .` | `Helper.java`<br>`Student.java`<br>`MainApp.java` |

---

## 🛠️ Prerequisites & Setup

To compile and run any code in this repository:

1. **Java Development Kit (JDK 8 or higher recommended)**:
   ```bash
   java -version
   javac -version
   ```
2. **Git**:
   ```bash
   git --version
   ```

---

## ⚡ Quick Start: How to Run Any Example

Each day's folder is self-contained. Navigate into any day's directory and compile the `.java` files using `javac`:

```bash
# Example: Running Day 8 code
cd day08-classes-and-constructors/src
javac Bicycle.java
java Bicycle

# Example: Running Day 14 packaged code
cd day14-packages-and-imports/src
javac -d . com/learning/utils/Helper.java com/learning/models/Student.java com/learning/main/MainApp.java
java com.learning.main.MainApp
```

---

## 🤝 Contributing & Feedback

Found a typo or want to suggest an improvement? Feel free to open an issue or pull request! Happy coding!
