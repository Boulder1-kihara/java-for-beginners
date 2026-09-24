/**
 * SuperFieldAccessDemo.java
 *
 * Demonstrates:
 * Using 'super.fieldName' to access a field from the parent class when the child
 * class defines a field with the exact same name (variable shadowing).
 */
class AnimalKingdom {
    // Protected field in parent class
    protected String type = "animal";
}

class DogSpecies extends AnimalKingdom {
    // Subclass defines its own field with the same name 'type'
    public String type = "mammal";

    public void printTypeComparison() {
        // 'type' refers to the child class's field
        System.out.println("Child field (this.type): " + type);

        // 'super.type' refers to the parent class's field
        System.out.println("Parent field (super.type): " + super.type);
    }
}

public class SuperFieldAccessDemo {
    public static void main(String[] args) {
        System.out.println("=== Super Field Shadowing Access Demo ===");

        DogSpecies dog = new DogSpecies();
        dog.printTypeComparison();
    }
}
