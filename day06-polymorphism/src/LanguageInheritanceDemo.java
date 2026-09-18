/**
 * LanguageInheritanceDemo.java
 *
 * Demonstrates:
 * Run-Time Polymorphism (Method Overriding) using Language and Java classes.
 */

// Superclass
class Language {
    public void displayInfo() {
        System.out.println("Common English Language");
    }
}

// Subclass overriding displayInfo()
class JavaLanguage extends Language {
    @Override
    public void displayInfo() {
        System.out.println("Java Programming Language");
    }
}

public class LanguageInheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Language Inheritance & Overriding ===");

        // create an object of JavaLanguage class
        JavaLanguage j1 = new JavaLanguage();
        j1.displayInfo(); // Output: Java Programming Language

        // create an object of Language class
        Language l1 = new Language();
        l1.displayInfo(); // Output: Common English Language
    }
}
