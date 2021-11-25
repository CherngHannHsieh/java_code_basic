public class Recursion01 {
    public static void main(String[] args) {
        T res = new T();

        System.out.println("no.7 = " + res.fibonacci(7));
        System.out.println("no.1 = " + res.peach(1));
    }
}

class T{
    /*
        1. n = 1 -> 1
        2. n = 2 -> 1
        3. n > 3 -> 前兩數之和
        4. 標準遞迴
    */
    public int fibonacci(int n){
        if(n == 1 || n ==2){
            return 1;
        }else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /* 逆推
    1. d10 = 10 -> 1
    2. d9 = 9 -> (d10+1) * 2 = 4
    3. d8 = 8 -> (d9+1) * 2 = 10
    4. 前一天的 = (後一天的+1) * 2
    */ 

    public int peach(int day){
        if(day == 10){
            return 1;
        }else if(day >= 1 && day <= 9){
            return (peach(day+1) + 1) * 2;
        }else{
            return -1;
        }
    }
}

