/**
 * OverloadingByParameterType.java
 *
 * This program demonstrates:
 * Method overloading achieved by changing the DATA TYPE of parameters.
 */
public class OverloadingByParameterType {

    // Overloaded version accepting an integer
    private static void display(int a) {
        System.out.println("Got Integer data: " + a);
    }

    // Overloaded version accepting a String object
    private static void display(String a) {
        System.out.println("Got String object: \"" + a + "\"");
    }

    // Overloaded version accepting a double
    private static void display(double a) {
        System.out.println("Got Double floating-point data: " + a);
    }

    public static void main(String[] args) {
        System.out.println("--- Testing Overloading by Parameter Type ---");

        display(1);          // Calls display(int)
        display("Hello");    // Calls display(String)
        display(3.14159);    // Calls display(double)
    }
}
