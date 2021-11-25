package com.xchedu.polymorphic.PolyParameter;

public class Staff extends Employee{
    public Staff(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println(getName() + " 員工工作中...");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
