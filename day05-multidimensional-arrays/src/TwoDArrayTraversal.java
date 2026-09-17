/**
 * TwoDArrayTraversal.java
 *
 * Demonstrates:
 * 1. Traversing a 2D array using nested traditional 'for' loops.
 * 2. Traversing a 2D array using nested enhanced 'for-each' loops.
 */
public class TwoDArrayTraversal {

    public static void main(String[] args) {
        int[][] a = {
            {1, -2, 3},
            {-4, -5, 6, 9},
            {7}
        };

        System.out.println("=== 1. Traversal Using Traditional Nested 'for' Loops ===");
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; ++j) {
                System.out.println("a[" + i + "][" + j + "] = " + a[i][j]);
            }
        }

        System.out.println("\n=== 2. Traversal Using Nested 'for-each' Loops ===");
        // The outer loop extracts each inner row (which is an int[] array)
        for (int[] innerArray : a) {
            // The inner loop extracts each int element from the row
            for (int data : innerArray) {
                System.out.println(data);
            }
        }
    }
}
