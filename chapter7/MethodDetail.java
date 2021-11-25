public class MethodDetail {
    public static void main(String[] args) {
        AA a = new AA();
        //接收的變數，需與返回的數據型態相同
        int[] answer = a.getSumSub(50, 40);
        for(int i = 0; i < answer.length ; i++){
            System.out.println(answer[i]);
        }

        a.say();
        a.b();
    }
}

class AA{
    public int[] getSumSub(int n1,int n2){
        //返回array 即可一次返回多個值
        int[] res = new int[2];
        res[0] = n1 + n2;
        res[1] = n1 - n2;
        //可以返回任何數值，不過需要與方法型態相同
        return res;
    }

    //同類中的方法，可直接調用
    public void print(int n){
        System.out.println(n);
    }

    public void say(){
        print(5);
    }

    public void b(){
        //創建要調用的其他類 -> 內存方法
        //跨類調用與修飾符有關
        System.out.println("------");
        B b1 = new B();
        b1.hi();
        System.out.println("------");
    }
}

class B{
    public void hi(){
        System.out.println("hi");
    }
}
