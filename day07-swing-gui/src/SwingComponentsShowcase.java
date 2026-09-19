/**
 * SwingComponentsShowcase.java
 *
 * A modern, interactive Swing dashboard showcasing the key UI components
 * listed in the reference guide:
 * - JLabel & JTextField (text display & input)
 * - JPasswordField (password masking)
 * - JCheckBox & JRadioButton (toggle & grouped selection)
 * - JComboBox (dropdown menu)
 * - JSlider & JProgressBar (dynamic progress tracking)
 * - JButton & JOptionPane (actions & popup alerts)
 */
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class SwingComponentsShowcase extends JFrame {

    public SwingComponentsShowcase() {
        super("Java Swing Components Showcase (Day 7)");

        // Window setup
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550, 600);
        setLocationRelativeTo(null); // Center on screen
        setLayout(new BorderLayout(10, 10));

        // 1. Header Panel
        JLabel headerLabel = new JLabel("🚀 Java Swing Interactive Components Explorer", JLabel.CENTER);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(15, 10, 10, 10));
        add(headerLabel, BorderLayout.NORTH);

        // 2. Central Form Panel
        JPanel formPanel = new JPanel(new GridLayout(6, 2, 10, 15));
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 25, 10, 25));

        // Text input (JTextField)
        formPanel.add(new JLabel("Your Name:"));
        JTextField nameField = new JTextField("Student");
        formPanel.add(nameField);

        // Password input (JPasswordField)
        formPanel.add(new JLabel("Secret Code:"));
        JPasswordField passwordField = new JPasswordField("java123");
        formPanel.add(passwordField);

        // Dropdown selection (JComboBox)
        formPanel.add(new JLabel("Preferred Topic:"));
        String[] topics = {"Methods & Recursion", "Arrays & Matrices", "Polymorphism", "Swing & GUI"};
        JComboBox<String> topicDropdown = new JComboBox<>(topics);
        formPanel.add(topicDropdown);

        // Radio buttons (JRadioButton with ButtonGroup)
        formPanel.add(new JLabel("Experience Level:"));
        JPanel radioPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        JRadioButton beginnerBtn = new JRadioButton("Beginner", true);
        JRadioButton intermediateBtn = new JRadioButton("Intermediate");
        ButtonGroup expGroup = new ButtonGroup();
        expGroup.add(beginnerBtn);
        expGroup.add(intermediateBtn);
        radioPanel.add(beginnerBtn);
        radioPanel.add(intermediateBtn);
        formPanel.add(radioPanel);

        // Slider control (JSlider)
        formPanel.add(new JLabel("Progress Slider (0-100%):"));
        JSlider progressSlider = new JSlider(0, 100, 50);
        progressSlider.setMajorTickSpacing(25);
        progressSlider.setPaintTicks(true);
        progressSlider.setPaintLabels(true);
        formPanel.add(progressSlider);

        // Progress bar (JProgressBar)
        formPanel.add(new JLabel("Live Progress Bar:"));
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setValue(50);
        progressBar.setStringPainted(true);
        formPanel.add(progressBar);

        // Link slider changes to progress bar
        progressSlider.addChangeListener(e -> {
            progressBar.setValue(progressSlider.getValue());
        });

        add(formPanel, BorderLayout.CENTER);

        // 3. Bottom Action Panel
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 15));
        JCheckBox agreeTerms = new JCheckBox("I love learning Java!", true);
        JButton submitButton = new JButton("Submit & Celebrate 🎉");

        submitButton.addActionListener(e -> {
            String userName = nameField.getText();
            String chosenTopic = (String) topicDropdown.getSelectedItem();
            int currentVal = progressSlider.getValue();

            String message = String.format(
                "Great work, %s!\nTopic: %s\nProgress: %d%%\nAgreement: %s",
                userName, chosenTopic, currentVal, agreeTerms.isSelected() ? "Confirmed" : "Not checked"
            );

            // Trigger JOptionPane popup dialog
            JOptionPane.showMessageDialog(this, message, "Bootcamp Completed!", JOptionPane.INFORMATION_MESSAGE);
        });

        bottomPanel.add(agreeTerms);
        bottomPanel.add(submitButton);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        // Run GUI construction on the Event Dispatch Thread (EDT) for thread safety
        SwingUtilities.invokeLater(() -> {
            new SwingComponentsShowcase().setVisible(true);
        });
    }
}
