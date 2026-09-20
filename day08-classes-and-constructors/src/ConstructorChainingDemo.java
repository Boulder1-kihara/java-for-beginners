/**
 * ConstructorChainingDemo.java
 *
 * Demonstrates:
 * 1. Constructor Overloading: multiple constructors with distinct parameter lists.
 * 2. Constructor Chaining with 'this()': one constructor invoking another
 *    to eliminate redundant initialization code.
 * 3. Default (no-arg) vs Parameterized constructors.
 */
public class ConstructorChainingDemo {

    static class Student {
        String name;
        int age;
        String course;

        /**
         * 1. Default (No-arg) Constructor:
         * Uses this(...) to call the 3-parameter constructor with default values.
         * Must be the FIRST statement in the constructor!
         */
        public Student() {
            this("Unknown Student", 18, "Undeclared");
            System.out.println("-> No-arg constructor executed via chaining.");
        }

        /**
         * 2. Constructor with 2 parameters (name and age):
         * Chains to the 3-parameter constructor with default course.
         */
        public Student(String name, int age) {
            this(name, age, "General Studies");
            System.out.println("-> 2-parameter constructor executed via chaining.");
        }

        /**
         * 3. Master Constructor with all 3 parameters:
         * Performs the actual field assignment.
         */
        public Student(String name, int age, String course) {
            this.name = name;
            this.age = age;
            this.course = course;
            System.out.println("-> Master 3-parameter constructor initialized: " + name);
        }

        public void displayCard() {
            System.out.println("🎓 Student: " + name + " | Age: " + age + " | Major: " + course);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Constructor Chaining Demo ===");

        System.out.println("\n1. Creating student with no arguments:");
        Student s1 = new Student();
        s1.displayCard();

        System.out.println("\n2. Creating student with name and age:");
        Student s2 = new Student("Alice Wambui", 21);
        s2.displayCard();

        System.out.println("\n3. Creating student with all details:");
        Student s3 = new Student("Brian Omondi", 23, "Computer Science");
        s3.displayCard();
    }
}
