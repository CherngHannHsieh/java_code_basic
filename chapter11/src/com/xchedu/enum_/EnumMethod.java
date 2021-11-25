package com.xchedu.enum_;

public class EnumMethod {
    public static void main(String[] args) {
        //使用Season2 列舉類
        Season2 autumn = Season2.AUTUMN;

        //輸出列舉物件的名稱
        System.out.println(autumn.name()); //AUTUMN
        // 輸出的是該列舉物件的次序/編號，從0開始編號 Array的感覺

        // AUTUMN為第3個 輸出2
        System.out.println(autumn.ordinal()); //2

        // 從反編譯javap .class 可以看到values 返回Season2[] ，含有定義的所有列舉物件
        Season2[] values = Season2.values();
        // for-each loop , for(type element : array)
        // 從values中取值賦值給season，取出完畢退出for
        System.out.println("for-each loop ");
        for(Season2 season : values){
            System.out.print(season + "\t");
        }

        //valueOf : 將字符串轉為列舉物件，要求字符串必須為已有的常量名，否則報錯
        //1. 根據輸入的名稱，到Season2的列舉物件中查詢
        //2. 找到返回，沒有找到則報錯
        Season2 autumn2 = Season2.valueOf("AUTUMN");
        System.out.println(autumn2);
        System.out.println(autumn == autumn2);
//        Season2 xch = Season2.valueOf("xch"); No enum constant com.xchedu.enum_.Season2.xch

        //compareTo() 比較兩個列舉常量，比較的是編號
        //不報錯(類型沒有異常)
        //return self.ordinal - other.ordinal;
        //自身編號[2] - 比較編號[3]
        System.out.println(Season2.AUTUMN.compareTo(Season2.WINTER));
    }
}
