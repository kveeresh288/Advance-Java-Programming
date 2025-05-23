// 4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is
// pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the
// event handling mechanism with addActionListener( ).

// code:
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class _4b_CountryButton {
    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("Country Button Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create JLabel to display messages
        JLabel messageLabel = new JLabel("Press a button");
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 18));

        // Create buttons
        JButton indiaButton = new JButton("India");
        JButton srilankaButton = new JButton("Srilanka");

        // Add action listeners
        indiaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("India is pressed");
            }
        });

        srilankaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Srilanka is pressed");
            }
        });

        // Add components to frame
        frame.add(indiaButton);
        frame.add(srilankaButton);
        frame.add(messageLabel);

        // Center and show
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}