package com.xchedu.set_;

import java.util.HashSet;
import java.util.Objects;

public class hashsetExercise02 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee2("mary",5000,new MyDate(2000,12,12)));
        hashSet.add(new Employee2("john",1000,new MyDate(1998,1,12)));
        hashSet.add(new Employee2("mary",5000,new MyDate(2000,12,12)));

        System.out.println(hashSet);
    }
}
class Employee2{
    private String name;
    private int sal;
    private MyDate date;

    public Employee2(String name, int sal, MyDate date) {
        this.name = name;
        this.sal = sal;
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee2 employee2 = (Employee2) o;
        return sal == employee2.sal &&
                Objects.equals(name, employee2.name) &&
                Objects.equals(date, employee2.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sal, date);
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", date=" + date +
                '}';
    }
}

class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year &&
                month == myDate.month &&
                day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}