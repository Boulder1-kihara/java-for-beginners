/**
 * AwtButtonDemo.java
 *
 * Example 2 from Notes:
 * Classic Java AWT program creating three buttons with captions:
 * "OK", "SUBMIT", and "CANCEL".
 */
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtButtonDemo {

    public AwtButtonDemo() {
        // Create an AWT Frame
        Frame f = new Frame("AWT Three Buttons Demo");

        // Button 1: OK button
        Button b1 = new Button("OK");
        b1.setBounds(100, 50, 80, 40);
        f.add(b1);

        // Button 2: SUBMIT button
        Button b2 = new Button("SUBMIT");
        b2.setBounds(100, 110, 80, 40);
        f.add(b2);

        // Button 3: CANCEL button
        Button b3 = new Button("CANCEL");
        b3.setBounds(100, 170, 80, 40);
        f.add(b3);

        // Frame configuration
        f.setSize(500, 500);
        f.setLayout(null); // Absolute positioning

        // Allow closing the AWT frame when 'X' is clicked
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
                System.exit(0);
            }
        });

        // Make the frame visible
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AwtButtonDemo();
    }
}
