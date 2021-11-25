package com.xchedu.debug_;

//debug 對象創建的過程
public class Debug04 {
    public static void main(String[] args) {
        //創建對象的過程
        //1. 加載Person類
        //2. 初始化 2.1 默認初始化 2.2 顯示初始化 2.3 建構子初始化
        //3. 返回對象地址
        Person jack = new Person("jack", 30);
        System.out.println(jack);
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}