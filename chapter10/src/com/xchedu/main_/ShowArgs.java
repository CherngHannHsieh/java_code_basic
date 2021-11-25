package com.xchedu.main_;

public class ShowArgs {
    public static void main(String[] args) {
        // java ShowArgs Tom Jack Smith
        // 會輸出 Tom Jack Smith
        // public 與 jvm不同包
        // static 不需要額外創物件
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i] + " ");
        }
    }
}
