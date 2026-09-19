/**
 * SwingFirstApp.java
 *
 * Example 1 from Notes:
 * Creating a simple Java Swing window using JFrame and JButton.
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingFirstApp {

    public static void main(String[] args) {
        // Creating an instance of JFrame (top-level window)
        JFrame frame = new JFrame("Java Swing First Demo");

        // Creating an instance of JButton
        JButton button = new JButton("GFG WebSite Click");

        // x axis, y axis, width, height (absolute positioning)
        button.setBounds(150, 200, 220, 50);

        // Adding an action listener so clicking the button shows a dialog
        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "You clicked the Swing Button!");
        });

        // Adding button inside the JFrame container
        frame.add(button);

        // Set dimensions (500 width and 600 height)
        frame.setSize(500, 600);

        // Using no layout managers (null layout for exact setBounds positioning)
        frame.setLayout(null);

        // Close window when user clicks the 'X' button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Center window on screen
        frame.setLocationRelativeTo(null);

        // Making the frame visible to the user
        frame.setVisible(true);
    }
}
