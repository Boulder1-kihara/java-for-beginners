/**
 * RaggedArrayDemo.java
 *
 * Demonstrates:
 * Ragged (or Jagged) arrays in Java:
 * Each row in a 2D array can be allocated with a different length.
 */
public class RaggedArrayDemo {

    public static void main(String[] args) {
        System.out.println("=== Ragged Array Dynamic Allocation ===");

        // Declare a 2D array with 3 rows, but don't specify column sizes yet:
        int[][] jagged = new int[3][];

        // Allocate different column sizes for each row:
        jagged[0] = new int[2]; // Row 0 has 2 columns
        jagged[1] = new int[4]; // Row 1 has 4 columns
        jagged[2] = new int[1]; // Row 2 has 1 column

        // Fill elements
        int counter = 10;
        for (int r = 0; r < jagged.length; r++) {
            for (int c = 0; c < jagged[r].length; c++) {
                jagged[r][c] = counter++;
            }
        }

        // Print grid visualizer
        for (int r = 0; r < jagged.length; r++) {
            System.out.print("Row " + r + " (size " + jagged[r].length + "): ");
            for (int c = 0; c < jagged[r].length; c++) {
                System.out.print(jagged[r][c] + " ");
            }
            System.out.println();
        }
    }
}
