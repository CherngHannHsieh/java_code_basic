package com.xchedu.homework;

public class Homework01 {
    public static void main(String[] args) {
        String s = "abcdef";
        System.out.println(s);
        System.out.println("交換後");
        System.out.println(reverse(s, 1, 4));
        try {
            System.out.println(reverse02(s, 1, 4));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // start 起始的 index, end 是結束的 index , index 從 0 開始
    public static String reverse(String str, int start, int end) {
        StringBuffer bufferStr = new StringBuffer(str);
        String subStr = bufferStr.reverse().substring(start, end + 1); //bufferStr.reverse會改變原先的值，substring 和
        // replace，都是取下不取上，所以end + 1
        StringBuffer bufferStr02 = new StringBuffer(str);
        StringBuffer s = bufferStr02.replace(start, end + 1, subStr);
        return s.toString();
    }


    public static String reverse02(String str, int start, int end) {
        //1. 寫出正確的
        //2. 取反
        if (!(str != null && start >= 0 && end > start && end < str.length())) {
            throw new RuntimeException("參數不正確");
        }

        // String -> char[]
        char[] chars = str.toCharArray();
        for (int i = start, j = end; i < j; i++, j--) {
            if (i > j) {
                break;
            }
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        String returnStr = "";
        for (int i = 0; i < chars.length; i++) {
            returnStr += chars[i];
        }
        return returnStr;
    }
}
