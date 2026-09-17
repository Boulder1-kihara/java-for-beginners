/**
 * ThreeDimensionalArrayDemo.java
 *
 * Demonstrates:
 * Declaring, initializing, and traversing a 3-dimensional array.
 * A 3D array is an array of 2D arrays!
 */
public class ThreeDimensionalArrayDemo {

    public static void main(String[] args) {
        // test is a 3D array
        int[][][] test = {
            {
                {1, -2, 3},
                {2, 3, 4}
            },
            {
                {-4, -5, 6, 9},
                {1},
                {2, 3}
            }
        };

        System.out.println("=== 3D Array Traversal with Nested For-Each ===");
        // Layer 1: Iterate over 2D planes
        for (int[][] array2D : test) {
            // Layer 2: Iterate over 1D rows
            for (int[] array1D : array2D) {
                // Layer 3: Iterate over individual elements
                for (int item : array1D) {
                    System.out.println(item);
                }
            }
        }
    }
}
