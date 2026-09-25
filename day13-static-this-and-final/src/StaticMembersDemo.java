/**
 * StaticMembersDemo.java
 *
 * Demonstrates:
 * 1. Static methods (called using ClassName.methodName() without creating an object).
 * 2. Static variables (shared across all instances of the class).
 * 3. Static initialization blocks (executed once when the class is loaded).
 */
class CounterTracker {

    // Instance variable: each object has its own separate copy
    int instanceCount = 0;

    // Static variable: shared by ALL instances in the entire JVM
    static int globalCount = 0;

    // Static initialization block
    static {
        System.out.println("⚡ [Static Block] CounterTracker class loaded into memory.");
        globalCount = 100; // Initializing static state
    }

    public CounterTracker() {
        instanceCount++;
        globalCount++;
    }

    // Static helper method
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}

public class StaticMembersDemo {

    public static void main(String[] args) {
        System.out.println("=== Java Static Keyword Demonstration ===");

        // 1. Invoking static method without creating any instance
        int sum = CounterTracker.addNumbers(15, 30);
        System.out.println("Static method addNumbers(15, 30) = " + sum);

        System.out.println("\nInitial globalCount before creating objects: " + CounterTracker.globalCount);

        // 2. Creating multiple instances
        CounterTracker c1 = new CounterTracker();
        CounterTracker c2 = new CounterTracker();
        CounterTracker c3 = new CounterTracker();

        // 3. Compare instance variable vs static variable
        System.out.println("\n-- Memory Comparison --");
        System.out.println("c1.instanceCount: " + c1.instanceCount + " (local to c1)");
        System.out.println("c2.instanceCount: " + c2.instanceCount + " (local to c2)");
        System.out.println("Shared CounterTracker.globalCount: " + CounterTracker.globalCount + " (shared across all)");
    }
}
