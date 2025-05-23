// 1b 5. Write a java program for getting different colors through ArrayList interface 
//     and delete nth  element from the ArrayList object  by  using remove by index

//  code :

import java.util.*;

public class _1b5_RemoveNthColor {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Pink"));

        int n = 3; // Delete 4th element (index 3)
        System.out.println("Before Removal: " + colors);
        if (n >= 0 && n < colors.size()) {
            colors.remove(n);
            System.out.println("After removing " + (n + 1) + "th element: " + colors);
        } else {
            System.out.println("Invalid index.");
        }
    }
}