package com.xchedu.interface_;

public class ExtendsVsImplement {
    public static void main(String[] args) {
        LittleMonkey little = new LittleMonkey("little");
        little.climb();
        little.swimming();
        little.fly();
    }
}

class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climb() {
        System.out.println("猴子會爬樹");
    }
}

interface Fishnable {
    void swimming();
}

interface Birdnable {
    void fly();
}

//當子類繼承父類，自動擁有父類功能
//需要擴展功能，通過實作介面來擴展
//實作介面是對java單繼承機制的一種補充

/*
1. 繼承與介面解決的問題不同
2. 繼承主要價值為解決程式碼的覆用性和可維護性
   介面為設計各種規範(方法)，讓其他類去實作這些方法
3. 介面比繼承更加靈活，繼承是 is - a，介面是 like - a
4. 介面在一定程度上實現了代碼解耦[介面規範性 + 動態綁定]
*/
class LittleMonkey extends Monkey implements Fishnable, Birdnable {
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void climb() {
        System.out.println("小猴子會爬樹");
    }

    @Override
    public void swimming() {
        System.out.println("小猴子跟魚學游泳");
    }

    @Override
    public void fly() {
        System.out.println("小猴子跟鳥學飛行");
    }
}