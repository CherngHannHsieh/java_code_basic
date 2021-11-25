package com.xchedu.abstract_;

public class Exercise01 {
    public static void main(String[] args) {
        Manager manager = new Manager("manager", "01010101", 5000);
        manager.setBonus(8000000);
        System.out.println(manager.getSal());

        CommonEmployee commonStaff = new CommonEmployee("commonStaff", "01012202", 50);
        manager.work();
        commonStaff.work();

    }
}

abstract class Employee {
    private String name;
    private String id;
    private int sal;

    public Employee(String name, String id, int sal) {
        this.name = name;
        this.id = id;
        this.sal = sal;
    }

    //將work做成抽象方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", sal=" + sal +
                '}';
    }
}

class Manager extends Employee {
    private int bonus;

    //需要建構子，因為把無參建構子覆蓋了
    public Manager(String name, String id, int sal) {
        super(name, id, sal);
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int getSal() {
        return super.getSal() + bonus;
    }

    @Override
    public void work() {
        System.out.println("經理" + getName() + "工作中");
    }

}

class CommonEmployee extends Employee {

    public CommonEmployee(String name, String id, int sal) {
        super(name, id, sal);
    }

    @Override
    public void work() {
        System.out.println("員工" + getName() + "工作中");
    }
}