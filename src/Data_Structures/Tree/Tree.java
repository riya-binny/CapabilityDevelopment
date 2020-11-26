package Data_Structures.Tree;

import java.util.TreeMap;

public class Tree {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap();
        treeMap.put(1, "ABC");
        treeMap.put(2,"DEF");
        treeMap.put(5,"GHI");
        treeMap.put(4,"JKL");
        treeMap.put(3,"MNO");

        TreeMap<String, String> stringTreeMap = new TreeMap<>(new StringComparator());
        stringTreeMap.put("apple", "apple");
        stringTreeMap.put("aeroplane", "aeroplane");
        stringTreeMap.put("ball", "ball");
        stringTreeMap.put("bread", "bread");

        // Sort keys using Comparator
        System.out.println(stringTreeMap);

        // Search a key in tree map
        System.out.println(treeMap.containsKey(3));

        // Reverse order
        treeMap.descendingMap().forEach((k,v) -> System.out.print(k + " "));
        System.out.println();
    }
}

