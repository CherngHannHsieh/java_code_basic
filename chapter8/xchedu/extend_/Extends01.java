package com.xchedu.extend_;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "jj";
        pupil.age = 5;
        pupil.setScore(500.0);
        pupil.showInfo();

        Graduate graduate = new Graduate();
        graduate.name = "kk";
        graduate.age = 50;
        graduate.setScore(0.0);
        graduate.showInfo();
    }
}
