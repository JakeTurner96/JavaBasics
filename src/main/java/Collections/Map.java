package Collections;

import java.util.*;

//Stores unique data in key value pairs (No duplicate keys).
public class Map<S, S1> {

    public static void main(String[] args) {
        //HashMap
        //Allows one null key and multiple null values
        //Cannot contain duplicate keys
        //Non synchronised
        //Does not guarantee any specific order of the elements
        AbstractMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(2, "b");
        hashMap.put(4, "d");
        hashMap.put(1, "a");
        hashMap.put(5, "e");
        hashMap.put(3, "c");

        System.out.println("\nHashMap:");
        hashMap.forEach((key, value) -> System.out.println("Key: "+ key + ", Value: " + value));
        System.out.println("\nGet value by key 3: " + hashMap.get(3));

        System.out.println("\nHashMap contains value 'a': " + hashMap.containsValue("a"));
        System.out.println("HashMap contains key 1: " + hashMap.containsKey(1));
        System.out.println("\nRemove entry by key 1");
        hashMap.remove(1);
        System.out.println("\nHashMap contains value 'a': " + hashMap.containsValue("a"));
        System.out.println("HashMap contains key 1: " + hashMap.containsKey(1));

        //HashTable
        //Very similar to HashMap
        //Main difference is HashTable is synchronised
        //Does not accept any null keys or values
        Hashtable<Integer, String> hashTable = new Hashtable<>();

        hashTable.put(1, "One");
        hashTable.put(2, "Two");
        hashTable.put(3, "Three");
        hashTable.put(4, "Four");
        hashTable.put(5, "Five");

        System.out.println("\nHashTable:");
        hashTable.forEach((key, value) -> System.out.println("Key: "+ key + ", Value: " + value));
        System.out.println("\nGet entry by key 2: " + hashTable.get(2));

        System.out.println("\nHashTable contains value 'Four': " + hashTable.containsValue("Four"));
        System.out.println("HashMap contains key 4: " + hashTable.containsKey(4));
        System.out.println("\nRemove entry by key 4");
        hashTable.remove(4);
        System.out.println("\nHashMap contains value 'Four': " + hashTable.containsValue("Four"));
        System.out.println("HashMap contains key 4: " + hashTable.containsKey(4));

        //LinkedHashMap
        //Very similar to HashMap
        //Main difference is LinkedHashMap maintains the insertion order of elements
        //Predictable iteration order
        //Allows one null key and multiple null values
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("England", "London");
        linkedHashMap.put("France", "Paris");
        linkedHashMap.put("Japan", "Tokyo");
        linkedHashMap.put("Hungary", "Budapest");
        linkedHashMap.put("Italy", "Rome");

        System.out.println("\nLinkedHashMap:");
        linkedHashMap.forEach((key, value) -> System.out.println("Key:"+ key + ", Value:" + value));
        System.out.println("\nGet entry by key 'Japan': " + linkedHashMap.get("Japan"));

        System.out.println("\nLinkedHashMap contains value 'Tokyo': " + linkedHashMap.containsValue("Tokyo"));
        System.out.println("\nLinkedHashMap contains key 'Japan': " + linkedHashMap.containsKey("Japan"));
        System.out.println("\nRemove entry by key 'Japan'");
        linkedHashMap.remove("Japan");
        System.out.println("\nLinkedHashMap contains value 'Tokyo': " + linkedHashMap.containsValue("Tokyo"));
        System.out.println("\nLinkedHashMap contains key 'Japan': " + linkedHashMap.containsKey("Japan"));

        //TreeMap
        //Very similar to HashMap
        //Main difference is TreeMap provides efficient way to store entries in sorted order
        //Ideal for storing and retrieving information in a sorted order
        SortedMap<String, String> treeMap = new TreeMap<>();

        treeMap.put("Microsoft", "Bill Gates");
        treeMap.put("Apple", "Steve Jobs");
        treeMap.put("Tesla", "Elon Musk");
        treeMap.put("Facebook", "Mark Zuckerberg");
        treeMap.put("Virgin", "Richard Branson");

        System.out.println("\nTreeMap:");
        treeMap.forEach((key, value) -> System.out.println("Key: "+ key + ", Value: " + value));
        System.out.println("\nGet entry by key 'Apple': " + treeMap.get("Apple"));

        System.out.println("\nTreeMap contains value 'Bill Gates': " + treeMap.containsValue("Bill Gates"));
        System.out.println("TreeMap contains key 'Microsoft': " + treeMap.containsKey("Microsoft"));
        System.out.println("\nRemove entry by key 'Microsoft'");
        treeMap.remove("Microsoft");
        System.out.println("\nTreeMap contains value 'Bill Gates': " + treeMap.containsValue("Bill Gates"));
        System.out.println("TreeMap contains key 'Microsoft': " + treeMap.containsKey("Microsoft"));
    }
}
