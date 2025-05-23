// 1c 2. Write a Java program to iterate a linked list in reverse order (using objlist.descendingIterator())

//code :

import java.util.*;

public class _1c2_ReverseIteration {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        System.out.println("Noramal list: "+ list);
        System.out.print("Reverse Itereated list using descendingIterator : [");
        Iterator<String> reverseIterator = list.descendingIterator();
        while (reverseIterator.hasNext()) {
            System.out.print(" "+reverseIterator.next());
        }
        System.out.print(" ]");
    }
}