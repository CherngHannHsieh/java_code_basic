package com.xchedu.customgeneric;

public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}

/*
1. 介面中，靜態成員不能使用泛型
2. 介面的泛型類型，在介面繼承或介面實現時確定
*/
interface IUsb<U,R>{
    int n = 10;
//    U name;
    R get(U u);
    void hi(R r);
    void run(R r1,R r2,U u1,U u2);
    default R method(U u){
        return null;
    }
}

interface IA extends IUsb<String , Double>{

}

//當我們去實作 IA 介面時，因為 IA 繼承 IUsb 介面，指定了 U 為 String ，R 為 Double。因此實現方法時，使用String 替代 U ，使用 Double 替代 R
class AA implements IA{

    @Override
    public Double get(String s) {
        return null;
    }
    @Override
    public void hi(Double aDouble) {

    }
    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}


class BB implements IUsb<Integer,Float>{
    @Override
    public Float get(Integer integer) {
        return null;
    }
    @Override
    public void hi(Float aFloat) {

    }
    @Override
    public void run(Float r1, Float r2, Integer u1, Integer u2) {

    }
}

class CC implements IUsb<Object,Object>{

    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }

    @Override
    public void run(Object r1, Object r2, Object u1, Object u2) {

    }
}