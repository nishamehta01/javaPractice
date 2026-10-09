package com.nisha.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);

        System.out.println(numbers);
    }
}

/* Difference Between Collection and Collections-

 ------ Collection ->
 A Collection in Java is an interface that represents a group of objects as a single unit.
 It provides common methods such as add(), remove(), and size() to work with groups of elements.

 ---------Collections ->
Collections is a utility class in Java that provides static methods to perform operations on collection
objects, such as sorting, searching, reversing, and shuffling. */