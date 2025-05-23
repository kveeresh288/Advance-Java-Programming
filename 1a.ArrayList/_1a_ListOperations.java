// 1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
// and a LinkedList to perform the following operations with different functions directed as
// follows:
// 	1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
// 	Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
// 	size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list

//  code:

import java.util.*;
public class _1a_ListOperations{
    public static void main(String[] args) {
        // 1. Adding elements
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        linkedList.addAll(arrayList); // add same elements to LinkedList

        // 2. Adding element at specific index
        arrayList.add(1, "Mango");
        linkedList.add(1, "Mango");

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Pineapple", "Grapes");
        arrayList.addAll(moreFruits);
        linkedList.addAll(moreFruits);

        // 4. Accessing elements
        System.out.println("ArrayList element at index 2: " + arrayList.get(2));
        System.out.println("LinkedList element at index 2: " + linkedList.get(2));

        // 5. Updating elements
        arrayList.set(0, "Kiwi");
        linkedList.set(0, "Kiwi");

        // 6. Removing elements
        arrayList.remove("Banana");
        linkedList.remove("Banana");

        // 7. Searching elements
        System.out.println("Apple in ArrayList? " + arrayList.contains("Apple"));
        System.out.println("Apple in LinkedList? " + linkedList.contains("Apple"));

        // 8. List size
        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("LinkedList size: " + linkedList.size());

        // 9. Iterating over list
        System.out.println("\nArrayList iteration (for-each):");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        System.out.println("\nLinkedList iteration (for-each):");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // 10. Using Iterator
        System.out.println("\nArrayList using Iterator:");
        Iterator<String> itr = arrayList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 11. Sorting
        Collections.sort(arrayList);
        Collections.sort(linkedList);
        System.out.println("\nSorted ArrayList: " + arrayList);
        System.out.println("Sorted LinkedList: " + linkedList);

        // 12. Sublist
        System.out.println("\nArrayList Sublist (1 to 3): " + arrayList.subList(1, 3));

        // 13. Clearing the list
        arrayList.clear();
        linkedList.clear();
        System.out.println("\nArrayList after clearing: " + arrayList);
        System.out.println("LinkedList after clearing: " + linkedList);
    }
}