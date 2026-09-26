package com.learning.utils;

/**
 * Helper.java
 *
 * Belongs to package: com.learning.utils
 * Demonstrates a reusable utility class accessible across packages when declared public.
 */
public class Helper {

    /**
     * Formats a double value as currency with 2 decimal places and dollar sign.
     *
     * @param value The raw monetary value
     * @return Formatted currency string (e.g., "$99.50")
     */
    public static String getFormattedDollar(double value) {
        return String.format("$%.2f", value);
    }

    /**
     * Capitalizes the first letter of each word in a string.
     *
     * @param text Raw input text
     * @return Capitalized string
     */
    public static String capitalize(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }
}
