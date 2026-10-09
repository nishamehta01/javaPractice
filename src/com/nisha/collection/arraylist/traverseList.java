package com.nisha.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class traverseList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Normal For Loop :");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Enhanced For Loop :");
        for(int li : list) {
            System.out.println(li);
        }

        System.out.println("Iterator :");
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
