// 1b 4.Write a java program for getting different colors through ArrayList interface 
//     and extract the elements 1st and 2nd from the ArrayList object  by  using SubList()

//  code:

import java.util.*;

public class _1b4_SublistColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        System.out.println("Original List: " + colors);
        List<String> subColors = colors.subList(0, 2); // indices 0 and 1
        System.out.println("Sublist (1st and 2nd): " + subColors);
    }
}