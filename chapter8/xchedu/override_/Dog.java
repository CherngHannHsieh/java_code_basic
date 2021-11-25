package com.xchedu.override_;

public class Dog extends Animal{
    //1. Dog 為 Animal 子類
    //2. Dog 的 cry 和 Animal 的 cry 定義形式相同 (方法名、形參完全一樣)
    //3. Dog 的 cry method override Animal 的 cry
    public void cry(){
        System.out.println("Dog cry...");
    }
    //子類方法返回的類型與父類一致
    //或是 父類返回類型的子類
    //ex 父是返回Object  子是返回String
    public String m1(){
        return null;
    }
    // 子類方法不能縮小父類方法的訪問權限
    public void eat(){

    }
}
