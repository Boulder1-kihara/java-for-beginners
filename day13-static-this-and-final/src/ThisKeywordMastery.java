/**
 * ThisKeywordMastery.java
 *
 * Demonstrates the 4 major uses of the 'this' keyword:
 * 1. Resolving name ambiguity between instance fields and method parameters.
 * 2. In getters and setters.
 * 3. Constructor chaining using this(...) to invoke overloaded constructors.
 * 4. Passing 'this' as an argument to another method.
 */
class ComplexNumber {
    private final int real;
    private final int imaginary;

    // 1. Two-parameter master constructor
    public ComplexNumber(int real, int imaginary) {
        // 'this.real' distinguishes field from parameter 'real'
        this.real = real;
        this.imaginary = imaginary;
    }

    // 2. Single-parameter constructor: chains to 2-parameter constructor
    public ComplexNumber(int real) {
        this(real, real); // Calls ComplexNumber(real, real)
    }

    // 3. Zero-parameter constructor: chains to single-parameter constructor
    public ComplexNumber() {
        this(0); // Calls ComplexNumber(0)
    }

    @Override
    public String toString() {
        return this.real + " + " + this.imaginary + "i";
    }

    // 4. Passing 'this' to an external validator method
    public void validateSelf() {
        ComplexValidator.validate(this);
    }

    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }
}

class ComplexValidator {
    public static void validate(ComplexNumber c) {
        System.out.println("Validating Complex number passed as 'this': " + c);
    }
}

public class ThisKeywordMastery {
    public static void main(String[] args) {
        System.out.println("=== The 'this' Keyword In Action ===");

        ComplexNumber c1 = new ComplexNumber(4, 5);
        ComplexNumber c2 = new ComplexNumber(7);
        ComplexNumber c3 = new ComplexNumber();

        System.out.println("c1 (2 params): " + c1);
        System.out.println("c2 (1 param chained): " + c2);
        System.out.println("c3 (0 params chained): " + c3);

        System.out.println("\n-- Passing 'this' as Argument --");
        c1.validateSelf();
    }
}
