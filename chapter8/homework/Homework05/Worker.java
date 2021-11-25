package com.homework.Homework05;

public class Worker extends Employee{
    public Worker(String name, double sal) {
        super(name, sal);
    }

    @Override
    public void showPay() {
        System.out.print("工人 : ");
        super.showPay();
    }
}
