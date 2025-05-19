/* 
 *  1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
and a LinkedList to perform the following operations with different functions directed as
follows
    1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list
*/


import java.util.*;
public class ListExample {

    public static void main(String[] args) {

        // Step 1: Initialize the lists
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // Step 2: Add initial elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("Initial Lists:");
        displayLists(arrayList, linkedList);

        // Step 3: Insert element at specific position
        arrayList.add(1, "Mango");
        linkedList.add(1, "Mango");

        // Step 4: Add multiple items
        List<String> newFruits = Arrays.asList("Papaya", "Kiwi");
        arrayList.addAll(newFruits);
        linkedList.addAll(newFruits);

        System.out.println("\nAfter Adding at Index and Adding Multiple Elements:");
        displayLists(arrayList, linkedList);

        // Step 5: Access specific element
        System.out.println("\nAccess element at index 2:");
        System.out.println("ArrayList: " + arrayList.get(2));
        System.out.println("LinkedList: " + linkedList.get(2));

        // Step 6: Update an element
        arrayList.set(0, "Guava");
        linkedList.set(0, "Guava");

        System.out.println("\nAfter Updating index 0 to 'Guava':");
        displayLists(arrayList, linkedList);

        // Step 7: Remove an element
        arrayList.remove("Banana");
        linkedList.remove("Banana");

        System.out.println("\nAfter Removing 'Banana':");
        displayLists(arrayList, linkedList);

        // Step 8: Search for an element
        System.out.println("\nDoes the list contain 'Orange'?");
        System.out.println("ArrayList: " + arrayList.contains("Orange"));
        System.out.println("LinkedList: " + linkedList.contains("Orange"));

        // Step 9: Get list size
        System.out.println("\nList Sizes:");
        System.out.println("ArrayList: " + arrayList.size());
        System.out.println("LinkedList: " + linkedList.size());

        // Step 10: Iterate using enhanced for-loop
        System.out.println("\nIterating with for-each:");
        printList("ArrayList", arrayList);
        printList("LinkedList", linkedList);

        // Step 11: Iterate using Iterator
        System.out.println("\nIterating with Iterator:");
        printWithIterator("ArrayList", arrayList);
        printWithIterator("LinkedList", linkedList);

        // Step 12: Sort the lists
        Collections.sort(arrayList);
        Collections.sort(linkedList);

        System.out.println("\nAfter Sorting:");
        displayLists(arrayList, linkedList);

        // Step 13: Create sublist
        List<String> subArrayList = arrayList.subList(1, 3);
        List<String> subLinkedList = linkedList.subList(1, 3);

        System.out.println("\nSublist from index 1 to 2:");
        System.out.println("ArrayList Sublist: " + subArrayList);
        System.out.println("LinkedList Sublist: " + subLinkedList);

        // Step 14: Clear all elements
        arrayList.clear();
        linkedList.clear();

        System.out.println("\nAfter Clearing the Lists:");
        displayLists(arrayList, linkedList);
    }

    // Utility method to print both lists
    private static void displayLists(List<String> arrayList, List<String> linkedList) {
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
    }

    // Print list using enhanced for loop
    private static void printList(String name, List<String> list) {
        System.out.print(name + ": ");
        for (String item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // Print list using Iterator
    private static void printWithIterator(String name, List<String> list) {
        System.out.print(name + ": ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}