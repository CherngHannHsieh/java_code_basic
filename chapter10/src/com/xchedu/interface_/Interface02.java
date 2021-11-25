package com.xchedu.interface_;

public class Interface02 {
    public static void main(String[] args) {

    }
}

//1. 一個類 implements interface
//2. 需要將該需要將該interface的所有抽象方法實現

class A implements AInterface{
    @Override
    public void hi() {
        System.out.println("A hi()...");
    }
}