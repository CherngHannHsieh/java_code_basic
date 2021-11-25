package com.xchedu.codeblock;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        //1個類 靜態先執行 再來普通 最後建構子
        //1. 靜態方法 2. 靜態代碼塊 3.普通方法 4.普通代碼塊 5. 建構子
        A a = new A();
    }
}

class A{
    private int n2 = get();
    {
        System.out.println("common...");
    }
    public int get(){
        System.out.println("n2...");
        return 100;
    }
    //靜態屬性初始化
    private static int n1 = getInt();
    //靜態代碼塊
    static{
        System.out.println("a static ...");
    };

    public static int getInt(){
        System.out.println("getInt...");
        return 10;
    }

    public A() {
        System.out.println("A對象調用");
    }
}