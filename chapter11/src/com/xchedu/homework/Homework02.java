package com.xchedu.homework;

public class Homework02 {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock frock = new Frock();
        Frock frock2 = new Frock();
        Frock frock3 = new Frock();
        System.out.println(frock.getSerialNumber());
        System.out.println(frock2.getSerialNumber());
        System.out.println(frock3.getSerialNumber());
    }
}

class Frock {
    // static 隨類加載，只會加載一次，且所有物件共享
    private static int currentNum = 100000;
    private int serialNumber;

    public Frock() {
        serialNumber = getNextNum();
    }

    public static int getNextNum() {
        currentNum += 100;
        return currentNum;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}