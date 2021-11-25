package com.xchedu.collection_;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        //Object
        list.add("javk");
        list.add(10);
        list.add(true);
        System.out.println(list);
        //remove(int) 刪除第一個元素
//        list.remove(0);
        list.remove(true); //刪除特定元素
        System.out.println(list);
        //contains() 包含特定元素
        System.out.println(list.contains("javk"));
        //size 獲取元素個數
        System.out.println(list.size());
        //isEmpty() 是否為空
        System.out.println(list.isEmpty());
//        clear() 清空
        list.clear();
        System.out.println(list);

        ArrayList list1 = new ArrayList();
        list1.add("wwww");
        list1.add("wddd");

        //addAll添加多個元素
        list.addAll(list1);
        System.out.println(list);

        //查找多個元素是否都存在
        System.out.println(list.containsAll(list1));
        //刪除多個元素
        list.add("wfffs");
        list.removeAll(list1);
        System.out.println(list);
    }
}
