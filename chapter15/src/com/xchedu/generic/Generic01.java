package com.xchedu.generic;

import java.util.ArrayList;

public class Generic01 {
    public static void main(String[] args) {

        //1. 當我們 ArrayList<Dog>，表示存放到ArrayList的元素是 Dog 類 ==> 變數類型的約束
        ArrayList<Dog> arrayList = new ArrayList<Dog>();
        arrayList.add(new Dog("white",5));
        arrayList.add(new Dog("black",10));
        arrayList.add(new Dog("money",3));

        //2. 遍歷可直接取出Dog類型
        for (Dog o : arrayList) {
            System.out.println(o.getName() + " - " + o.getAge());
        }
    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}