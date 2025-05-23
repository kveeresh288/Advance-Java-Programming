// 5a. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
// Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
// display them on console whenever the countries are selected on the list.

//code : 

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class _5a_CountryJList {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Country Selector");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Country data
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
        };

        // Create JList
        JList<String> countryList = new JList<>(countries);
        countryList.setVisibleRowCount(8);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrollPane = new JScrollPane(countryList);

        // List selection listener
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    java.util.List<String> selected = countryList.getSelectedValuesList();
                    System.out.println("Selected Countries:");
                    for (String country : selected) {
                        System.out.println(country);
                    }
                    System.out.println("-------------------------");
                }
            }
        });

        // Add to frame
        frame.add(new JLabel("Select countries:"));
        frame.add(scrollPane);

        // Center and show
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}