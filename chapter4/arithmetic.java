public class arithmetic{
    public static void main(String[] args){
        
        System.out.println(10/4); //數學來看2.5，java為2
        System.out.println(10.0/4); //java中2.5，取高精度的
        double d = 10 / 4; //java中2，2=>2.0
        System.out.println(d);

        // 取%的本質 a % b = a - a / b * b 
        System.out.println(10%3);
        System.out.println(-10%3); //-1
        System.out.println(10%-3); //1
        System.out.println(-10%-3); //-1
    }
}