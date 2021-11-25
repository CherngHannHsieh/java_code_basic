package com.homework.hw04;

public class Staff extends Employee{
    public Staff(String name, int days, double wage) {
        super(name, days, wage);
    }

    @Override
    public void showPay() {
        System.out.println("Staff 薪水");
        super.showPay();
        System.out.println("total salary = " + getWage() * getDays() * 1.0);
    }
}
