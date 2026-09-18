/**
 * ShapePolymorphismDemo.java
 *
 * Demonstrates:
 * Polymorphism via Method Overriding with Shapes.
 * A single method name 'render()' behaves differently depending on the shape.
 */

// Superclass
class Polygon {
    // method to render a shape
    public void render() {
        System.out.println("Rendering Polygon...");
    }
}

// Subclass 1
class Square extends Polygon {
    // renders Square
    @Override
    public void render() {
        System.out.println("Rendering Square...");
    }
}

// Subclass 2
class Circle extends Polygon {
    // renders circle
    @Override
    public void render() {
        System.out.println("Rendering Circle...");
    }
}

public class ShapePolymorphismDemo {
    public static void main(String[] args) {
        System.out.println("=== Shape Polymorphism Demo ===");

        // create an object of Square
        Square s1 = new Square();
        s1.render();

        // create an object of Circle
        Circle c1 = new Circle();
        c1.render();
    }
}
