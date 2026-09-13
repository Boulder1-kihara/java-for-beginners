/**
 * BasicsOfMethods.java
 *
 * This program demonstrates:
 * 1. How to declare a user-defined method with return types.
 * 2. The difference between an instance method and a static method.
 * 3. How to return values using the 'return' statement.
 */
public class BasicsOfMethods {

    /**
     * Instance Method: addNumbers
     * - 'public': Accessible anywhere.
     * - 'int': Return type. This method MUST return an integer value.
     * - 'int a, int b': Parameters that receive values when called.
     */
    public int addNumbers(int a, int b) {
        int sum = a + b;
        return sum; // Returns the calculated sum back to the caller
    }

    /**
     * Static Method: square
     * - 'static': Can be called directly without creating an object of BasicsOfMethods.
     * - 'int': Returns the squared integer.
     */
    public static int square(int num) {
        return num * num;
    }

    /**
     * Void Method: printWelcome
     * - 'void': Does NOT return any value. It simply performs an action.
     */
    public static void printWelcome() {
        System.out.println("=== Welcome to Java Methods Demo ===");
    }

    public static void main(String[] args) {
        // 1. Calling a static void method directly
        printWelcome();

        // 2. Calling an instance method (requires creating an object with 'new')
        BasicsOfMethods obj = new BasicsOfMethods();
        int num1 = 25;
        int num2 = 15;
        
        // Pass arguments 'num1' and 'num2' to addNumbers
        int resultSum = obj.addNumbers(num1, num2);
        System.out.println("Sum is: " + resultSum);

        // 3. Calling a static method returning a value
        int resultSquare = square(10);
        System.out.println("Squared value of 10 is: " + resultSquare);
    }
}
