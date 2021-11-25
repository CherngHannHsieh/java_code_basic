package com.xchedu.generic;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericExercise02 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("jack", 15000, new MyDate(2000, 7, 5)));
        employees.add(new Employee("smith", 5000, new MyDate(1989, 3, 5)));
        employees.add(new Employee("tom", 1000, new MyDate(2010, 5, 7)));
        employees.add(new Employee("ann", 1000, new MyDate(2000, 5, 7)));
        employees.add(new Employee("tom", 6000, new MyDate(1980, 7, 7)));

        System.out.println(employees);
        System.out.println("sort");

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                //name 不同
                int i = e1.getName().compareTo(e2.getName());
                if (i != 0) {
                    return i;
                }
                //name同 先比年 ，應該放在MyDate比較
                return e1.getBirthday().compareTo(e2.getBirthday());
            }
        });

        System.out.println(employees);
    }
}

class Employee {
    private String name;
    private int sal;
    private MyDate birthday;

    public Employee(String name, int sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(MyDate o) {
        int yearMinus = year - o.getYear();
        if (yearMinus != 0) {
            return yearMinus;
        }
        //month
        int monthMinus = month - o.getMonth();
        if (monthMinus != 0) {
            return monthMinus;
        }
        //day
        return day - o.getDay();
    }

}