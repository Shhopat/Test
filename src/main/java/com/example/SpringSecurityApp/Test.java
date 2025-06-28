package com.example.SpringSecurityApp;

import java.util.*;

public class Test {

    public static void show(int[] ints1, int[] ints2) {
        List<Integer> list = new ArrayList<>();
        for (int x : ints1) {
            for (int y : ints2) {
                if (x == y) {
                    list.add(x);
                }
            }
        }
        


    }


    public static void main(String[] args) {
        int[] ints = {110, 2, 3, 41, 10, 9, 4, -100, 10000};
        int[] ints2 = {0, 22, 33, 141, 10, 99, 14, -1, 10000};
        String string = "1se2r";
//        System.out.println(palidrom(string));
//        palidrom(string);
//        System.out.println(show(ints,10));

//        System.out.println(show(ints));
//        System.out.println(show(ints,2));
//        System.out.println(show(string));
        show(ints,ints2);

//        System.out.println(show(ints, 23));
//        show(string);
//        System.out.println(show(ints));


    }


}






