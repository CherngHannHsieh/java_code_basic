import java.util.Scanner;

public class IfPractice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        if(a > 10.0 && b < 20.0){
            System.out.println("sum = " + (a + b));
        }
    }
}

class IfPractice2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        int sum = a + b;
        if(sum % 3 == 0 && sum % 5 == 0){
            System.out.println("sum�O3�M5������");
        }else{
            System.out.println("sum���O3�M5������");
        }
    }
}

class IfPractice3 {
    //�|�~�P�_
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("year = ");
        int year = scanner.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " �~�O�|�~");
        }else{
            System.out.println(year + " �~���O�|�~");
        }
    }
}

class IfPractice4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("credit point = ");
        int credit = scanner.nextInt();

        if(credit >= 0 && credit <= 100){
            if(credit == 100){
                System.out.println("�H�η��n");
            }else if(credit > 80 && credit <= 99){
                System.out.println("�H���u�q");
            }else if(credit >= 60 && credit <= 80){
                System.out.println("�H�Τ@��");
            }else{
                System.out.println("�H�Τ��ή�");
            }
        }else{
            System.out.println("�d��b0~100����");
        }
    }
}

class IfPractice5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("score = ");
        double score = scanner.nextDouble();
        if(score > 8.0){
            System.out.print("gender = ");
            //����String , �A��charAt�i��w��
            char gender = scanner.next().charAt(0);
            if(gender == '�k'){
                System.out.println("�i�J�k�l�ըM��");
            }else{
                System.out.println("�i�J�k�l�ըM��");
            }
        }else{
            System.out.println("�w�g�Q�^�O�F");
        }
    }
}

class IfPractice6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("��J���: ");
        int month = scanner.nextInt();
        System.out.print("��J�~��: ");
        int age = scanner.nextInt();
        if(month >= 4 && month <= 10){
            if(age >= 18 && age <= 60){
                System.out.println("������60");
            }else if(age < 18){
                System.out.println("������30");
            }else if(age > 60){
                System.out.println("������20");
            }
        }else{
            if(age >= 18 && age <= 60){
                System.out.println("������40");
            }else{
                System.out.println("������20");
            }
        }
    }

}