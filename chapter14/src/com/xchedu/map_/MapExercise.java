package com.xchedu.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExercise {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        Staff john = new Staff( "123456789","john", 5000);
        Staff mary = new Staff( "012345678","mary",19000);
        Staff king = new Staff( "999999999","king",5000000);
        Staff kid = new Staff( "000000001","kid", 1000);

        hashMap.put(1,john);
        hashMap.put(2,mary);
        hashMap.put(3,king);
        hashMap.put(4,kid);


        Set set = hashMap.keySet();
        for (Object o : set) {
            Object o1 = hashMap.get(o);
            Staff s = (Staff) o1;
            if(s.getSal() > 18000){
                System.out.println(s);
            }
        }
        System.out.println("=====second======");
        Set entrySet = hashMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            Map.Entry m = (Map.Entry) next;
            Object value = m.getValue();
            Staff s = (Staff) value;
            if(s.getSal() > 18000){
                System.out.println(s);
            }
        }
    }
}

class Staff{
    private String id;
//    private Info info;
    private String name;
    private int sal;
//    public Staff(String id, Info info) {
//        this.id = id;
//        this.info = info;
//    }


    public Staff(String id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSal() {
        return sal;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}

//class Info{
//    private String name;
//    private int sal;
//
//    public Info(String name, int sal) {
//        this.name = name;
//        this.sal = sal;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getSal() {
//        return sal;
//    }
//
//    @Override
//    public String toString() {
//        return "Info{" +
//                "name='" + name + '\'' +
//                ", sal=" + sal +
//                '}';
//    }
//}