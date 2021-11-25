package com.xchedu.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 30; i++) {
            list.add("hello" + i);
        }
        list.add(1,"韓順平教育");
        System.out.println(list.get(4));
        list.remove(5);
        list.set(6,"change6");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.print(next + " ");
        }
    }
}