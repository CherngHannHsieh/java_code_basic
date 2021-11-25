package com.xchedu.extend_;

public class ExtendsExercise {
    public static void main(String[] args) {
        PC pc = new PC("intel",16,500,"IBM");
        pc.printInfo();
        NotePad notePad = new NotePad("intel",32,1024,"white");
        notePad.printInfo();
    }
}

