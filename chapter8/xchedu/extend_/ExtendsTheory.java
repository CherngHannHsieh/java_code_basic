package com.xchedu.extend_;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son(); //內存的布局
        //查找關係
        //1. 子類有無此屬性
        //2. 有這個屬性，且可訪問，則返回
        //3. 子類沒有，看父類有無此屬性(有的話，且可訪問，則返回)
        //4. 父類沒有，再繼續往上找
        System.out.println(son.name);
        System.out.println(son.age);
        System.out.println(son.hobby);
    }
}

class GrandPa{
    String name = "gp";
    String hobby = "aaa";
}

class Father extends GrandPa{
    String name = "f";
    int age = 50;
}

class Son extends Father{
    String name = "s";
}
