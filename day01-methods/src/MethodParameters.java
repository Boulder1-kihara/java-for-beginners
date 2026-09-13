/**
 * MethodParameters.java
 *
 * This program demonstrates:
 * 1. A method with no parameters.
 * 2. A method with a single parameter.
 * 3. The distinction between Formal Parameters and Actual Arguments.
 */
public class MethodParameters {

    /**
     * Method with NO parameters:
     * Simply executes the statement inside when called.
     */
    public void display1() {
        System.out.println("Method without parameter called.");
    }

    /**
     * Method with a single parameter:
     * @param a The formal parameter of type int.
     */
    public void display2(int a) {
        System.out.println("Method with a single parameter called. Received: " + a);
    }

    /**
     * Method with multiple parameters of different types:
     * @param name Person's name (String)
     * @param age  Person's age (int)
     */
    public void introduce(String name, int age) {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    public static void main(String[] args) {
        // Create an instance of the class to invoke instance methods
        MethodParameters demo = new MethodParameters();

        // Calling method with no arguments
        demo.display1();

        // Calling method with an actual argument (24)
        // 24 matches the formal parameter 'int a'
        demo.display2(24);

        // Calling method with multiple arguments
        demo.introduce("Alice", 21);
    }
}
