package com.xchedu.interface_;

public class InterfacePolyParameter {
    public static void main(String[] args) {
        //介面的多型，介面類型 if01 可以指向，實作了IF介面的類的物件
        IF if01 = new Monster();
        if01 = new Car();
    }
}

interface IF{}
class Monster implements IF{}
class Car implements IF{}
