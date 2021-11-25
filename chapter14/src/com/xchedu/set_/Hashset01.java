package com.xchedu.set_;

import java.util.HashSet;
import java.util.Set;

public class Hashset01 {
    public static void main(String[] args) {
        Set set = new HashSet();
        //執行add會返回boolean
        //添加成功true 否則返回false
        //透過remove移除特定元素
        System.out.println(set.add("jacky"));
        System.out.println(set.add("smith"));
        System.out.println(set.add("Wang"));
        System.out.println(set.add("jacky")); //重覆的
        System.out.println(set.add(null));
        System.out.println(set.add(null));
        System.out.println(set);
        set.remove(null);
        System.out.println(set);

        set = new HashSet();
        set.add("jacky"); //true
        set.add("jacky"); //false
        set.add(new Dog("tom")); //ok
        set.add(new Dog("tom")); //ok
        System.out.println(set);

        //經典題
        //看源碼
        set.add(new String("hsp")); //ok
        set.add(new String("hsp")); //無法加入
        System.out.println(set);
    }
}

class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}