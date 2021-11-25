package com.xchedu.list_;

import java.util.ArrayList;
import java.util.List;

public class List_ {
    public static void main(String[] args) {
        //1. List 集合類中元素有序，可重複
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("hsp");
        System.out.println(list);
        //2. List集合中的每個元素都有其對應的索引值
        System.out.println(list.get(3)); //hsp
    }
}
