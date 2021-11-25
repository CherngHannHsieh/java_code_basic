package com.xchedu.staitc_;

public class VisitStatic {
    public static void main(String[] args) {
        //static 是隨著class 加載而創建，即使沒有創建物件也可以使用
        //仍須滿足訪問修飾符規定，class 生 static 生
        //class 死 static 死
//        System.out.println(A.name);
//        A a = new A();
//        System.out.println(a.name);
        Stu stu = new Stu("tom");
        stu.pay(5000);
        Stu stu2 = new Stu("tom02");
        stu2.pay(5200);
        Stu.show();
        stu.show();
        stu2.show();
    }
}

class A{
    // static variable 該類所有物件皆可共享
    public static String name = "static name";
}

class Stu{
    private String name;
    //累積所有物件的費用
    private static int fee = 0;

    public Stu(String name) {
        this.name = name;
    }

    // 靜態方法 -> 才可訪問靜態屬性
    // 靜態方法無法使用 this
    public static void pay(int fee){
        Stu.fee += fee;
    }
    // 靜態方法 -> 才可訪問靜態屬性
    public static void show(){
        System.out.println(fee);
    }

    //不希望創建物件，也可以調用方法(當作工具來用)
    //此時將方法做成靜態方法就非常方便
}
