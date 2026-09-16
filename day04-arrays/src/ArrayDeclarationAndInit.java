/**
 * ArrayDeclarationAndInit.java
 *
 * Demonstrates:
 * 1. How to declare an array variable.
 * 2. How to allocate memory on the heap with 'new'.
 * 3. How to initialize array elements via index vs inline literal curly braces.
 */
public class ArrayDeclarationAndInit {

    public static void main(String[] args) {
        System.out.println("=== 1. Declare and Allocate Separately ===");
        // Step 1: Declare an array of doubles
        double[] data;
        // Step 2: Allocate memory for 5 elements (defaults to 0.0)
        data = new double[5];
        data[0] = 10.5;
        data[1] = 20.75;
        System.out.println("First element in data: " + data[0]);
        System.out.println("Second element in data: " + data[1]);
        System.out.println("Uninitialized default value (index 2): " + data[2]);

        System.out.println("\n=== 2. Declare and Allocate in One Statement ===");
        int[] agesAllocated = new int[5];
        agesAllocated[0] = 12;
        agesAllocated[1] = 4;
        agesAllocated[2] = 5;
        agesAllocated[3] = 2;
        agesAllocated[4] = 5;
        System.out.println("Allocated array length: " + agesAllocated.length);

        System.out.println("\n=== 3. Inline Initialization with Curly Brackets ===");
        // Java automatically infers the size from the number of elements provided
        int[] age = {12, 4, 5, 2, 5};
        System.out.println("Inline array length: " + age.length);
        System.out.println("Element at index 0: " + age[0]);
        System.out.println("Element at index 4 (last element): " + age[4]);
    }
}
