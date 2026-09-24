/**
 * SuperMethodCallDemo.java
 *
 * Demonstrates:
 * Using 'super.methodName()' to invoke the parent class's version of a method
 * that has been overridden in the child class.
 */
class AnimalSound {
    public void display() {
        System.out.println("🐾 [Superclass] I am a generic animal.");
    }
}

class DogSound extends AnimalSound {

    @Override
    public void display() {
        System.out.println("🐕 [Subclass] I am a loyal dog.");
    }

    public void printCombinedMessages() {
        System.out.println("Calling display() -> Child's overridden version:");
        display();

        System.out.println("\nCalling super.display() -> Parent's original version:");
        super.display();
    }
}

public class SuperMethodCallDemo {
    public static void main(String[] args) {
        System.out.println("=== Calling Superclass Method with super() ===");

        DogSound dog = new DogSound();
        dog.printCombinedMessages();
    }
}
