package com.xchedu.generic;

import java.util.*;

public class GenericExercise {
    public static void main(String[] args) {
        HashSet<student> set = new HashSet<>();
        set.add(new student("wang",10));
        set.add(new student("hsieh",15));
        set.add(new student("wu",20));

        for (student student : set) {
            System.out.println(student);
        }

        HashMap<String, student> stringstudentHashMap = new HashMap<>();
        stringstudentHashMap.put("1",new student("wang",10));
        stringstudentHashMap.put("2",new student("hsu",20));
        stringstudentHashMap.put("3",new student("cheng",10));
        Set<Map.Entry<String, student>> entries = stringstudentHashMap.entrySet();
        Iterator<Map.Entry<String, student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, student> next =  iterator.next();
            System.out.println(next.getKey() + " - " + next.getValue());
        }
    }
}
class student{
    public String name;
    public int age;

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}