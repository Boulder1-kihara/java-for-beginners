/**
 * RealWorldHelperService.java
 *
 * Real-world example from the lesson notes:
 * A helper service that formats various numeric inputs (int, double, numeric String)
 * using the same method name 'formatNumber'.
 */
public class RealWorldHelperService {

    /**
     * Formats an integer value as a plain whole number string.
     */
    public String formatNumber(int value) {
        return String.format("%d", value);
    }

    /**
     * Formats a double floating-point value to 3 decimal places.
     */
    public String formatNumber(double value) {
        return String.format("%.3f", value);
    }

    /**
     * Parses a string representation of a number and formats it to 2 decimal places.
     */
    public String formatNumber(String value) {
        return String.format("%.2f", Double.parseDouble(value));
    }

    public static void main(String[] args) {
        RealWorldHelperService hs = new RealWorldHelperService();

        // Calling formatNumber with int 500
        System.out.println("Formatted int: " + hs.formatNumber(500));

        // Calling formatNumber with double 89.9934
        System.out.println("Formatted double: " + hs.formatNumber(89.9934));

        // Calling formatNumber with String "550"
        System.out.println("Formatted String: " + hs.formatNumber("550"));
    }
}
