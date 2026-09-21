/**
 * DefaultAccessDemo.java
 *
 * Demonstrates:
 * 1. Default (package-private) access modifier.
 * 2. When no modifier keyword is typed, members are visible to all classes
 *    sharing the same package.
 */
class Logger {
    // Default access variable (no modifier keyword)
    String logPrefix = "[SYSTEM LOG]";

    // Default access method
    void message(String text) {
        System.out.println(logPrefix + " " + text);
    }
}

public class DefaultAccessDemo {
    public static void main(String[] args) {
        System.out.println("=== Default (Package-Private) Access Demo ===");

        // Since Logger and DefaultAccessDemo are in the same package (default package),
        // we can instantiate Logger and invoke message() without issues.
        Logger logger = new Logger();
        logger.message("Application started successfully.");
        logger.message("Connecting to local database...");

        // Directly accessing package-private field
        logger.logPrefix = "[AUDIT LOG]";
        logger.message("Security check passed.");
    }
}
