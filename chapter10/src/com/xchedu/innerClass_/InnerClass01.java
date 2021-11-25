package com.xchedu.innerClass_;

public class InnerClass01 {
    public static void main(String[] args) {

    }
}
class Outer{ //外部類
    private int n1 = 100;//屬性

    public Outer(int n1) {//建構子
        this.n1 = n1;
    }

    public void m1(){//方法
        System.out.println("m1");
    }

    { //代碼塊
        System.out.println("code block");
    }

    class Inner{ //內部類

    }
}