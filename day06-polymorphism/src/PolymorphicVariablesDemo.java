/**
 * PolymorphicVariablesDemo.java
 *
 * Demonstrates:
 * Polymorphic Variables (Upcasting):
 * An object reference variable of a parent class can refer to objects
 * of its own class or any of its subclasses.
 */

class ProgrammingLanguage {
    public void display() {
        System.out.println("I am Programming Language.");
    }
}

class JavaChild extends ProgrammingLanguage {
    @Override
    public void display() {
        System.out.println("I am Object-Oriented Programming Language.");
    }
}

public class PolymorphicVariablesDemo {
    public static void main(String[] args) {
        System.out.println("=== Polymorphic Variable Demonstration ===");

        // Declare a polymorphic object variable of the parent class
        ProgrammingLanguage pl;

        // 1. pl refers to an instance of the parent class
        pl = new ProgrammingLanguage();
        pl.display(); // Output: I am Programming Language.

        // 2. pl now refers to an instance of the child class JavaChild
        pl = new JavaChild();
        pl.display(); // Output: I am Object-Oriented Programming Language.
    }
}
