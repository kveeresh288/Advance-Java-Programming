// 1b 3. Write a java program for getting different colors through ArrayList interface and  
// sort them using Collections.sort( ArrayListObj)

//code:

import java.util.*;

public class _1b_SortColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Orange", "Red", "Blue", "Green"));

        System.out.println("Before Sorting: " + colors);
        Collections.sort(colors);
        System.out.println("After Sorting: " + colors);
    }
}