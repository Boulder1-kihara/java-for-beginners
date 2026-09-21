/**
 * PrivateAccessDemo.java
 *
 * Demonstrates:
 * 1. The 'private' access modifier restricts access strictly to the declaring class.
 * 2. Why attempting direct access from outside causes a compile error:
 *    "error: name has private access in Data".
 * 3. Accessing private variables safely through public Getters and Setters.
 */
class Data {
    // Private variable: strictly hidden from any outside class
    private String name;

    /**
     * Getter method: provides controlled read-only access to 'name'.
     *
     * @return Current name string
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter method: provides controlled write access with optional validation.
     *
     * @param name New name string to assign
     */
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("⚠️ Warning: Cannot set empty name!");
        }
    }
}

public class PrivateAccessDemo {
    public static void main(String[] args) {
        System.out.println("=== Private Access & Encapsulation Demo ===");

        Data d = new Data();

        // ❌ COMPILER ERROR if uncommented:
        // d.name = "Java Programming";
        // System.out.println(d.name);
        // Error message: "name has private access in Data"

        // ✅ Correct approach: use public setter and getter methods
        d.setName("Java Programming Deep Dive");
        System.out.println("Retrieved via getter: " + d.getName());

        // Demonstrating validation inside setter
        d.setName(""); // Rejected by validation
        System.out.println("Value after invalid update attempt: " + d.getName());
    }
}
