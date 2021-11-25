public class Constructor01 {
    public static void main(String[] args) {
        Person01 p1 = new Person01(500, "WWHITE");
        System.out.println(p1.age);
        System.out.println(p1.name);
    }
}

/*
Constructor 
1. 是 class 的一種特殊方法，主要作用是完成對新 object 的初始化 (非創建新object，而是初始化object)
2. 名稱需與類名相同
3. 沒有返回值，也不能寫 void
4. Constructor 的調用是由系統完成的
5. 在創建 object 時，系統會自動調用該類的建構子完成物件的初始化
*/
class Person01{
    int age;
    String name;
    //建構子
    public Person01(int pAge,String pName){
        age = pAge;
        name = pName;
        System.out.println("調用建構子成功，完成對物件的初始化");
    }
} 

class Dog{
    /*
    6. 沒有定義建構子，系統會自動生成一個默認建構子
    7. 定義了建構子，默認建構子會被覆蓋，無法再使用默認建構子
       除非顯式的定義，才能使用
    */ 

    public Dog(){
        
    }

    public Dog(String dName){

    }
}