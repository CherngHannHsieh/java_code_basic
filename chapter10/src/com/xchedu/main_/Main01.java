package com.xchedu.main_;

public class Main01 {
    //static
    private static String name = "static name";
    private int n1 = 100;
    public static void hi(){
        System.out.println(name);
    }
    public void cry(){
        System.out.println("cry");
    }
    public static void main(String[] args) {
        //可直接使用name
        System.out.println(Main01.name);
        hi();
//        System.out.println(n1);
//        cry();
        //靜態main要使用非靜態成員，需要創建物件，再調用
        Main01 main01 = new Main01();
        System.out.println(main01.n1);
        main01.cry();
    }
}
