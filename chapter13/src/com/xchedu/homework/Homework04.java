package com.xchedu.homework;

public class Homework04 {
    public static void main(String[] args) {
        count("asdfg4561618GADAFDGAFG");
    }

    public static void count(String str){
        char[] chars = str.toCharArray();
        int upper = 0;
        int lower = 0;
        int num = 0;
        int other = 0;
        // 可使用 String.charAt() 進行，不一定需要轉成char[]
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]>='0' && chars[i]<='9'){
                num++;
            }else if(chars[i]>='a' && chars[i]<='z'){
                lower++;
            }else if(chars[i]>='A' && chars[i]<='Z'){
                upper++;
            } else{
                other++;
            }
        }
        System.out.println(String.format("Upper = %d , Lower = %d , Number = %d , Other = %d",upper,lower,num,other));
    }
}
