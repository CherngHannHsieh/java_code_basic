public class Method01 {
    public static void main(String[] args) {
        //use method
        //寫好方法，不調用不會輸出
        //創建對象
        Person p = new Person();
        //調用方法
        p.speak();
        p.cal01();
        p.cal02(5000); //call cal02, n = 5000
        //call getSum n1 =10, n2 = 20
        // getSum返回的值 賦予 res
        int res = p.getSum(100, 20); 
        System.out.println(res);

    }
}

class Person{
    
    int age;
    String name;
    
    //Method
    //public 公開 ， void 沒有返回值，speak() 方法名
    public void speak(){
        System.out.println("good person");
    }

    public void cal01(){
        int sum = 0;
        for(int i = 1; i <= 1000; i++){
            sum += i;
        }
        System.out.println(sum);
    }
    // (int n) 參數列表 ，當前有一個參數n，可以接收輸入 
    public void cal02(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    // int 方法執行後，返回int 
    //return res  把res的值返回
    public int getSum(int n1,int n2){
        int res = n1 + n2; 
        return res;
    }

}