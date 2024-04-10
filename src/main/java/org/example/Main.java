package org.example;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(); // doesn't keep the order
        set.add("d");
        set.add("b");
        set.add("D");
        set.add("d");

        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            String str = itr.next();
            System.out.print(str + " ");
        }

        LinkedHashSet<String> set1 = new LinkedHashSet<>(); //Keep the order
        set1.add("3");
        set1.add("2");
        set1.add("1");
        set1.add("1");

        System.out.println(set1.size());
        System.out.println(set1.remove("2"));
        System.out.println("Does contain : " + set1.contains("2"));

        System.out.println(set1);

        TreeSet<String> set3 = new TreeSet<>();

        set3.add("2");
        set3.add("2");
        set3.add("2");
        set3.add("A");
        set3.add("B");
        set3.add("C");

        System.out.println(set3);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        linkedHashSet.add("D");
        String[] values = new String[linkedHashSet.size()];
        linkedHashSet.toArray(values);
        System.out.println(Arrays.toString(values));

    }
}