import java.util.Scanner;

public class BreakPractice {
    public static void main(String[] args){
        int sum = 0;
        int n = 0;
        for(int i = 1; i <= 100; i++){
            sum += i;
            if(sum > 20){
                n = i;
                break;
            }
        }
        System.out.println("sum = " + sum + ", ·í«e¼Æ = " + n);
    }
}

class BreakPractice2 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int chance = 3;
        for(int i = 1; i <= 3 ;i++){
            System.out.print("name: ");
            String name = myScanner.next();
            System.out.print("password: ");
            String password = myScanner.next();
            // String use equals to compare two Strings
            if("jack".equals(name) && "666".equals(password)){
                System.out.println("login success");
                break;
            }

            chance--;
            System.out.println("error");
            System.out.println("you still have " + chance + " times");
        }

    }

}