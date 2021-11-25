package com.xchedu.extend_.improve_;

//父類 是Pupil 和 Graduate的父類
public class Student {
    //共有屬性
    public String name;
    public int age;
    private double score;

    //共有方法
    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo(){
        System.out.println(name + " " + age + " " + score);
    }
}
