package com.nisha.collection.arraylist;

import java.util.*;

public class reverseArrayList {
    public static void main(String[] args)
    {
        List<Integer> num = new ArrayList<>(Arrays.asList(10,20,30,40,50));
//        Collections.reverse(num);

        int left = 0;
        int right = num.size() - 1;

        while(left < right) {
            int temp = num.get(left);
            num.set(left, num.get(right));
            num.set(right, temp);

            left++;
            right--;

            System.out.println(num);
        }
    }
}
