package com.xchedu.exception_;

import java.util.Scanner;

public class TrycatchExercise {
    public static void main(String[] args) {
        //1. scanner
        //2. 無限尋接收輸入
        //3. 輸入的值轉成int
        //4. 有異常一直重複，沒異常break;
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while(true){
            System.out.print("input = ");
            try {
                num = Integer.parseInt(scanner.next());
                break;
            } catch (Exception e) {
                System.out.println("The size of short is " + Short.SIZE / 8 + " bytes.");
            }
        }
    }
}
