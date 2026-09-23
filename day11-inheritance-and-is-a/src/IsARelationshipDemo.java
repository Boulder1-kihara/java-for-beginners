/**
 * IsARelationshipDemo.java
 *
 * Demonstrates:
 * Modeling domain logic using the "IS-A" test:
 * 1. Car IS-A Vehicle
 * 2. Orange IS-A Fruit
 * 3. Surgeon IS-A Doctor
 */

// 1. Vehicle -> Car
class Vehicle {
    String engineType = "Internal Combustion";
    void startEngine() {
        System.out.println("Engine roaring to life...");
    }
}

class Car extends Vehicle {
    int numberOfDoors = 4;
    void drive() {
        System.out.println("Car is cruising on the highway with " + numberOfDoors + " doors.");
    }
}

// 2. Doctor -> Surgeon
class Doctor {
    String hospitalName = "Nairobi National Hospital";
    void diagnosePatient() {
        System.out.println("Checking vital signs and reviewing lab results.");
    }
}

class Surgeon extends Doctor {
    String specialty = "Cardiothoracic Surgery";
    void performSurgery() {
        System.out.println("Performing operation in the surgical theater (" + specialty + ").");
    }
}

public class IsARelationshipDemo {
    public static void main(String[] args) {
        System.out.println("=== IS-A Relationship Demonstrations ===");

        System.out.println("\n-- 1. Car IS-A Vehicle --");
        Car sedan = new Car();
        sedan.startEngine(); // Inherited
        sedan.drive();       // Specialized

        System.out.println("\n-- 2. Surgeon IS-A Doctor --");
        Surgeon doc = new Surgeon();
        System.out.println("Hospital: " + doc.hospitalName);
        doc.diagnosePatient(); // Inherited
        doc.performSurgery();  // Specialized
    }
}
