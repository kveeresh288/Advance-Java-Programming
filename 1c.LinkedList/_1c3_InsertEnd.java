// 1c 3. Write a Java program to insert the specified element at the end of a linked list. (using l_listobj.offerLast("Pink"))

//code:

import java.util.*;

public class _1c3_InsertEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue"));
        list.offerLast("Pink");

        System.out.println("Updated List: " + list);
    }
}