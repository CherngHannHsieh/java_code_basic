package com.xchedu.innerClass_;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.f1();
        //外部其他類不能訪問匿名內部類，因為匿名內部類是局部變數
        System.out.println("main " + outer04);
    }
}

/*
匿名內部類既是類，也是物件
*/
class Outer04{
    private int n1 = 100;
    public void f1(){
        //基於類的匿名內部類
        //作用域:僅在定義它的方法或代碼塊中
        Person p = new Person(){
            private int n1 = 88;
            @Override
            public void hi() {
                System.out.println("匿名內部類重寫方法");
                System.out.println("Outer04 private n1 = " + Outer04.this.n1);
                //若匿名內部類與外部成員重名時，採取就近原則，想要訪問外部成員，可以使用 外部類名.this.成員 訪問
                //Outer04.this 就是調用f1 的物件，誰調用f1，Outer04.this 就是誰
                System.out.println(Outer04.this);
            }
        };
        p.hi(); //運行時動態綁定 -> 真正的運行類型是Outer04$1

        //也可以直接調用 匿名內部類本身也是返回對象
//        new Person(){
//            @Override
//            public void hi() {
//                System.out.println("直接調用，物件都不創立了");
//            }
//
//            @Override
//            public void ok(String str) {
//                super.ok(str);
//            }
//        }.ok("jacky");
    }
}

class Person{
    public void hi(){
        System.out.println("Person hi()");
    }
    public void ok(String str){
        System.out.println("Person ok str = " + str);
    }
}
