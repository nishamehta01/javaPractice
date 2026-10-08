package com.nisha.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class hello {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(5);
        ls.add(55);
        ls.add(56);
        ls.add(51);
        ls.add(58);
        ls.add(5);

        System.out.println(ls);
        ls.add(2,22);

        System.out.println(ls);
    }

}
