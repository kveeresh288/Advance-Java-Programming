// 4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
// Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
// pressed by implementing the event handling mechanism with addActionListener( ).

//code:
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class _4c_ClockIconButtons {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Clock Button Example");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create a label to display the message
        JLabel messageLabel = new JLabel("Click a button");
        messageLabel.setFont(new Font("Arial", Font.BOLD, 20));

        // Load image icons (Make sure image paths are correct or in same directory)
        ImageIcon digitalIcon = new ImageIcon("/Users/kveeresh/Desktop/Advance-Java-Programming-Assignment/4c.Swing/digital.png"); // replace with actual file path or name
        ImageIcon hourglassIcon = new ImageIcon("/Users/kveeresh/Desktop/Advance-Java-Programming-Assignment/4c.Swing/hourglass.png"); // replace with actual file path or name

        // Create buttons with icons
        JButton digitalButton = new JButton(digitalIcon);
        JButton hourglassButton = new JButton(hourglassIcon);

        // Add tool tips
        digitalButton.setToolTipText("Digital Clock");
        hourglassButton.setToolTipText("Hour Glass");

        // Add action listeners
        digitalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Digital Clock is pressed");
            }
        });

        hourglassButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Hour Glass is pressed");
            }
        });

        // Add components to frame
        frame.add(digitalButton);
        frame.add(hourglassButton);
        frame.add(messageLabel);

        // Center and display
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}