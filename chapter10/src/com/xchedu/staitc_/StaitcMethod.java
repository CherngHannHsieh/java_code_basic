package com.xchedu.staitc_;

public class StaitcMethod {
    public static void main(String[] args) {
        D.hi();
        //需要先創建物件才能調用
        //D.say();
    }
}

class D{
    private int i = 100;
    private static int i2 = 200;
    public void say(){

    }
    public static void hi(){
        //靜態方法不允許使用和物件有關的關鍵字
        //System.out.println(this.i);
        //'com.xchedu.staitc_.D.this' cannot be referenced from a static context
    }
    public static void hello(){
        System.out.println(i2);
        System.out.println(D.i2);
//        System.out.println(this.i2);
        //靜態只喜歡自己玩，不主動找別人玩，陰角
        hi();
//        say();
        //Non-static method 'say()' cannot be referenced from a static context
    }

    //一般方法無敵，陽角
    public void ok(){
        //non static
        System.out.println(i);
        say();
        //static
        System.out.println(i2);
        hi();
    }
}
