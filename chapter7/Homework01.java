public class Homework01 {
    public static void main(String[] args) {
        double[] d1 = {};
        A01 t1 = new A01();
        Double res = t1.max(d1);
        if(res != null){
            System.out.println("max = " + res);
        }else{
            System.out.println("error");
        }
    }
}

class A01{
    public Double max(double[] num){
        if(num != null && num.length > 0){
            double max = num[0];
            for(int i = 1; i < num.length; i++){
                if(max < num[i]){
                    max = num[i];
                }
            }
            return max;
        }else{
            return null;
        }
        
    }
}
