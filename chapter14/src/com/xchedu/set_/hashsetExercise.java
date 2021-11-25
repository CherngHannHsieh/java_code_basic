package com.xchedu.set_;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class hashsetExercise {
    public static void main(String[] args) {
        Set hashSet = new HashSet();
        // 先 hash() && 再 equals() 就不加入
        //將hashcode & equals override
        hashSet.add(new Employee("john",50)); //ok
        hashSet.add(new Employee("mary",20)); //ok
        hashSet.add(new Employee("jacky",35));//ok
        hashSet.add(new Employee("jacky",35));//false
        System.out.println(hashSet);
    }
}

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}