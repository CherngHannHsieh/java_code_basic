package com.xchedu.enum_;

public class Enumeration01enum_ {
    public static void main(String[] args) {
        System.out.println(Season2.SPRING);
    }
}


enum Season2 {
    //定義了四個物件
    //透過static 讓其他外部類可以直接調用
//    public static final Season SPRING = new Season("spring","warm");
//    public static final Season SUMMER = new Season("summer","hot");
//    public static final Season AUTUMN = new Season("autumn","cool");
//    public static final Season WINTER = new Season("winter","cold");

//    使用enum實現列舉
/*
1. 使用關鍵字 enum 替代 class
2. public static final Season SPRING = new Season("spring","warm"); 直接使用 SPRING("spring","warm") 替代 -> 常量名(實參列表)
3. 如果有多個常量，使用,號間格，最後一個;
4. enum 實現列舉，要求將定義常量寫在前面
5. 使用無參建構子創建常量物件，可以省略()
6. 列舉物件必須放在列舉類的最前面
*/

    SPRING("spring","warm"),SUMMER("summer","hot"),AUTUMN("autumn","cool"),WINTER("winter","cold");
    private String name;
    private String decs; //描述

    //1. 建構子私有化，防止直接 new
    //2. 去掉set method 防止屬性被修改
    //3. 在類中創建固定的物件
    //4. 優化 + final ，不會導致類加載，底層優化

    private Season2(String name, String decs) {
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