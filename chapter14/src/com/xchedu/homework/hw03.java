package com.xchedu.homework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hw03 {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("jack",650); //int -> Integer
        m.put("tom",1200);
        m.put("smith",29000);
        System.out.println(m);
        m.put("jack",2600); //replace()
        System.out.println(m);

        Set set1 = m.keySet();
        for (Object o : set1) {
            //更新 所以可以使用put
            m.put(o,(Integer)m.get(o)+100);
        }
        System.out.println(m);

//        Set entrySet = m.entrySet();
//        for (Object o : entrySet) {
//            Map.Entry entry = (Map.Entry) o;
//            System.out.println(entry.getKey() + " - "+ ((int) entry.getValue()+1000));
//        }

        Set set = m.keySet();
        for (Object o : set) {
            System.out.print(o + "\t");
        }
        System.out.println();
        Collection values = m.values();
        for (Object o : values) {
            System.out.print(o + "\t");
        }

    }
}