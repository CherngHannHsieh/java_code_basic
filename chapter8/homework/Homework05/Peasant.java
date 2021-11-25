package com.homework.Homework05;

public class Peasant extends Employee{
    public Peasant(String name, double sal) {
        super(name, sal);
    }

    @Override
    public void showPay() {
        System.out.print("農民 : ");
        super.showPay();
    }
}
