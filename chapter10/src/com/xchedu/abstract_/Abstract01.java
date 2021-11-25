package com.xchedu.abstract_;

public class Abstract01 {
    public static void main(String[] args) {
        //1. 抽象類不能實例化 new Animal();
//        new Animal();

    }
}

//父類方法不確定->將該方法設計為抽象方法->當一個類中存在抽象方法，需將該類聲明為abstract
//一般來說，抽象類會被繼承，由子類來繼承實現

//抽象類的本質還是類，所以可以有類的所有成員
abstract class Animal{
    //抽象方法沒有方法體 {}
    //抽象方法不能使用private , final , static來修飾，因為這些關鍵字與override 違背
    //靜態成員無法被override (多態性消失)
    public abstract void eat();
}

//繼承抽象類，必須實現抽象類所有的抽象方法，否則自己也要聲明成抽象類
class HY extends Animal{
    @Override
    public void eat() { //實現了抽象方法

    }
}

//抽象類不一定要有抽象方法，抽象類可以沒有抽象發方
abstract class A{
    //abstract 只能修飾類和方法，不能修飾屬性
//    private abstract double d = 100;
    public void hi(){
        System.out.println("hi...");
    }
}



