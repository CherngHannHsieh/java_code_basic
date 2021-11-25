package com.xchedu.single_;

public class SingleTon {
    public static void main(String[] args) {
//        Girlfriend instance = Girlfriend.getGf();
//        Girlfriend instance02 = Girlfriend.getGf();
//        System.out.println(instance);
//        System.out.println(instance02);
//        System.out.println(instance == instance02);
        System.out.println(Girlfriend.i);
    }
}

class Girlfriend{
    //如何保障指創建一個女朋友
    public static int i = 100;
    private String name;
    //因為必須使用static方法，所以必須為static屬性
    //此時若是調用一個靜態屬性，物件仍會被創立，可能造成資源浪費
    private static Girlfriend gf = new Girlfriend("whiut");
    //1. 建構子私有化
    //2. 在類的內部創建一個對象
    //3. 提供一個公共的方法返回gf
    private Girlfriend(String name) {
        System.out.println("constructor");
        this.name = name;
    }
    //但因為已經將建構子私有化，無法 new 物件，亦無法操作非靜態方法
    //故使用static
    public static Girlfriend getGf(){
        return gf;
    }

    @Override
    public String toString() {
        return "Girlfriend{" +
                "name='" + name + '\'' +
                '}';
    }
}