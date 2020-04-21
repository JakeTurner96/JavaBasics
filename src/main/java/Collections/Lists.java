package Collections;

import java.util.*;

//Ordered collection of elements accessible by integer index.
public class Lists {

    public static void main(String[] args) {
        //ArrayList
        //Dynamic resizing
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(10,5,2,8,3,9,1,6,4,7));

        System.out.println("\nUnsorted ArrayList:");
        arrayList.forEach(System.out::println);

        System.out.println("\nSorted ArrayList:");
        Collections.sort(arrayList);
        arrayList.forEach(System.out::println);

        System.out.println("\nArrayList contains 10: " + arrayList.contains(10));

        //LinkedList
        //Maintains insertion order
        List<String> linkedList = new LinkedList<>();

        linkedList.add("Jake");
        linkedList.add("Andy");
        linkedList.add("Hannah");
        linkedList.add("Sam");
        linkedList.add("Jenny");

        System.out.println("\nUnsorted LinkedList:");
        linkedList.forEach(System.out::println);

        Collections.sort(linkedList);
        System.out.println("\nSorted LinkedList:");
        linkedList.forEach(System.out::println);

        System.out.println("\nLinkedList contains 'Simon': " + linkedList.contains("Simon"));

    }
}
