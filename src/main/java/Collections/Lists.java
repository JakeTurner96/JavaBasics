package Collections;

import java.util.*;

public class Lists {

    public static void main(String[] args) {
        //ArrayList
        //Ordered - Elements preserve the order in which they were added
        //Dynamic resizing - ArrayList grows dynamically as more elements are added
        //Non synchronised
        //Allows duplicates
        //Random access
        //Best for frequent retrieval

        //Basic usage
        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(6);
        arrayList.add(4);
        arrayList.add(2);

        arrayList.set(3, 7);

        System.out.println("\nUnsorted ArrayList:");
        arrayList.forEach(System.out::println);
        System.out.println("\nGet element at index 3:  " + arrayList.get(3));

        Collections.sort(arrayList);
        System.out.println("\nSorted ArrayList:");
        arrayList.forEach(System.out::println);

        System.out.println("\nArrayList contains 7: " + arrayList.contains(7));
        System.out.println("\nRemoving 6");
        Object num = 7;
        arrayList.remove(num);
        System.out.println("\nArrayList contains 7: " + arrayList.contains(7));

        //LinkedList
        //Ordered - Elements preserve the order in which they were added
        //Implements List and Deque interfaces (Can be used as a queue, deque or stack)
        //Permits all elements - Including duplicates and NULL
        //Non synchronised
        //Best for frequent insertion and deletion

        //Basic usage
        List<String> linkedList = new LinkedList<>();

        //Add elements
        linkedList.add("Jake");
        linkedList.add("Andy");
        linkedList.add("Hannah");
        linkedList.add("Sam");
        linkedList.add("Jenny");

        linkedList.set(3, "Connor");

        System.out.println("\nUnsorted LinkedList:");
        linkedList.forEach(System.out::println);
        System.out.println("\nGet element at index 4: " + linkedList.get(4));

        Collections.sort(linkedList);
        System.out.println("\nSorted LinkedList:");
        linkedList.forEach(System.out::println);

        System.out.println("\nLinkedList contains 'Jake': " + linkedList.contains("Jake"));
        System.out.println("\nRemoving 'Jake'");
        linkedList.remove("Jake");
        System.out.println("\nLinkedList contains 'Jake': " + linkedList.contains("Jake"));
    }
}
