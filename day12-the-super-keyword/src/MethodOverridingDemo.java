/**
 * MethodOverridingDemo.java
 *
 * Demonstrates:
 * 1. Method Overriding in Java inheritance.
 * 2. When the same method exists in both superclass and subclass, the child's
 *    version is invoked at runtime.
 * 3. Using the @Override annotation to catch signature typos at compile time.
 */
class AnimalParent {
    // Superclass method
    public void eat() {
        System.out.println("Animal: I can eat general sustenance.");
    }
}

class DogChild extends AnimalParent {

    // Overriding the eat() method
    @Override
    public void eat() {
        System.out.println("Dog: I eat dog food and crunch bones! 🍖");
    }

    // Subclass-specific method
    public void bark() {
        System.out.println("Dog: Woof! Woof!");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        System.out.println("=== Method Overriding Demonstration ===");

        // Subclass instance
        DogChild labrador = new DogChild();

        // Invoking eat(): calls DogChild's overridden version
        labrador.eat();
        labrador.bark();

        // Polymorphic reference: AnimalParent type pointing to DogChild object
        System.out.println("\n-- Polymorphic Reference Execution --");
        AnimalParent genericPet = new DogChild();
        // Even through parent reference, child's overridden eat() executes!
        genericPet.eat();
    }
}
