package com.xchedu.pkg;

import com.xchedu.modifier.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        //不同包 只能訪問public
        System.out.println(a.n1);
        a.m1();
    }
}
