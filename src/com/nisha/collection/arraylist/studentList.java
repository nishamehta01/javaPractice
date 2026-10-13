package com.nisha.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class studentList {
    public static void main(String[] args) {
        List<String> std = new ArrayList<>();

        std.add("Bella");
        std.add("rahul");
        std.add("lio");
        std.add("siya");
        std.add("diya");

        std.add(2, "riya");

        std.set(3, "rey");

        std.remove(4);

        std.remove("Bella");

        if (std.contains("diya")) {
            System.out.println(("Diya found!"));
        } else {
            System.out.println("Diya not Found!");
        }


        System.out.println("List of student: " + std);
    }
}
