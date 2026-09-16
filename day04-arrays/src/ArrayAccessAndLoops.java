/**
 * ArrayAccessAndLoops.java
 *
 * Demonstrates:
 * 1. Accessing array elements using zero-based indices.
 * 2. Looping with the standard 'for' loop using '.length'.
 * 3. Looping with the enhanced 'for-each' loop.
 */
public class ArrayAccessAndLoops {

    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 5};

        System.out.println("=== 1. Direct Index Access ===");
        System.out.println("Accessing Elements of Array:");
        System.out.println("First Element:  " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element:  " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element:  " + age[4]);

        System.out.println("\n=== 2. Iterating with Traditional 'for' Loop ===");
        // using age.length property to determine total iterations
        for (int i = 0; i < age.length; i++) {
            System.out.println("Index " + i + " -> Value: " + age[i]);
        }

        System.out.println("\n=== 3. Iterating with Enhanced 'for-each' Loop ===");
        // Syntax: for (dataType variableName : arrayName)
        for (int a : age) {
            System.out.println("Value: " + a);
        }
    }
}
