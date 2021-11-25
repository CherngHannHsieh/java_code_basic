package com.xchedu.customgeneric;

public class CustomGeneric_ {
    public static void main(String[] args) {

    }
}

/*
1. Tiger 後面泛型，為自定義泛型類
2. T, R, M 泛型的標示，一般是單個大寫字母
3. 泛行標示 可以有多個
4. 普通成員可以使用泛型 (屬性、方法)
5. 使用泛型的數組 不能初始化
6. 靜態方法(屬性) 不能使用泛型 => 因為靜態和類相關，在類加載時，物件尚未創建，所以無法完成初始化
*/
class Tiger<T, R, M> {
    String name;
    T t;
    R r;
    M m;
    //array 在 new 不確定變數類型，無法分配記憶體空間
//    T[] ta;

    public Tiger(String name, T t, R r, M m) {
        this.name = name;
        this.t = t;
        this.r = r;
        this.m = m;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }
}