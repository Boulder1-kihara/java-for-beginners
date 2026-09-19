/**
 * AwtCheckboxDemo.java
 *
 * Example 3 from Notes:
 * Adding a Label and Checkboxes for selecting known languages in an AWT Frame.
 */
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtCheckboxDemo {

    public AwtCheckboxDemo() {
        // Create an AWT Frame
        Frame f = new Frame("Language Selector Demo");

        // Label created
        Label l1 = new Label("Select known Languages:");
        l1.setBounds(100, 50, 180, 40);
        f.add(l1);

        // Checkbox 1: Hindi
        Checkbox c2 = new Checkbox("Hindi");
        c2.setBounds(100, 100, 100, 30);
        f.add(c2);

        // Checkbox 2: English
        Checkbox c3 = new Checkbox("English");
        c3.setBounds(100, 140, 100, 30);
        f.add(c3);

        // Checkbox 3: Marathi
        Checkbox c4 = new Checkbox("Marathi");
        c4.setBounds(100, 180, 100, 30);
        f.add(c4);

        // Set dimensions and layout
        f.setSize(500, 400);
        f.setLayout(null);

        // Window closing handler
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
                System.exit(0);
            }
        });

        // Show window
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AwtCheckboxDemo();
    }
}
