package com.xchedu.enum_;

public class Enumeration01 {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);
    }
}

// enum
/* 列舉
1. 一組常量的集合
2. 特殊的類，只包含一組有限的特定對象
*/

//自定義列舉實現
class Season{
    private String name;
    private String decs; //描述

    //定義了四個物件
    //透過static 讓其他外部類可以直接調用
    public static final Season SPRING = new Season("spring","warm");
    public static final Season SUMMER = new Season("summer","hot");
    public static final Season AUTUMN = new Season("autumn","cool");
    public static final Season WINTER = new Season("winter","cold");

    //1. 建構子私有化，防止直接 new
    //2. 去掉set method 防止屬性被修改
    //3. 在類中創建固定的物件
    //4. 優化 + final ，不會導致類加載，底層優化
    private Season(String name, String decs) {
        this.name = name;
        this.decs = decs;
    }

    public String getName() {
        return name;
    }

    public String getDecs() {
        return decs;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", decs='" + decs + '\'' +
                '}';
    }
}