import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        //�Ы�Scanner��H
        Scanner myScanner = new Scanner(System.in);
        System.out.println("�п�J�m�W: ");
        String name = myScanner.next();
        System.out.println("�п�J�~��: ");
        int age = myScanner.nextInt();
        System.out.println("�п�J�~��: ");
        double salary = myScanner.nextDouble();
        System.out.println("�m�W: " + name + "�~��: " + age + "�~��: " + salary);
    }
}
