import java.util.*;

public class _1b_RemoveColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        System.out.println("Original List: " + colors);

        if (colors.size() > 1) {
            colors.remove(1); // remove 2nd element (index 1)
        }

        System.out.println("Updated List after removing 2nd element and Value ='Blue' : " + colors);
        System.out.println("Updated List: " + colors);
    }
}