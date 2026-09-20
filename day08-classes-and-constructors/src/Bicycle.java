/**
 * Bicycle.java
 *
 * Demonstrates:
 * 1. Parameterized constructor for object initialization.
 * 2. State encapsulation with gear and speed attributes.
 * 3. Method execution to safely update object state.
 */
public class Bicycle {

    // Instance fields
    int gear;
    int speed;
    String brand;

    /**
     * Parameterized Constructor:
     * Initializes a new Bicycle object with custom brand, starting gear, and speed.
     *
     * @param brand Initial brand name
     * @param gear  Initial gear setting (1 to 10)
     * @param speed Initial speed in km/h
     */
    public Bicycle(String brand, int gear, int speed) {
        this.brand = brand;
        this.gear = gear;
        this.speed = speed;
    }

    /**
     * Increases the current speed.
     *
     * @param increment Amount of speed to add
     */
    public void speedUp(int increment) {
        speed += increment;
        System.out.println(brand + " accelerated by " + increment + " km/h. Current speed: " + speed + " km/h.");
    }

    /**
     * Decreases the current speed (never below zero).
     *
     * @param decrement Amount of speed to subtract
     */
    public void applyBrake(int decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
        System.out.println(brand + " slowed down by " + decrement + " km/h. Current speed: " + speed + " km/h.");
    }

    /**
     * Changes the gear.
     *
     * @param newGear The new gear setting
     */
    public void changeGear(int newGear) {
        this.gear = newGear;
        System.out.println(brand + " shifted to gear: " + newGear);
    }

    /**
     * Displays complete bicycle telemetry.
     */
    public void printTelemetry() {
        System.out.println("🚲 [" + brand + "] Gear: " + gear + " | Speed: " + speed + " km/h");
    }

    public static void main(String[] args) {
        System.out.println("=== Bicycle Object Simulation ===");

        // Constructing two bicycle objects using parameterized constructor
        Bicycle mountainBike = new Bicycle("Trek Mountain", 3, 15);
        Bicycle roadBike = new Bicycle("Specialized Road", 5, 28);

        mountainBike.printTelemetry();
        mountainBike.speedUp(10);
        mountainBike.changeGear(4);
        mountainBike.printTelemetry();

        System.out.println();

        roadBike.printTelemetry();
        roadBike.applyBrake(12);
        roadBike.printTelemetry();
    }
}
