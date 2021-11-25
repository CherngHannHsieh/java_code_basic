package com.xchedu.interface_;

public class InterfacePolyPass {
    public static void main(String[] args) {
        //介面類型的變數可以指向，實現了該介面的類的物件
        IG ig = new Teacher();
        //如果IG繼承IH介面，Teacher實做了IG介面，相當於Teacher也實作了IH介面-->介面多型傳遞
        IH ih = new Teacher();
    }
}

interface IH {
    void hi();
}

interface IG extends IH {
}

class Teacher implements IG {
    @Override
    public void hi() {

    }
}