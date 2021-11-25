package com.homework.hw03;

public class Lecturer extends Teacher{
    public Lecturer(String name, int age, String post, double salary) {
        super(name, age, post, salary);
        setSalary(salary * 1.1);
    }

    @Override
    public void introduce() {
        System.out.print("講師 : ");
        super.introduce();
    }
}
