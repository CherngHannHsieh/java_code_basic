package com.xchedu.interface_;

public class InterfaceDteail {
    public static void main(String[] args) {
//        new IA();  (1) 'IA' is abstract; cannot be instantiated
        System.out.println(IB.n1); // 6.說明是static屬性
//        IB.n1 = 20; // 6. n1 is final
    }
}

//1. interface 不能被實作
//2. interface 所有方法都是public，介面中的抽象方法可以不用abstract修飾
//3. 一個普通類實作介面，必須將該介面的所有方法實作(alt+enter)
//4. 抽象類實作介面時，可以不用實作介面的方法
//5. 一個類可以實作多個介面
//6. 介面中的屬性，只能是final的，且是public static final的
//7. 介面不能繼承其他類，但是可以繼承多個其他介面
//8. 介面的修飾符只能是public和默認，和類修飾符相同

interface IA {
    void say();

    void hi();
}

interface IB {
    //介面中的屬性，只能是final的，且是public static final的
    int n1 = 100;// 等價於 public static final int n1 = 100;
}

interface IC {
}

//介面不能繼承其他類，但是可以繼承多個其他介面
interface ID extends IB, IC {

}

//介面的修飾符只能是public和默認，和類修飾符相同
interface IE {

}

//一個類可以實作多個介面
class Pig implements IB, IC {
}

class Cat implements IA { // alt+enter
    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}

//抽象類實作介面時，可以不用實作介面的方法
abstract class Tiger implements IA {

}