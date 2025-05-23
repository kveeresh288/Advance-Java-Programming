// 5b. Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and
// display the concerned color whenever the specific tab is selected in the Pan.

// code:

import javax.swing.*;
import java.awt.*;

public class _5b_ColorTabbedPane {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Color TabbedPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // RED panel
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        tabbedPane.addTab("RED", redPanel);

        // BLUE panel
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        tabbedPane.addTab("BLUE", bluePanel);

        // GREEN panel
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        tabbedPane.addTab("GREEN", greenPanel);

        // Add tabbed pane to frame
        frame.add(tabbedPane);

        // Center and show frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}