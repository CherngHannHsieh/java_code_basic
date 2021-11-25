public class Homework06 {
    public static void main(String[] args) {
        Cale c = new Cale();
        System.out.println(c.plus(1, 5));
        System.out.println(c.minus(50, 40));
        System.out.println(c.mul(50, 400));
        if(c.division(50, 4) != null){
            System.out.println(c.division(50, 4));
        }
        if(c.division(50, 0) != null){
            System.out.println(c.division(50, 0));
        }
    }
}

class Cale{
    double n1;
    double n2;

    public double plus(double n1,double n2){
        return n1 + n2;
    }

    public double minus(double n1,double n2){
        return n1 - n2;
    }

    public double mul(double n1,double n2){
        return n1 * n2;
    }

    public Double division(double n1,double n2){
        if(n2 == 0){
            System.out.println("n2 = 0 , error");
            return null;
        }else{
            return n1 / n2;
        }
    }

}