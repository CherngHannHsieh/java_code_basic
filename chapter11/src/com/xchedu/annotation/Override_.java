package com.xchedu.annotation;

public class Override_ {
    public static void main(String[] args) {

    }
}
class Father{
    public void fly(){
        System.out.println("father fly");
    };
}

class Son extends Father{
    //@Override 表示子類方法重寫父類方法
    //沒寫依舊還是重寫fly
    //有寫的話，編譯器會去檢查方法是否真的重寫父類方法，真的重寫，則編譯通過，如果沒有構成重寫，編譯錯誤
    @Override
    public void fly() {
        System.out.println("son fly");
    }
    // @interface 說明 Override 是一個註解類(不是介面)
    /*
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.SOURCE)
    public @interface Override {
    }
    */
}