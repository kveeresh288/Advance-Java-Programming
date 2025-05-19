import java.util.*;

public class ArrayListSearchColor {
    public static void main(String[] args){
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        if (colors.contains("Red")) {
            System.out.println("Red is available.");
        } else {
            System.out.println("Red is not available.");
        }
    }
}