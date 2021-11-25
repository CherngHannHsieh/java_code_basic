package com.homework.Homework05;

public class Teacher extends Employee{
    private double classSal;
    private int classDay;

    public Teacher(String name, double sal) {
        super(name, sal);
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    @Override
    public void showPay() {
        System.out.print("老師 : ");
        System.out.println(getName() + " 年工資為 " + (getSal() * getSalMonth() + classDay * classSal));
    }
}
