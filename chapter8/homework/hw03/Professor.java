package com.homework.hw03;

public class Professor extends Teacher{
    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
        setSalary(salary * 1.3);
    }

    @Override
    public void introduce() {
        System.out.print("教授 : ");
        super.introduce();
    }
}
