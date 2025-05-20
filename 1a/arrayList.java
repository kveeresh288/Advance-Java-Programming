package list1;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class lab1 {
	public static void main(String []args) {
		//Creating different types of list
		ArrayList<String> arrayList = new ArrayList<>();
		
		System.out.print("===ArrayList Demonstrations===");
		//1.adding elements
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Orange");
		System.out.print("\nAfter ing the elements: "+arrayList);
		//2.Adding element specific index
		arrayList.add(1,"Mango");
		System.out.print("\ner adding the element: "+arrayList);
		//3.Adding multiple elements
		arrayList.addAll(Arrays.asList("Grape","Pineapple"));
		System.out.print("\ner adding multiple elements"+arrayList);
		//4.Accessing elements
		String firstFruit = arrayList.get(0);
		System.out.print("Firstfruit: "+firstFruit);
		//5.Updating elements
		arrayList.set(1, "kiwi");
		System.out.println("\ner updateing the first index: "+arrayList);
		//6.Removing elements
		arrayList.remove("Orange");
		arrayList.remove(0);
		System.out.println("\nter removing elements: "+arrayList);
		//7.Searching elements
		boolean containsKiwi = arrayList.contains("kiwi");
		int grapeIndex = arrayList.indexOf("Grape");
		System.out.println("contains kiwi? "+containsKiwi);
		System.out.println("Index of grape: "+grapeIndex);
		//8.List Size
		System.out.println("Listsize: "+arrayList.size());
		//9.Iterating over list
		System.out.println("\nIterating using for-each loop: ");
		for(String fruit : arrayList) {
			System.out.println(fruit);
		}
		//10.using iterator
		System.out.println("\nIterating using iterator: ");
		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		//11.sorting
		Collections.sort(arrayList);
		System.out.println("After sorting: "+arrayList);
		//12.sublist
		List<String> subList = arrayList.subList(0,2);
		System.out.println("sublist(0-2)" + subList);
		//13.Clearing the list
		arrayList.clear();
		System.out.println("After clearing: "+arrayList);
		//LinkedList spcific operations
		System.out.println("===linkedlist operations===");
		LinkedList<String> fruits = new LinkedList<>();
		fruits.addFirst("Apple");
		fruits.addLast("Banana");
		fruits.add("Orange");
		System.out.println("LinkedList: "+fruits);
		System.out.println("First element: "+fruits.getFirst());
		System.out.println("Last element: "+fruits.getLast());
		fruits.removeFirst();
		fruits.removeLast();
		System.out.println("After removing first and last: "+fruits);

		}
}
