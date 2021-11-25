package com.xchedu.stringbuffer;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        //1. 接收用戶輸入
        //2. 使用StringBuffer 插入 , 將String-->StringBuffer

        Scanner scanner = new Scanner(System.in);
        System.out.print("輸入商品和價格，請以空格隔開 : ");
        String str = scanner.nextLine();
        //將商品和價格拆開
        String[] s = str.split(" ");

        
        //String --> StringBuffer
        StringBuffer stringBuffer = new StringBuffer(s[1]);
        //抓出最後一個小數點的位置
        int dot = s[1].lastIndexOf('.');
        ///以該小數點為基準，每往前3位加一個逗號
        for (int i = dot - 3; i > 0; i -= 3) {
            stringBuffer.insert(i, ",");
        }
        System.out.println("商品\t價格");
        System.out.println(s[0] + "\t" + stringBuffer);
    }
}
