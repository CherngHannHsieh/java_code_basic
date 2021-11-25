package com.xchedu.exception_;

public class Exception_ {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;
        //拋出異常 崩潰 程序結束
        //try catch --> ctrl + alt + t
        //捕獲錯誤 程式繼續進行
        try {
            int res = n1 / n2;
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("continue...");
    }
}
