/**
 * OverloadingByParameterCount.java
 *
 * This program demonstrates:
 * Method overloading achieved by changing the NUMBER of parameters.
 */
public class OverloadingByParameterCount {

    // Overloaded method with ONE parameter
    private static void display(int a) {
        System.out.println("Arguments: " + a);
    }

    // Overloaded method with TWO parameters
    private static void display(int a, int b) {
        System.out.println("Arguments: " + a + " and " + b);
    }

    // Overloaded method with THREE parameters
    private static void display(int a, int b, int c) {
        System.out.println("Arguments: " + a + ", " + b + " and " + c);
    }

    public static void main(String[] args) {
        System.out.println("--- Testing Overloading by Parameter Count ---");
        
        // Compiler selects display(int)
        display(1);

        // Compiler selects display(int, int)
        display(1, 4);

        // Compiler selects display(int, int, int)
        display(1, 4, 9);
    }
}
