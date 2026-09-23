/**
 * BasicInheritanceDemo.java
 *
 * Demonstrates:
 * 1. The 'extends' keyword used to inherit from a parent class.
 * 2. Accessing parent fields and methods from an object of the child class.
 * 3. Adding specialized methods to the child class.
 */
class AnimalBase {
    // Field belonging to parent class
    String name;

    // Method belonging to parent class
    public void eat() {
        System.out.println(name + " is eating food. (inherited eat method)");
    }
}

// Subclass Dog inherits all accessible members from AnimalBase
class DogSubclass extends AnimalBase {

    // Specialized method belonging only to DogSubclass
    public void display() {
        System.out.println("Dog's name is: " + name);
    }

    public void bark() {
        System.out.println(name + " says: Woof! Woof!");
    }
}

public class BasicInheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Basic Inheritance Demonstration ===");

        // Create an object of the subclass
        DogSubclass labrador = new DogSubclass();

        // Access field declared in parent class
        labrador.name = "Rohu";

        // Call method declared in child class
        labrador.display();
        labrador.bark();

        // Call method inherited from parent class
        labrador.eat();
    }
}
