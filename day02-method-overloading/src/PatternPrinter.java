/**
 * PatternPrinter.java
 *
 * Demonstrates method overloading:
 * 1. display(): Prints a row of 10 asterisks '*' by default.
 * 2. display(char symbol): Prints a row of 10 custom symbols.
 */
public class PatternPrinter {

    // Method without parameter - prints default '*' pattern
    public void display() {
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // Overloaded method with single parameter - prints custom character pattern
    public void display(char symbol) {
        for (int i = 0; i < 10; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PatternPrinter printer = new PatternPrinter();

        System.out.println("Default pattern (no argument):");
        printer.display();

        System.out.println("Custom pattern (passing '#'):");
        printer.display('#');

        System.out.println("Custom pattern (passing '$'):");
        printer.display('$');
    }
}
