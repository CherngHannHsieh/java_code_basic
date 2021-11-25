package com.homework.Homework05;

public class Employee {
    //有一個帶薪的月份
    private String name;
    private double sal;
    private int salMonth = 12; //預設12個月

    public Employee(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getSalMonth() {
        return salMonth;
    }

    public void setSalMonth(int salMonth) {
        this.salMonth = salMonth;
    }

    public void showPay(){
        System.out.println(name + " 年工資為 " + (sal * salMonth));
    }
}
