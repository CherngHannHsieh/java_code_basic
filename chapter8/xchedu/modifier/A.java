package com.xchedu.modifier;

public class A {
    public int n1 = 100;
    protected int n2 = 10;
    int n3 = 3;
    private int n4 = 4;
    // 在同一個類中 可以訪問 public protected 默認 private 的屬性方法
    public void m1(){
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);
    }
    protected void m2(){}
    void m3(){}
    private void m4(){}
}
//只有public 和 默認 可以修飾類
