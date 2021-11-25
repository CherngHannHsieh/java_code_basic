package com.homework.hw04;

public class Manager extends Employee{
    public Manager(String name, int days, double wage) {
        super(name, days, wage);
    }

    @Override
    public void showPay() {
        System.out.println("經理薪水");
        super.showPay();
        System.out.println("total salary = " + getWage() * getDays() * 1.2 + 1000);
    }
}
