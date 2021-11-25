package com.xchedu.homework;

public class Homework03 {
    public static void main(String[] args) {
        showInfo("Han shun Ping");
    }

    //1. 對字符串進行切割
    //2. 對分割後的數組進行格式化 format
    //3. 對輸入的字符串進行校驗
    public static void showInfo(String str){

        if(str == null){
            System.out.println("str 不能為空");
            return;
        }

        String[] strs = str.split(" ");
        if(strs.length != 3){
            System.out.println("輸入的字符串格式錯誤");
            return;
        }

        char c = strs[1].toUpperCase().charAt(0);
        System.out.println(strs[2]+","+strs[0]+" ."+c);
        System.out.println(String.format("%s,%s .%c",strs[2],strs[0],c));
    }
}
