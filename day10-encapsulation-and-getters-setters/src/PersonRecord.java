/**
 * PersonRecord.java
 *
 * Demonstrates:
 * 1. Read-only fields (getter only).
 * 2. Write-validated fields (age must be within realistic human bounds 0-120).
 * 3. Consistent internal state representation.
 */
public class PersonRecord {

    // Private fields
    private final String nationalId; // Read-only after construction
    private String fullName;
    private int age;

    public PersonRecord(String nationalId, String fullName, int age) {
        this.nationalId = nationalId;
        this.fullName = fullName;
        setAge(age); // Route through setter to enforce validation rules
    }

    // Read-only getter for ID
    public String getNationalId() {
        return nationalId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName != null && !fullName.trim().isEmpty()) {
            this.fullName = fullName.trim();
        } else {
            System.out.println("❌ Invalid Name: Name cannot be null or empty.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("❌ Validation Error: Age " + age + " is outside valid range (0 - 120).");
        }
    }

    public void displayRecord() {
        System.out.println("👤 ID: " + nationalId + " | Name: " + fullName + " | Age: " + age);
    }

    public static void main(String[] args) {
        System.out.println("=== Person Record Encapsulation Demo ===");

        PersonRecord person = new PersonRecord("ID-55443322", "Grace Muthoni", 28);
        person.displayRecord();

        System.out.println("\n-- Testing Setter Validation --");
        person.setAge(29);
        person.setFullName("Grace M. Muthoni");
        person.displayRecord();

        // Testing invalid updates
        person.setAge(-5);    // Rejected!
        person.setAge(150);   // Rejected!
        person.setFullName(""); // Rejected!
        person.displayRecord(); // Remains unchanged!
    }
}
