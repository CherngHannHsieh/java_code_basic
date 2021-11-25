package com.xchedu.codeblock;

public class CodeBlockDetail {
    public static void main(String[] args) {
        // static 代碼塊 只會在類加載時執行
        //1. new 物件
        //2. 創毽子類物件時，父類的也會被加載，且父類先加載
        //3. 使用靜態成員時
//        AA a = new AA();
//        System.out.println(Cat.i);
        //staic 代碼塊，在類加載時執行，只會執行一次
        //普通代碼塊，在物件創立時會被隱性調用
//        DD dd = new DD();
//        DD dd2 = new DD();
        System.out.println(DD.i); //靜態代碼塊
    }
}

class DD{
    public static int i = 100;
    static{
        System.out.println("dd...");
    };
    //普通代碼塊
    //普通代碼塊只有在物件創立時(new)才會被調用，且每創一個調用一次
    // 普通代碼塊是建構子的補充
    {
        System.out.println("dd common codeblock...");
    };
}

class BB{
    static{
        System.out.println("bb static codeblock...");
    };
}

class AA extends BB{
    static{
        System.out.println("static code block ....");
    };
}

class Animal{
    static{
        System.out.println("animal..");
    };
}

class Cat extends  Animal{ //類加載由父往子加載
    public static int i = 0;//靜態屬性

    static{
        System.out.println("cat ...");
    };
}

// 1. static 代碼塊是隨類加載執行，只會執行一次
// 2. 普通代碼塊，是創建物件時調用的，創建一次調用一次
// 3. 類加載的3種情況
// 3.1 new 物件  3.2創建子類物件，父類也會被加載 3.3使用靜態成員時