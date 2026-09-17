/**
 * TwoDimensionalArrayDemo.java
 *
 * Demonstrates:
 * 1. Declaring and initializing a 2-dimensional array.
 * 2. Calculating the length of each row using the '.length' property.
 */
public class TwoDimensionalArrayDemo {

    public static void main(String[] args) {
        // Create a 2D array with 3 rows
        int[][] a = {
            {1, 2, 3},       // row 0
            {4, 5, 6, 9},    // row 1
            {7}              // row 2
        };

        System.out.println("=== 2D Array Row Dimensions ===");
        System.out.println("Total number of rows: " + a.length);

        // calculate the length of each row
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);
    }
}
