package com.example.SpringSecurityApp;

import java.util.*;

public class Test {

    public static void show(int[] ints1, int[] ints2) {
        Set<Integer> set = new HashSet<>();
        for (int x : ints1) {
            for (int y : ints2) {
                if (x == y) {
                    set.add(x);
                }
            }
        }
        System.out.println(set);

    }


    public static void main(String[] args) {
        int[] ints = {10, 2, 3, 41, 10, 9, 4, -100, 10000};
        int[] ints2 = {0, 22, 33, 141, 10, 99, 4, -1, 10000};
        String string = "123";


//        System.out.println(show(ints,10));

//        System.out.println(show(ints));
//        System.out.println(show(ints,10));
//        System.out.println(show(string));
        show(ints,ints2);
//        show(ints);
//        System.out.println(show(ints, 23));
//        show(string);
//        System.out.println(show(ints));


    }


}






