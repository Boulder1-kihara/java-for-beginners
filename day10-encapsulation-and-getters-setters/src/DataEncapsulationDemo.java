/**
 * DataEncapsulationDemo.java
 *
 * Demonstrates:
 * 1. Creating a private variable 'name'.
 * 2. Providing getter and setter methods to access and modify it.
 * 3. Using the 'this' keyword in the setter to distinguish between the parameter
 *    and the class instance field.
 */
class EncapsulatedData {
    // Private variable: cannot be accessed directly from outside
    private String name;

    /**
     * Getter method for 'name'
     *
     * @return Current name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter method for 'name'
     * 'this.name' refers to the instance variable of the class
     * 'name' refers to the parameter passed into the method
     *
     * @param name New name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}

public class DataEncapsulationDemo {
    public static void main(String[] args) {
        System.out.println("=== Basic Encapsulation Demo ===");

        EncapsulatedData data = new EncapsulatedData();

        // Assign value via setter
        data.setName("Java Object-Oriented Programming");

        // Retrieve and print value via getter
        System.out.println("The name is: " + data.getName());
    }
}
