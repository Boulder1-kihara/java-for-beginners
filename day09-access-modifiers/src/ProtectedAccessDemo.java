/**
 * ProtectedAccessDemo.java
 *
 * Demonstrates:
 * 1. The 'protected' access modifier.
 * 2. Protected methods and fields are accessible within the same package,
 *    and by subclasses (child classes) through inheritance.
 */
class Animal {
    // Protected field: accessible by Animal and any class extending Animal
    protected String species = "Canine";

    // Protected method
    protected void display() {
        System.out.println("🐾 [Animal Superclass] I am an animal of species: " + species);
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    public void displayDogInfo() {
        // Accessing protected field directly from subclass
        System.out.println("Dog Breed: " + breed + ", Species: " + species);

        // Calling protected method directly from subclass
        display();
    }
}

public class ProtectedAccessDemo {
    public static void main(String[] args) {
        System.out.println("=== Protected Access Modifier Demo ===");

        Dog dog = new Dog("Golden Retriever");
        dog.displayDogInfo();

        // Since ProtectedAccessDemo is in the same package as Animal,
        // it can also call display() directly on dog
        dog.display();
    }
}
