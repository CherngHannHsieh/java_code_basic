package com.xchedu.extend_;

public class Graduate {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void testing(){
        System.out.println(name + " testing");
    }

    public void showInfo(){
        System.out.println(name + " " + age + " " + score);
    }
}
