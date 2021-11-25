import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        //創建Scanner對象
        Scanner myScanner = new Scanner(System.in);
        System.out.println("請輸入姓名: ");
        String name = myScanner.next();
        System.out.println("請輸入年齡: ");
        int age = myScanner.nextInt();
        System.out.println("請輸入薪水: ");
        double salary = myScanner.nextDouble();
        System.out.println("姓名: " + name + "年齡: " + age + "薪水: " + salary);
    }
}
