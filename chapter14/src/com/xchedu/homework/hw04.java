package com.xchedu.homework;

import java.util.TreeSet;

public class hw04 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        /*
        1. 因為TreeSet是無參，所以在底層
        2. Comparable<? super K> k = (Comparable<? super K>) key; 即把Person類轉成Comparable類型

        */
        treeSet.add(new Person()); //ClassCastException
        treeSet.add(new Person());
        treeSet.add(new Person());
        treeSet.add(new Person());
        System.out.println(treeSet);
    }
}
class Person implements Comparable{

    @Override
    public int compareTo(Object o) {
        return 1;
    }
}