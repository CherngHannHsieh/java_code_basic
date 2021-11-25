package com.xchedu.abstract_;

import jdk.swing.interop.SwingInterOpUtils;

public class TestTemplate {
    public static void main(String[] args) {
        AAA aaa = new AAA();
        aaa.calTime(); //OOP 多型

        BBB bbb = new BBB();
        bbb.calTime();
    }
}

//抽象模板設計模式
abstract class Template {

    public abstract void job();//抽象方法

    public void calTime() {
        //start time
        long start = System.currentTimeMillis();
        job(); //動態綁定機制
        //end time
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}


class AAA extends Template {
    public void job() { //重寫抽象方法
        long num = 0l;
        for (long i = 1; i <= 900000000; i++) {
            num += i;
        }
        System.out.println(num);
    }
}

class BBB extends Template {
    public void job() { //重寫抽象方法
        long num = 1;
        for (long i = 1; i <= 20; i++) {
            num *= i;
        }
        System.out.println(num);
    }
}
