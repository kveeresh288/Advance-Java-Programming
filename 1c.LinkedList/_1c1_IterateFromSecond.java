// 1c 1. Write a Java program to iterate through all elements in a linked list starting at the
// specified position (2nd) using iterator (hint: Iterator iteratorobj = listobj.listIterator(1))

//code :
import java.util.*;

public class _1c1_IterateFromSecond {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Apple", "Banana", "Orange", "Grapes"));
            System.out.println("Original List: "+list);
           ListIterator<String> iterator = list.listIterator(1); // Start at 2nd position (index 1)
           System.out.println("List Iteration from position 2: ");
           System.out.print("[ ");
           while (iterator.hasNext()) {
               System.out.print(iterator.next()+ " ");
           }
           System.out.println("]");
   }
}