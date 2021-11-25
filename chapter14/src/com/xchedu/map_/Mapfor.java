package com.xchedu.map_;

import java.util.*;

public class Mapfor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("wang01",15);
        map.put("wang02",25);
        map.put("wang03",5);
        map.put("wang04",51);
        System.out.println(map);
        //1. 取出所有的 key
        Set keyset = map.keySet();
        //1-1
        for (Object o : keyset) {
            System.out.println(o + " - " +map.get(o));
        }
        //1-2
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next + " - " + map.get(next));
        }

        //2.把所有的values取出
        Collection values = map.values();
        //可以使用所有collections使用的方法
        //2-1
        for (Object o :values) {
            System.out.println(o);
        }
        //2-2
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            System.out.println(next);
        }

        //3. EntrySet來取得k-v
        //3.1
        Set entrySet = map.entrySet();
        for (Object entry : entrySet) {
            //將entry 轉成 Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + " - " + m.getValue());
        }

        //3.2
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object next =  iterator2.next();
//            System.out.println(next.getClass());//HashMap$Node -> Map.Entry
            Map.Entry m = (Map.Entry) next;
            System.out.println(m.getKey() + " - " + m.getValue());
        }
    }
}
