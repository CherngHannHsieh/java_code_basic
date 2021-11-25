package com.xchedu.innerClass_;

public class InnerClassExercise {
    public static void main(String[] args) {
        //匿名內部類可以當作實參
        f1(new AA() {
            @Override
            public void show() {
                System.out.println("好亂啊這匿名內部類");
            }
        });
        //傳統方式
        f1(new Picture());
    }

    //靜態方法 形參是介面類型
    public static void f1(AA a) {
        a.show();
    }
}

interface AA {
    void show();
}

class Picture implements AA {
    @Override
    public void show() {
        System.out.println("傳統方式");
    }
}