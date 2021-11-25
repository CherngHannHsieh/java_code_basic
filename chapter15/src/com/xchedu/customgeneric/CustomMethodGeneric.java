package com.xchedu.customgeneric;

import java.util.ArrayList;

public class CustomMethodGeneric {
    public static void main(String[] args) {
        //泛型 就是可以接收變數類型的變數類型
        Car car = new Car();
        car.fly("bmw",100); //當調用方法時，傳入參數，編譯器會確定類型
        car.fly(300,100.01); //當調用方法時，傳入參數，編譯器會確定類型
        Fish<String, ArrayList> fish = new Fish<>();
        fish.hello(new ArrayList(),11.3f);
    }
}

class Car{
    public void run(){ //普通方法

    }
    //1. <T,R> 就是泛型
    //2. 是提供給 fly 使用的
    public<T,R> void fly(T t,R r){
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }
}

class Fish<T,R>{
    public void run(){ //普通方法

    }
    public<U,M> void eat(U u,M m){

    }
    //1. 不是泛型方法
    //2. hi使用了類聲明的泛型
    public void hi(T t){

    }
    //泛行方法，可以使用類的泛型，也可以使用自己聲明的泛型
    public<K> void hello(R r,K k){
        System.out.println(r.getClass());
        System.out.println(k.getClass());
    }
}