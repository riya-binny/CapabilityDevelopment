package Data_Structures.Sets;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("hello");
        hashSet.add("hey");
        hashSet.add("hi");

        // Before clear
        System.out.println(hashSet);
        hashSet.clear();

        // After clear
        System.out.println(hashSet);

        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);

        // Convert to array
        Object[] intArray = intSet.toArray();
        for(int i = 0; i<intArray.length;i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        HashSet<Integer> integers = new HashSet<>();
        integers.add(2);
        integers.add(5);

        // Intersection of 2 sets
        intSet.retainAll(integers);
        System.out.println(intSet);
    }
}
