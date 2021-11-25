package com.xchedu.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
1. OOP
2. 一個功能一個方法
*/
public class SmallChangeSysOOP {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    //判斷輸入的服務
    String key = "";
    //是否要退出
    String logout = "";

    //2. 明細 (1) 保存到數組 (2) 可以使用對象 (3) 字符串拼接
    String details = "---------- 明\t細 ----------\n項目\t金額\t時間\t\t\t餘額";


    //3. 收入  1.金額 2.時間 3.餘額
    //定義新的變數
    int money = 0;
    Date date = null;
    int balance = 0;
    //格式化取得時間 .format()
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    //4. 消費  1.項目 2.消費多少錢 3.時間 4.金額
    String note = "";

    public void showMenu(){
        do{
            System.out.println("\n------------ 零錢通菜單(OOP) ------------");
            System.out.println("\t\t\t1 明\t細");
            System.out.println("\t\t\t2 收\t入");
            System.out.println("\t\t\t3 支\t出");
            System.out.println("\t\t\t4 退\t出");

            System.out.print("請輸入選項(1 ~ 4) : ");
            key = scanner.next();

            //switch去做分支處理
            switch(key){
                case "1":
                    details();
                    break;
                case "2":
                    income();
                    break;
                case "3":
                    cost();
                    break;
                case "4":
                    off();
                    break;
            }
        }while(loop);
    }

    public void details(){
        System.out.println(details);
    }

    public void income(){
        //金額處理 反面想 哪些不合理
        System.out.print("存款金額 : ");
        money = scanner.nextInt();
        if(money <= 0 ){
            System.out.println("輸入金額不得為負數或零");
            return; //用return 跳出方法
        }
        balance += money;
        date = new Date(); //取得當前時間
        details += "\n收入\t" + String.format("%4d",money) + "\t" + sdf.format(date) + "\t" + balance;
        System.out.println("存款成功，目前戶頭餘額為 " + balance);
    }

    public void cost(){
        System.out.print("消費金額 : ");
        money = scanner.nextInt();
        if(money <= 0 || money > balance) {
            System.out.println("消費金額需在 0 ~ " + balance);
            return;
        }
        balance -= money;
        System.out.print("消費項目名 : ");
        note = scanner.next();
        date = new Date();
        details += "\n" + note +"\t" + String.format("%4d",money) + "\t" + sdf.format(date) + "\t" + balance;
        System.out.println("扣款成功，目前戶頭餘額為 " + balance);
    }

    public void off(){
        // 1. 判斷輸入的是不是y/n，不是則循環，用while+break比較漂亮
        // 2. 判斷輸入的是y還n，再進行相對應的處理
        // .. 一段代碼處理一個小功能
//                    do{
//                        System.out.print("確定要退出零錢通嗎? (y/n) :");
//                        logout = scanner.next();
//                        if("y".equals(logout) || "Y".equals(logout)){
//                            loop = false;
//                            System.out.println("已退出零錢通");
//                            break;
//                        }else if(logout.equals("n") || logout.equals("N")){
//                            break;
//                        }else{
//                            continue;
//                        }
//                    }while(!logout.equals("n") || !logout.equals("N"));
        // 判斷輸入是否為y/n，不是則循環
        while(true){
            System.out.print("確定要退出零錢通嗎? (y/n) :");
            logout = scanner.next();
            if("y".equals(logout) || "Y".equals(logout) || logout.equals("n") || logout.equals("N")){
                break;
            }
        }
        // 判斷輸入內容
        if("y".equals(logout) || "Y".equals(logout)){
            loop = false;
            System.out.println("已退出零錢通");
            return;
        }else{
            return;
        }
    }
}
