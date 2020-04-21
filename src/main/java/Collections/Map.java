package Collections;

import java.util.*;

//Stores unique data in key value pairs (No duplicate keys).
public class Map<S, S1> {

    public static void main(String[] args) {
        //HashMap
        //Does not guarantee any specific order of the elements
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(2, "b");
        hashMap.put(4, "d");
        hashMap.put(1, "a");
        hashMap.put(5, "e");
        hashMap.put(3, "c");

        System.out.println("\nHashMap:");
        Iterator<Integer> itr = hashMap.keySet().iterator();

        hashMap.forEach((key, value) -> System.out.println("Key:"+ key + ", Value:" + value));

        System.out.println("\nHashMap contains value 'a': " + hashMap.containsValue("a"));
        System.out.println("HashMap contains key 20: " + hashMap.containsKey(20));

        //LinkedHashMap
        //Maintains insertion order of key value pair
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("England", "London");
        linkedHashMap.put("France", "Paris");
        linkedHashMap.put("Japan", "Tokyo");
        linkedHashMap.put("Hungary", "Budapest");
        linkedHashMap.put("Italy", "Rome");

        System.out.println("\nLinkedHashMap:");

        linkedHashMap.forEach((key, value) -> System.out.println("Key:"+ key + ", Value:" + value));

        System.out.println("\nLinkedHashMap contains value 'Tokyo': " + linkedHashMap.containsValue("Tokyo"));
        System.out.println("LinkedHashMap contains key 'Peru': " + linkedHashMap.containsKey("Peru"));

        //TreeMap
        //Stores keys in sorted order
        SortedMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("Microsoft", "Bill Gates");
        treeMap.put("Apple", "Steve Jobs");
        treeMap.put("Tesla", "Elon Musk");
        treeMap.put("Facebook", "Mark Zuckerberg");
        treeMap.put("Virgin", "Richard Branson");

        System.out.println("\nTreeMap:");

        treeMap.forEach((key, value) -> System.out.println("Key:"+ key + ", Value:" + value));

        System.out.println("\nTreeMap contains value 'Bill Gates': " + treeMap.containsValue("Bill Gates"));
        System.out.println("TreeMap contains key 'Amazon': " + treeMap.containsKey("Amazon"));

    }
}
