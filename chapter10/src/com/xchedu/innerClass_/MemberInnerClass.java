package com.xchedu.innerClass_;

public class MemberInnerClass {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
//        outer05.t1();

        //外部成員使用成員內部類的兩種方式
        // outer05.new Inner05()，相當於把 new Inner05() 當作是 outer05的成員
        Outer05.Inner05 inner05 = outer05.new Inner05();
        inner05.say();

        //第二種方式，在外部類中編寫方法，可以返回Inner05的物件
        Outer05.Inner05 inner0501 = outer05.getInner05();
        inner0501.say();
    }
}

class Outer05 { //外部類
    private int n1 = 80;
    public String name = "張三";
    private void hi(){
        System.out.println("private hi()...");
    }
    //2. 可以添加任何修飾符，因為它的地位就是一個成員
    class Inner05 { //成員內部類 1. 定義在外部類的成員位置上
        private int n1 = 66;
        private int sal = 90;
        public void say() {
            //可以直接訪問所有外部類成員，包含私有
            System.out.println("Inner05 n1 = " + n1 + ", Outer05 name = " + name);
            hi();

            //如果成員內部類與外部類的成員重名，採就近原則，訪問外部類，可以使用 外部類.this.屬性 來訪問
            System.out.println("Outer05 n1 = " + Outer05.this.n1 + ", Outer05 name = " + name);
        }
    }

    //寫方法
    public void t1(){ //使用成員內部類
        //創建成員內部類物件，然後再調用
        Inner05 inner05 = new Inner05();
        inner05.say();
//        System.out.println(inner05.sal);
    }
    //方法返回一個Inner05的實例
    public Inner05 getInner05(){
        return new Inner05();
    }
}