package com.xchedu.exception_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDetail {
    public static void main(String[] args) {
        f2();
    }

    public static void f2() {
        //1. 編譯異常 ->try-catch or throws
        //2. 運行時異常，程序中沒有處理，默認throws

        int n1 = 10;
        int res = n1 / 0;
    }

    public static void f1() throws FileNotFoundException{
        //why call f3() error?
        //1. 因為f3拋出的是一個編譯異常
        //2. f1必須處理這個編譯異常
        //3. 要馬拋出，要馬try-catch
        f3();
        try {
            f3(); //throws 異常
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void f3() throws FileNotFoundException{
        FileInputStream fis = new FileInputStream("www");
    }

    public static void f4(){
        //why not error
        //1. f5()拋出的是運行異常
        //2. java中，並不要求程序原顯示處理，因為有默認處理機制
        f5();
    }

    public static void f5() throws ArithmeticException{

    }
}

class Father {
    public void method() throws RuntimeException {
    }
}

class Son extends Father {
    //3. 子類重寫放類方法時，對拋出異常的規定:子類重寫方法，所以拋出的異常要馬和富類拋出的異常一致，要馬為父類拋出異常的子類
    //4. 在throws 過程中，如果方法有try-catch ，可以不必throws
    @Override
    /*throws Exception , FileNotFoundException -> error*/
    public void method() throws ArithmeticException {
        super.method();
    }
}
