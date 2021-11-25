package com.xchedu.override_.Exercise;

public class Student extends Person{
    private int id;
    private int score;

    public Student(String name, int age, int id, int score) {
        super(name, age);
        setId(id);
        setScore(score);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String say(){
        return super.say() + " " + id + " " + score;
    }
}
