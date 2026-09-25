/**
 * FinalKeywordDemo.java
 *
 * Demonstrates:
 * 1. Final variable: constant, cannot be reassigned once initialized.
 * 2. Final method: cannot be overridden by any subclass.
 * 3. Final class: cannot be extended/inherited by any class.
 */

// 1. Class containing final variable and final method
class SecurityModule {

    // Final variable: constant value
    public final int MAX_LOGIN_ATTEMPTS = 3;

    // Final method: locked implementation, subclasses cannot change this!
    public final void logSecurityEvent(String event) {
        System.out.println("🛡️ [SECURITY AUDIT]: " + event);
    }

    public void regularMethod() {
        System.out.println("Regular method: can be overridden if needed.");
    }
}

// 2. Subclass attempting to override
class CustomSecurityModule extends SecurityModule {

    // Overriding normal method is fine
    @Override
    public void regularMethod() {
        System.out.println("Custom security module: specialized behavior.");
    }

    // ❌ COMPILER ERROR if uncommented:
    // @Override
    // public void logSecurityEvent(String event) { ... }
    // Error: "logSecurityEvent(String) in CustomSecurityModule cannot override logSecurityEvent(String) in SecurityModule; overridden method is final"
}

// 3. Final class: sealed from inheritance
final class ImmutableConfig {
    public final String API_KEY = "SECRET-KEY-12345";

    public void showConfig() {
        System.out.println("Config Key: " + API_KEY);
    }
}

// ❌ COMPILER ERROR if uncommented:
// class ChildConfig extends ImmutableConfig { }
// Error: "cannot inherit from final ImmutableConfig"

public class FinalKeywordDemo {
    public static void main(String[] args) {
        System.out.println("=== Java Final Keyword Demonstration ===");

        // 1. Testing final variable
        final int USER_AGE = 25;
        System.out.println("Final USER_AGE: " + USER_AGE);

        // ❌ COMPILER ERROR if uncommented:
        // USER_AGE = 26; // Error: "cannot assign a value to final variable USER_AGE"

        // 2. Testing final method
        CustomSecurityModule sec = new CustomSecurityModule();
        sec.logSecurityEvent("User authenticated via multi-factor auth.");
        sec.regularMethod();

        // 3. Testing final class
        ImmutableConfig config = new ImmutableConfig();
        config.showConfig();
    }
}
