package com.xchedu.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("dog1",55));
        list.add(new Dog("dog2",10));
        list.add(new Dog("dog3",70));

        System.out.println("itit");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        System.out.println("foreach");
        for (Object o :list) {
            System.out.println(o);
        }

    }
}
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}