package com.homework.hw03;

public class AssoProf extends Teacher{
    public AssoProf(String name, int age, String post, double salary) {
        super(name, age, post, salary);
        setSalary(salary * 1.2);
    }

    @Override
    public void introduce() {
        System.out.print("副教授 : ");
        super.introduce();
    }
}
