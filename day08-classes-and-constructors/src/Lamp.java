/**
 * Lamp.java
 *
 * Demonstrates:
 * 1. Defining a class with instance variables (state).
 * 2. Defining methods to manipulate object state (behavior).
 * 3. Creating multiple independent object instances in Heap memory.
 */
public class Lamp {

    // Instance variable (Field): stores the state of the lamp
    // By default, boolean fields initialize to 'false'
    boolean isOn;

    /**
     * Method to turn the lamp on.
     * Changes the internal state 'isOn' to true.
     */
    void turnOn() {
        isOn = true;
        System.out.println("Light is now ON! 💡");
    }

    /**
     * Method to turn the lamp off.
     * Changes the internal state 'isOn' to false.
     */
    void turnOff() {
        isOn = false;
        System.out.println("Light is now OFF! 🌑");
    }

    /**
     * Displays the current status of the lamp.
     */
    void printStatus() {
        if (isOn) {
            System.out.println("Status: Glowing brightly.");
        } else {
            System.out.println("Status: Dark and idle.");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Lamp Objects Demonstration ===");

        // Create the first Lamp object (living on the Heap)
        Lamp livingRoomLamp = new Lamp();

        // Create a second Lamp object (independent copy of state)
        Lamp bedroomLamp = new Lamp();

        System.out.println("\n-- Living Room Lamp --");
        livingRoomLamp.printStatus();
        livingRoomLamp.turnOn();
        livingRoomLamp.printStatus();

        System.out.println("\n-- Bedroom Lamp --");
        bedroomLamp.printStatus(); // Notice: bedroomLamp is still false!
        bedroomLamp.turnOff();
    }
}
