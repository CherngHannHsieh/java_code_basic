package com.xchedu.innerClass_;

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer06 outer06 = new Outer06();
        outer06.m1();
        //外部其他類訪問靜態內部類
        //1. 因為是靜態內部類，是可以透過類名直接訪問(須符合訪問權限)
        Outer06.Inner06 inner06 = new Outer06.Inner06();
        inner06.say();

        //2. 編寫方法 返回靜態內部類的實例
        Outer06.Inner06 inner0601 = outer06.getInner06();
        inner0601.say();

        //Outer06.getInner06_() return 一個實例，然後呼叫方法  Outer06.getInner06_().say();
        Outer06.Inner06 inner0602 = Outer06.getInner06_();
        inner0602.say();
    }
}

class Outer06{
    private int n1 = 1;
    private static String name = "張三";
    private static void cry(){
        System.out.println("cry()");
    }
    //靜態內部類
    //1. 放在外部類成員位置
    //2. 使用static修飾
    //3. 可以訪問外部類所有靜態成員，包含私有，但不能直接訪問非靜態成員
    //4. 可以隨意添加修飾符，因為它的地位是一個成員
    //5. 作用域為整個類，同一般成員
    static class Inner06{
        private static String name = "李四";
        public void say(){
            System.out.println("內部類 name =  "+name);
            //如果與外部類成員重名，採就近原則，若要訪問外部類，使用 外部類名.屬性 訪問
            System.out.println("外部類 name =  "+Outer06.name);
            cry();
        }
    }

    public void m1(){ //外部類訪問靜態內部類  ---> 創建物件，在訪問
        Inner06 inner06 = new Inner06();
        inner06.say();
    }

    public Inner06 getInner06(){
        return new Inner06();
    }

    public static Inner06 getInner06_(){
        return new Inner06();
    }
}