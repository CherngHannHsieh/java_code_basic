package com.homework.hw04;

public class Homework04 {
    public static void main(String[] args) {
        Manager manager = new Manager("manager", 30, 2000);
        Staff staff = new Staff("staff", 30, 500);
        manager.showPay();
        staff.showPay();
    }
}
