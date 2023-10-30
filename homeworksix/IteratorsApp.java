package com.telran.org.homeworksix;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorsApp {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6,7,8};
        CustomIterator customIterator = new CustomIterator(array);
        while(customIterator.hasNext()){
            System.out.println(customIterator.next());
        }

        System.out.println("");
        int size = 10000000;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long starTime = System.currentTimeMillis();
        for (int i : list) {
            int temp = i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("For - each : " + (endTime - starTime) + " ms");

        starTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Classic For : " + (endTime - starTime) + "ms");


        int listSize = list.size();
        starTime = System.currentTimeMillis();
        for (int i = 0; i < listSize; i++) {
            int temp = list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Classic for in variable : " + (endTime - starTime) + " ms");


        starTime = System.currentTimeMillis();
        for (int i = listSize - 1; i >= 0; i--) {
            int temp = list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Classic for reverse : " + (endTime - starTime) + " ms");


        Iterator<Integer> iterator = list.iterator();
        starTime = System.currentTimeMillis();
        while (iterator.hasNext()) {
            int temp = iterator.next();
        }
        endTime = System.currentTimeMillis();
        System.out.println("With iterator : " + (endTime - starTime) + " ms");


        ListIterator<Integer> listIterator = list.listIterator();
        starTime = System.currentTimeMillis();
        while (listIterator.hasNext()) {
            int temp = listIterator.next();
        }
        endTime = System.currentTimeMillis();
        System.out.println("With List Iterator : " + (endTime - starTime) + " ms");
    }
}
