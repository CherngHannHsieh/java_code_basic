package com.homework.Homework05;

public class Scientist extends Employee{
    private double bonus;

    public Scientist(String name, double sal) {
        super(name, sal);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void showPay() {
        System.out.print("科學家 : ");
        System.out.println(getName() + " 年工資為 " + (getSal() * getSalMonth() + bonus));
    }
}
