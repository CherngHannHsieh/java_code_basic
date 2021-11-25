package com.xchedu.map_;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap_ {
    public static void main(String[] args) {
        //默認建構子仍是無序
        //要求 : 按照key的String大小進行排序
//        TreeMap treeMap = new TreeMap();
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
//                return ((String) o1).compareTo((String) o2);
                return ((String) o1).length() - ((String) o2).length();
            }
        });

        treeMap.put("jack","jack01");
        treeMap.put("tommy","tom1");
        treeMap.put("hsp","hsp01");
        treeMap.put("lickky","lic1111");
        treeMap.put("an","ann011111");
        treeMap.put("an","ann2");

        System.out.println(treeMap);
    }
}
