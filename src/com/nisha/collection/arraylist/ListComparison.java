package com.nisha.collection.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListComparison {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        for (String name : new String[]{"A", "B", "C", "D", "E"}) {
            arrayList.add(name);
            linkedList.add(name);
        }

        arrayList.add(0, "X");
        linkedList.add(0, "X");

        arrayList.add("Y");
        linkedList.add("Y");

        System.out.println("ArrayList index 3: " + arrayList.get(3));
        System.out.println("LinkedList index 3: " + linkedList.get(3));


        arrayList.remove(0);
        linkedList.remove(0);

        arrayList.remove(2);
        linkedList.remove(2);

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
    }
}

