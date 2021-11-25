import java.util.Scanner;

public class If01{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("AGE: ");
        int age = scanner.nextInt();
        if(age > 18){
            System.out.println("over 18");
        }else {
            System.out.println("under 18");
        }
        System.out.println("continue......");
    }
}