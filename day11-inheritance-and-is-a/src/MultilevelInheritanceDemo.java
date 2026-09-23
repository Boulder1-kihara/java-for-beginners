/**
 * MultilevelInheritanceDemo.java
 *
 * Demonstrates:
 * Multilevel Inheritance: Class C extends Class B, and Class B extends Class A.
 *
 *    LivingOrganism (Level 1)
 *          ▲
 *          │
 *       Mammal     (Level 2)
 *          ▲
 *          │
 *        Canine    (Level 3)
 */
class LivingOrganism {
    void breathe() {
        System.out.println("🫁 Respiration: Inhaling oxygen and exhaling carbon dioxide.");
    }
}

class Mammal extends LivingOrganism {
    void nurseYoung() {
        System.out.println("🍼 Mammalian trait: Warm-blooded and produces milk for offspring.");
    }
}

class Canine extends Mammal {
    void bark() {
        System.out.println("🐕 Canine trait: Alert barking and keen sense of smell.");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Multilevel Inheritance Demonstration ===");

        Canine wolf = new Canine();

        // Level 1 inherited method
        wolf.breathe();

        // Level 2 inherited method
        wolf.nurseYoung();

        // Level 3 specific method
        wolf.bark();
    }
}
