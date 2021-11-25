public class OverloadPractice {
    public static void main(String[] args) {
        Methods m = new Methods();
        
        System.out.println(m.cal(10));
        System.out.println(m.cal(10,20));
        System.out.println(m.cal("dd"));

        System.out.println(m.max(10, 20));
        System.out.println(m.max(10, 20.566));
        System.out.println(m.max(1.4, 2.4, 500));
    }
}

//overload
class Methods{
    /*
    1. 方法名相同
    2. 形參個數或型態不同
    3. 有無回傳不在此限
    */ 
    public int cal(int i){
        return i * i;
    }
    public int cal(int i,int j){
        return i * j;
    }
    public String cal(String i){
        return i;
    }

    public int max(int n1,int n2){
        return n1 > n2 ? n1: n2;
    }

    public double max(double n1,double n2){
        return n1 > n2 ? n1: n2;
    }

    public double max(double n1,double n2,double n3){
        double max = n1 > n2 ? n1: n2;
        return max > n3 ? max :n3;
    }
    
}
