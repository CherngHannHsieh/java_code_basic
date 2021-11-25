package com.xchedu.interface_;

public interface AInterface {
    //屬性
    public int n1 = 100;
    //介面中可以有方法
    // 1. 抽象方法 2.默認實現方法(default) 3.靜態方法(static)
    //在interface中，抽象方法可以省略abstract
    public void hi();

    //jdk8後可以有默認實現方法，需搭配default使用
    default public void ok() {
        System.out.println("ok()...");
    }
    //jdk8後可以有靜態方法，需搭配static使用
    public static void cry() {
        System.out.println("cry()...");
    }
}
