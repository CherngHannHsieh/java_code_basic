package com.homework.Homework05;

public class Waiter extends Employee{
    public Waiter(String name, double sal) {
        super(name, sal);
    }

    @Override
    public void showPay() {
        System.out.print("服務生 : ");
        super.showPay();
    }
}
