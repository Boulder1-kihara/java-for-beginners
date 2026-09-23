/**
 * HierarchicalInheritanceDemo.java
 *
 * Demonstrates:
 * Hierarchical Inheritance: Multiple subclasses extending from a single superclass.
 *
 *               Shape2D
 *              ▲       ▲
 *             ┌┘       └┐
 *             │         │
 *         Rectangle   Circle
 */
class Shape2D {
    String color = "Blue";

    void render() {
        System.out.println("Rendering a 2D shape with color: " + color);
    }
}

class Rectangle extends Shape2D {
    double width = 8.0;
    double height = 4.0;

    double calculateArea() {
        return width * height;
    }
}

class Circle extends Shape2D {
    double radius = 5.0;

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Hierarchical Inheritance Demonstration ===");

        Rectangle rect = new Rectangle();
        Circle circ = new Circle();

        System.out.println("\n-- Rectangle Object --");
        rect.render(); // Inherited from Shape2D
        System.out.println("Rectangle Area: " + rect.calculateArea());

        System.out.println("\n-- Circle Object --");
        circ.render(); // Inherited from Shape2D
        System.out.printf("Circle Area: %.2f%n", circ.calculateArea());
    }
}
