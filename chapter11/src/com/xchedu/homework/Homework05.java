package com.xchedu.homework;

public class Homework05 {
    public static void main(String[] args) {
        A a = new A();
    }
}

class A {
    private String name = "a class";
    public void f1(){
        class B{
            private final String name = "b class";
            public void show(){
                System.out.println(name);
                System.out.println(A.this.name);
            }
        }

        //注意作用域
        B b = new B();
        b.show();
    }
}