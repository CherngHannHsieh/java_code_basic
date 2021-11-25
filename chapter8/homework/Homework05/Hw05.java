package com.homework.Homework05;

public class Hw05 {
    public static void main(String[] args) {
        Worker jacky = new Worker("jacky", 500);
        jacky.setSalMonth(15); //修改帶薪月
        jacky.showPay();

        Peasant smith = new Peasant("smith", 2000);
        smith.showPay();

        Teacher texxx = new Teacher("texxx", 8000);
        texxx.setClassDay(250);
        texxx.setClassSal(800);
        texxx.showPay();

        Scientist sci = new Scientist("sci", 10000);
        sci.setBonus(2000000);
        sci.showPay();

        Waiter wai = new Waiter("wai", 100);
        wai.showPay();
    }
}
