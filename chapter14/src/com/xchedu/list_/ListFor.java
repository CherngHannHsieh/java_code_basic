package com.xchedu.list_;

import java.util.*;

public class ListFor {
    public static void main(String[] args) {
//        List list = new ArrayList();
//        List list = new Vector();
        List list = new LinkedList();
        list.add("haha");
        list.add("What");
        list.add("Ina");
        list.add("DD");

        //1.
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.print(next + " ");
        }
        System.out.println();

        for (Object o :list) {
            System.out.print(o + " ");
        }
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
            System.out.println(i);
        }
    }
}
