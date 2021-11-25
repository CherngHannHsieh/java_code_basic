package com.xchedu.annotation;

public class Deprecated_ {
    public static void main(String[] args) {
        A a = new A();
        a.hi();
        System.out.println(a.n1);
    }
}

// @Deprecated 表示該元素已經過時
// 即使不推薦使用。但是仍然可以使用
// 可以修飾方法、類、包、參數等等
// 可以做版本升級過度使用
/*
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, MODULE, PARAMETER, TYPE})
public @interface Deprecated {
}
*/
@Deprecated
class A{
    @Deprecated
    public int n1 = 10;
    @Deprecated
    public void hi(){

    };
}