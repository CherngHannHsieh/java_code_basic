package com.xchedu.exception_;

public class CustomException {
    public static void main(String[] args) {
        int age = 180;

        if(!(age >= 18 && age <= 120)){
            throw new AgeException("年齡不在 18 ~ 120 之間");
        }
        System.out.println("age range correct");
    }
}
//自定義異常
//一般情況，自定義異常繼承RuntimeException
//好處是可以使用默認的處理機制
class AgeException extends RuntimeException{
    public AgeException(String message) { //建構子
        super(message);
    }
}