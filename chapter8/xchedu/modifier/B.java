package com.xchedu.modifier;

import jdk.swing.interop.SwingInterOpUtils;

public class B {
    public void say(){
        A a = new A();
        //同包不同類 無法訪問private
        System.out.println(a.n1 + "\t" + a.n2 + "\t" + a.n3);
        a.m1();
        a.m2();
        a.m3();
    }
}
