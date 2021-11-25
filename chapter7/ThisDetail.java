public class ThisDetail {
    public static void main(String[] args) {
        T t1 = new T();
        t1.f2();
        t1.f3();
    }
}

class T{
    String name = "ff";
    int age = 50;

    /*
    訪問建構子方法 this(參數列表)
    只能在建構子中使用(在建構子中訪問另一個建構子)
    注意: 訪問建構子的語法必須放置在第一句
    */

    public T(){
        //這裡去訪問 T(int a,int b) 建構子
        this("jacj",50);
        System.out.println("T() 建構子");
    }

    public T(String name,int age){
        System.out.println("T(int a,int b) 建構子");
    }

    // 訪問成員方法的語法 this.方法名(參數列表)
    public void f1(){
        System.out.println("f1() method");
    }

    public void f2(){
        System.out.println("f2() method");
        //訪問成員方法
        //1.
        f1();
        //2.
        this.f1();
    }

    public void f3(){

        String name = "we";
        int age = 100;
        //作用域關係，就近
        System.out.println(name + "\t" + age);
        //透過this來訪問本類的屬性，亦可將形參(局部變量)準確指派給本類屬性
        System.out.println(this.name + "\t" + this.age);
    }
}