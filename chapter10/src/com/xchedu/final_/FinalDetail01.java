package com.xchedu.final_;

public class FinalDetail01 {
    public static void main(String[] args) {
        CC cc = new CC();
        new EE().show();

        // 包裝類String是final類 不能被繼承
    }
}

class AA{
    /* final
    1. 定義時賦值
    2. 建構子中
    3. 代碼塊
    */
    public final double TAX_RATE = 0.8;
    public final double TAX_RATE2;
    public final double TAX_RATE3;

    public AA() {
        TAX_RATE2 = 1.1;
    }

    {
        TAX_RATE3 = 8.8;
    }
}

class B{
    /*
    1. 定義時賦值
    2. 在靜態代碼塊中賦值，不能在建構子中賦值
        因為靜態屬性 在 類加載就進行初始化
        static + final 不會導致類加載(靜態代碼塊不會執行)
    */
    public final static  double TAX_RATE = 99.98;
    public final static  double TAX_RATE2;

    static{
        TAX_RATE2 = 88.2;
    }
}

//final類可以實例化
final class CC{}

//如果類是 非 final 類，但含有final方法，該方法不能override，但仍可以被繼承
class DD{
    public final void show(){
        System.out.println("final ...");
    }
}

class EE extends DD{

}