/**
 * SuperConstructorDemo.java
 *
 * Demonstrates:
 * 1. Using 'super(...)' to explicitly call a parameterized constructor of the superclass.
 * 2. Why 'super(...)' MUST always be the first statement inside a child constructor.
 * 3. Constructor execution order: Parent constructor runs BEFORE child constructor!
 */
class AnimalEntity {

    // Default no-arg constructor
    AnimalEntity() {
        System.out.println("1. [AnimalEntity] Default no-arg constructor invoked.");
    }

    // Parameterized constructor
    AnimalEntity(String classification) {
        System.out.println("1. [AnimalEntity] Parameterized constructor invoked with classification: " + classification);
    }
}

class DogEntity extends AnimalEntity {

    // Default constructor of child calling parameterized constructor of parent
    DogEntity() {
        // super(...) MUST be the first statement!
        super("Vertebrate / Mammalia");
        System.out.println("2. [DogEntity] Child constructor finished initializing dog.");
    }

    DogEntity(String classification, String breed) {
        super(classification);
        System.out.println("2. [DogEntity] Specialized breed initialized: " + breed);
    }
}

public class SuperConstructorDemo {
    public static void main(String[] args) {
        System.out.println("=== Super Constructor Chaining Demo ===");

        System.out.println("\n-- Creating Dog 1 (Default Child Constructor) --");
        DogEntity dog1 = new DogEntity();

        System.out.println("\n-- Creating Dog 2 (Parameterized Child Constructor) --");
        DogEntity dog2 = new DogEntity("Canidae Family", "German Shepherd");
    }
}
