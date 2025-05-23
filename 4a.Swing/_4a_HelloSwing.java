// 4a. Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing
// Programming in Blue color plain font with font size of 32 using Jframe and Jlabel

//code:

import javax.swing.*;
import java.awt.*;

public class _4a_HelloSwing {
    public static void main(String[] args) {
        // Create a JFrame with a title
        JFrame frame = new JFrame("Swing Hello Program");

        // Create a JLabel with the desired message
        JLabel label = new JLabel("Hello! VI B, Welcome to Swing Programming", SwingConstants.CENTER);

        // Set font style (Plain), size (32), and color (Blue)
        label.setFont(new Font("Serif", Font.PLAIN, 32));
        label.setForeground(Color.BLUE);

        // Add label to the frame
        frame.add(label);

        // Set frame size
        frame.setSize(700, 200);

        // Close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Make frame visible
        frame.setVisible(true);
    }
}