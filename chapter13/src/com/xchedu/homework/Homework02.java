package com.xchedu.homework;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("username(2~4) : ");
//        try {
//            String name = scanner.next();
//            if (!(name.length() >= 2 && name.length() <= 4)) {
//                throw new Exception("名字長度錯誤");
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//        System.out.print("password(6, only number) : ");
//        try {
//            String password = scanner.next();
//            try {
//                int i = Integer.parseInt(password);
//            } catch (NumberFormatException e) {
//                System.out.println("密碼只能有數字");
//            }
//            if (password.length() != 6) {
//                throw new Exception("密碼長度錯誤");
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//        System.out.print("email : ");
//        try {
//            String email = scanner.next();
//            if (email.indexOf(".") < email.indexOf("@") || email.indexOf("@") == -1 || email.indexOf(".") == -1) {
//                throw new Exception("信箱格式錯誤");
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        String name = null;
        String password = "1d3426";
        String email = "dfafda@af.dsaadfa";

        try {
            userRegister(name,password,email);
            System.out.println("註冊成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void userRegister(String name, String password, String email) {
        //1. 找出正確的
        //2. 取反 若取反為真，代表原先為正確地為假，拋出異常

        //再加入一些校驗
        if(!(name != null && password != null && email != null)){
            throw new RuntimeException("參數不得為空");
        }

        //name length
        if (!(name.length() >= 2 && name.length() <= 4)) {
            throw new RuntimeException("名字長度錯誤");
        }

        //password
        if (!(password.length() == 6 && isDigital(password))) {
            throw new RuntimeException("密碼長度必須為6。且全為數字");
        }

        //email
        if (!(email.indexOf('@') > 0 && email.indexOf('.') > email.indexOf('@'))) {
            throw new RuntimeException("信箱格式錯誤");
        }
    }

    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
