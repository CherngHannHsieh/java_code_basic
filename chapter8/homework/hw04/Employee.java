package com.homework.hw04;

public class Employee {
    private String name;
    private int days;
    private double wage;

    public Employee(String name, int days, double wage) {
        this.name = name;
        this.days = days;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void showPay(){
        System.out.println("name = " + name + ", wage per day = " + wage + ", days = " + days);
    }
}
