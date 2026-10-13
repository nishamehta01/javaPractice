package com.nisha.collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOperations {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 2, 9, 5, 1));
        int largest = numbers.get(0);
        int smallest = numbers.get(0);

        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }

            if (num < smallest) {
                smallest = num;
            }
        }
        int count = 0;

        for (int num : numbers) {
            if (num == 5) {
                count++;
            }
        }
        int firstIndex = numbers.indexOf(2);
        int lastIndex = numbers.lastIndexOf(2);

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
        System.out.println("Count of 5: " + count);
        System.out.println("First index of 2: " + firstIndex);
        System.out.println("Last index of 2: " + lastIndex);
    }
}