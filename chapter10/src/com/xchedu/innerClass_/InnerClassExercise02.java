package com.xchedu.innerClass_;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        //傳遞的是 實現了Bell 介面的匿名內部類，InnerClassExercise02$1
        //重寫了ring
        //Bell bell = new Bell() {
            //             @Override
            //            public void ring() {
            //                System.out.println("懶豬起床了");
            //            }
        //            }
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懶豬起床了");
            }
        });

        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小夥伴上課了");
            }
        });
    }
}

interface Bell { //介面
    void ring(); //抽象方法
}

class Cellphone {
    public void alarmclock(Bell bell) {
        System.out.println(bell.getClass());
        bell.ring(); // 動態綁定
    }
}