package com.nisha.collection.arraylist;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class removeEven {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>
                (Arrays.asList(7, 20, 19, 40, 50, 66, 13));
        Iterator<Integer> it = numbers.iterator();

        while (it.hasNext()) {
            int num = it.next();
            if (num % 2 == 0) {
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}
