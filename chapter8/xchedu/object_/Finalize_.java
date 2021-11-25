package com.xchedu.object_;

public class Finalize_ {
    public static void main(String[] args) {
        Car bmw = new Car("bmw");
        // 銷毀對象前，會掉向對象的finialize方法
        //可以在finalize中寫入業務邏輯(釋放資源: 資料庫連接 打開文件)
        //不寫finalize，默認調用Object的finalize
        bmw = null;
        //不見得會成功
        System.gc();
        System.out.println("程序退出...");

    }
}

class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("刪除汽車 " + name);
        System.out.println("釋放資源");
    }
}
