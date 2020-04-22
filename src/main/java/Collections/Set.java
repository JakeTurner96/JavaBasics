package Collections;
import java.util.*;

public class Set {

    public static void main(String[] args) {
        //HashSet
        //Does not guarantee iteration order
        //Non synchronised
        //Ideal when we want to store only unique elements
        AbstractSet<Integer> hashSet = new HashSet<>();

        hashSet.add(3);
        hashSet.add(9);
        hashSet.add(10);
        hashSet.add(5);
        hashSet.add(20);

        System.out.println("\nHashSet:");
        hashSet.forEach(System.out::println);
        System.out.println("\nHashSet contains 20: " + hashSet.contains(20));
        System.out.println("\nRemoving element 20");
        hashSet.remove(20);
        System.out.println("\nHashSet contains 20: " + hashSet.contains(20));

        //LinkedHashSet
        //Very similar to HashSet
        //Main difference is LinkedHashSet guarantees iteration order (Order elements were inserted)
        //Ideal when we want to store only unique elements in the order they were added
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("London");
        linkedHashSet.add("New York");
        linkedHashSet.add("Tokyo");
        linkedHashSet.add("Moscow");
        linkedHashSet.add("Paris");

        System.out.println("\nLinkedHashSet:");
        linkedHashSet.forEach(System.out::println);
        System.out.println("\nLinkedHashSet contains 'New York': " + linkedHashSet.contains("New York"));
        System.out.println("\nRemoving 'New York'");
        linkedHashSet.remove("New York");
        System.out.println("\nLinkedHashSet contains 'New York': " + linkedHashSet.contains("New York"));

        //TreeSet
        //Very similar to HashSet
        //Main difference is TreeSet stores the elements in sorted order
        //Ideal when we want to store unique elements in sorted order
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(21);
        treeSet.add(17);
        treeSet.add(7);
        treeSet.add(14);
        treeSet.add(9);

        System.out.println("\nTreeSet:");
        treeSet.forEach(System.out::println);
        System.out.println("\nTreeSet contains 17: " + treeSet.contains(17));
        System.out.println("Removing element 17");
        treeSet.remove(17);
        treeSet.remove(17);
        System.out.println("\nTreeSet contains 17: " + treeSet.contains(17));
    }
}
