package com.xchedu.polymorphic.detail_;

public class PloyDetail {
    public static void main(String[] args) {

        //向上轉型，父類引用指向子類對象
        Animal animal = new Cat();

        //可以調用父類的所有成員(須遵守訪問權限)
        //但是不能調用子類的特殊方法
        //在編譯階段，能調用哪些成員，是由編譯類型來確定的
        //最終運行結果看子類(運行類型)的具體實現，調用方法時，從子類(運行類型)開始查找調用
        animal.eat();
        animal.run();
        animal.show();
        animal.sleep();

        //向下轉型
        //希望可以調用 Cat 的 catchMouse()
        //語法 子類類型 引用名 = (子類類型) 父類引用名
        // cat 的編譯類型是 Cat 運行類型還是Cat
        Cat cat = (Cat) animal;
        cat.catchMouse();
        //要求父類引用必須的是當前目標類型的物件
        //Dog dog = (Dog) animal; error
    }
}
