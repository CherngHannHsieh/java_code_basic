package com.xchedu.wrapper;

public class WrapperVsString {
    public static void main(String[] args) {
        //Integer --> String
        Integer i = 100;
        String str = i + "";
        String str2 = i.toString();
        String str3= String.valueOf(i);
        System.out.println(i.getClass());

        String str4 = "12345";
        Integer i2 = Integer.parseInt(str4); // 自動裝箱
        Integer integer = new Integer(str4); // 建構子
        System.out.println(str4.getClass());
    }
}
