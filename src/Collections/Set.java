package Collections;
import java.util.*;

//Sorted collection of unique elements (No duplicates).
public class Set {

    public static void main(String[] args) {
        //HashSet
        //Does not guarantee iteration order
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(3);
        hashSet.add(9);
        hashSet.add(10);
        hashSet.add(5);
        hashSet.add(20);

        System.out.println("\nHashSet:");
        hashSet.stream().forEach(System.out::println);

        System.out.println("\nHashSet contains 20: " + hashSet.contains(20));

        //LinkedHashSet
        //Maintains insertion order
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("London");
        linkedHashSet.add("New York");
        linkedHashSet.add("Tokyo");
        linkedHashSet.add("Moscow");
        linkedHashSet.add("Paris");

        System.out.println("\nLinkedHashSet:");
        linkedHashSet.stream().forEach(System.out::println);

        System.out.println("\nLinkedHashSet contains 'New York': " + linkedHashSet.contains("New York"));

        //TreeSet
        //Sores elements in sorted order
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(21);
        treeSet.add(17);
        treeSet.add(7);
        treeSet.add(14);
        treeSet.add(9);

        System.out.println("\nTreeSet:");
        treeSet.stream().forEach(System.out::println);

        System.out.println("\nTreeSet contains 10: " + treeSet.contains(10));
    }
}
