package com.xchedu.innerClass_;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer03 outer03 = new Outer03();
        outer03.method();
    }
}

class Outer03 {
    private int n1 = 10;

    public void method() {
        //基於介面的匿名內部類
        //1. 想要使用A介面，並實作物件
        //2. Tiger編譯類型 A(介面類型),運行類型就是匿名內部類 Outer03$1
        /*
            class xxx implements A{
                @Override
                public void cry() {
                    System.out.println("Tiger...");
                }
            }
        */
        //3. 在創建匿名內部類 Outer03$1 ，立即創建Outer03$1的物件，把地址傳給tiger
        //4. 匿名內部類使用一次，就不能在使用
        A tiger = new A() {
            @Override
            public void cry() {
                System.out.println("Tiger...");
            }
        };
        System.out.println(tiger.getClass());
        tiger.cry();
        tiger.cry();
        tiger.cry();

        //基於類的匿名內部類
        /*
        1. 編譯類型 Father
        2. 運行類型 Outer03$2
        3. 底層會創見匿名內部類
            class Outer03$2 extends Father{
                @Override
                public void test() {
                    System.out.println("匿名內部類 Outer03$2 重寫了 test");
                }
            }
         4. 同時也直接返回了 匿名內部類 Outer03$2的物件
         5. 參數列表會傳遞給建構子
        */
        Father jack = new Father("jack") {
            @Override
            public void test() {
                System.out.println("匿名內部類 Outer03$2 重寫了 test");
            }
        };
        System.out.println(jack.getClass());
        jack.test();

        //基於抽象類的匿名內部類
        Animal animal= new Animal(){
            @Override
            void eat() {
                System.out.println("eat...");
            }
        };
        animal.eat();
    }
}

interface A {
    public void cry();
}

class Father {
    public Father(String name) {
        System.out.println("接收name = " + name);
    }

    public void test() {

    }
}

abstract class Animal{
    abstract void eat();
}