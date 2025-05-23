// 1c 5. Write a Java program that swaps two elements (first and third elements) in a 
//  linked list (using Collections.swap(l_list, 0, 2))

//code :

import java.util.*;

public class _1c5_SwapElements {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        System.out.println("Before Swap: " + list);

        Collections.swap(list, 0, 2); // Swap 1st and 3rd
        System.out.println("After Swap: " + list);
    }
}