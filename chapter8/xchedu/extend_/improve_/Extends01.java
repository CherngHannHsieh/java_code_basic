package com.xchedu.extend_.improve_;

import com.xchedu.extend_.Graduate;
import com.xchedu.extend_.Pupil;

public class Extends01 {
    public static void main(String[] args) {
        com.xchedu.extend_.Pupil pupil = new Pupil();
        pupil.name = "ijj";
        pupil.age = 5;
        pupil.setScore(500.0);
        pupil.showInfo();

        com.xchedu.extend_.Graduate graduate = new Graduate();
        graduate.name = "ikk";
        graduate.age = 50;
        graduate.setScore(0.0);
        graduate.showInfo();
    }
}
