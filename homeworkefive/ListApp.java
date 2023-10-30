package com.telran.org.homeworkefive;

import java.util.*;

public class ListApp {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        List<String> strings = new ArrayList<>();


        multiply(list);
        stringLength(strings);
        oddNumber(odd);
        getNoDublicateList();
    }

    public static void multiply(List<Integer> list) {
        List<Integer> resultList = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(12);
        list.add(15);

        for (Integer result : list) {
            resultList.add(result * 2);
        }
        System.out.println(resultList);
    }

    public static void stringLength(List<String> list) {
        List<String> stringList = new ArrayList<>();
        list.add("Phone");
        list.add("Lamp");
        list.add("Desktop");
        list.add("Printer");
        list.add("Dog");

        for (String l : list) {
            stringList.add(String.valueOf(l.length()));
        }
        System.out.println(stringList);
    }

    public static void oddNumber(List<Integer> list) {
        ArrayList<Integer> evenNumber = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(10);
        list.add(1);
        list.add(15);

        for (Integer result : list) {
            if (result % 2 != 0) {
                System.out.print(result + " ");
                evenNumber.remove(list);
            }
        }
    }


    private static void getNoDublicateList() {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("A");
        stringSet.add("A");
        stringSet.add("B");
        stringSet.add("C");
        stringSet.add("D");
        stringSet.add("D");
        stringSet.add("E");
        stringSet.add("F");
        stringSet.add("G");
        stringSet.add("G");
        System.out.println();
        System.out.println(stringSet);

    }
}












