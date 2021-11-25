package com.xchedu.homework;

public class Homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        //1. 匿名內部類
        //        new Computer() {
        //            @Override
        //            public double work(double n1, double n2) {
        //                return n1 + n2;
        //            }
        //        },同時也是一個物件
        //         他的編譯類型Computer 運行類型是匿名內部類

        cellphone.testWork(new Computer() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        },10,20);

        //顯示出 匿名內部類的好處
        cellphone.testWork(new Computer() {
            @Override
            public double work(double n1, double n2) {
                return n1 * n2;
            }
        },10,20);

    }
}

interface Computer{
    double work(double n1,double n2);
}

//1.
class Cellphone {
    public void testWork(Computer computer,double n1,double n2){
        double result = computer.work(n1,n2);
        System.out.println(result);
    }
}