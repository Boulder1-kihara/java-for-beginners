# 🛡️ Day 3: Encapsulation & Data Hiding

Welcome to **Day 10** of the Java OOP Deep Dive! Today we explore **Encapsulation**, one of the four fundamental pillars of Object-Oriented Programming.

---

## 📖 What is Encapsulation?

**Encapsulation** is the mechanism of wrapping data (variables) and code acting on the data (methods) together as a single unit. In encapsulation:
1. The **variables of a class are hidden** from other classes (made `private`).
2. They can only be accessed through the **methods of their current class** (public getters and setters).

```
   ┌────────────────────────────────────────────────────────┐
   │                     CLASS CAPSULE                      │
   │                                                        │
   │   PRIVATE STATE (Hidden from outside world)            │
   │   ├── balance: double                                  │
   │   └── pinCode: String                                  │
   │                                                        │
   │   PUBLIC GATEWAYS (Controlled access & validation)     │
   │   ├── getBalance()          -> Read access             │
   │   ├── deposit(amount)       -> Validated write access  │
   │   └── withdraw(amount, pin) -> Authenticated write     │
   └────────────────────────────────────────────────────────┘
```

---

## 🌟 Why is Encapsulation Important?

1. **Data Hiding & Security**: Outside code cannot accidentally set corrupt values (e.g., setting a bank balance to `-$50,000` or age to `-15`).
2. **Increased Flexibility**: You can make variables **read-only** (only getter, no setter) or **write-only** (only setter, no getter).
3. **Maintainability**: You can change internal implementation details (e.g., how data is stored or computed) without breaking any external code relying on your class.
4. **Validation Logic**: Setters allow you to enforce business rules before accepting new data.

---

## 💻 Code Examples in this Directory

| File | Focus |
| :--- | :--- |
| [`DataEncapsulationDemo.java`](./src/DataEncapsulationDemo.java) | Fundamental getter and setter mechanics with `this` reference. |
| [`BankAccountEncapsulated.java`](./src/BankAccountEncapsulated.java) | Real-world banking model with deposit/withdraw validation and security checks. |
| [`PersonRecord.java`](./src/PersonRecord.java) | Read-only fields, age validation, and immutability concepts. |

---

## 🚀 How to Compile and Run

```bash
cd day03-encapsulation-and-getters-setters/src
javac DataEncapsulationDemo.java
java DataEncapsulationDemo

javac BankAccountEncapsulated.java
java BankAccountEncapsulated

javac PersonRecord.java
java PersonRecord
```
