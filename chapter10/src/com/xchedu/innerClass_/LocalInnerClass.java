package com.xchedu.innerClass_;

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
        System.out.println(outer02);
    }
}

//局部內部類
//1. 定義位置
//2. 作用域
//3. 本質仍是一個類

class Outer02 {
    private int n1 = 100;

    private void m2() {
        System.out.println("outer02 m2()");
    }

    public void m1() { //方法
        //3. 不能添加訪問修飾符，但可以使用 final
        //4. 作用域:僅在定義它的方法或代碼塊中
        final class Inner02 { //1. 局部內部類(類似局部變數)，通常在方法中定義，仍是一個類
            private int n1 = 800;
            //2. 可以直接訪問外部成員，包含私有的
            public void f1() {
                //5. 局部內部類可以直接訪問外部類的成員，比如下面外部類的n1,m2()
                //7. 如果外部類與內部類的成員重名，默認遵循就近原則，如果想要訪問外部成員，使用 外部類名.this.成員 去訪問
                //Outer02.this 本質就是外部類物件，哪個物件調用了m1, Outer02.this就是哪個物件
                System.out.println("n1 = " + Outer02.this.n1);
                System.out.println(Outer02.this);
                m2();
            }
        }
        //6. 外部類在方法中，可以創建Inner02物件，然後調用方法
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }
}