/**
 * PublicAccessDemo.java
 *
 * Demonstrates:
 * 1. The 'public' access modifier.
 * 2. Public classes, methods, and variables have zero visibility restrictions
 *    and can be accessed from any package or class.
 */
class PublicCreature {
    // Public variable: accessible anywhere
    public int legCount = 4;
    public String habitat = "Savannah";

    // Public method: callable anywhere
    public void printCreatureDetails() {
        System.out.println("🦁 Creature Details: " + legCount + " legs | Habitat: " + habitat);
    }
}

public class PublicAccessDemo {
    public static void main(String[] args) {
        System.out.println("=== Public Access Modifier Demo ===");

        PublicCreature lion = new PublicCreature();

        // Reading and modifying public variables directly
        System.out.println("Default legs: " + lion.legCount);
        lion.legCount = 4;
        lion.habitat = "Serengeti Plains";

        // Invoking public method
        lion.printCreatureDetails();
    }
}
