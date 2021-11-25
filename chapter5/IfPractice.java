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
            System.out.println("sum琌3㎝5计");
        }else{
            System.out.println("sumぃ琌3㎝5计");
        }
    }
}

class IfPractice3 {
    //秥耞
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("year = ");
        int year = scanner.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " 琌秥");
        }else{
            System.out.println(year + " ぃ琌秥");
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
                System.out.println("獺ノ伐");
            }else if(credit > 80 && credit <= 99){
                System.out.println("獺ノ纔╭");
            }else if(credit >= 60 && credit <= 80){
                System.out.println("獺ノ");
            }else{
                System.out.println("獺ノぃの");
            }
        }else{
            System.out.println("絛瞅0~100ぇ丁");
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
            //钡ΜString , ノcharAt秈︽﹚
            char gender = scanner.next().charAt(0);
            if(gender == '╧'){
                System.out.println("秈╧舱∕辽");
            }else{
                System.out.println("秈舱∕辽");
            }
        }else{
            System.out.println("竒砆瞊∣");
        }
    }
}

class IfPractice6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("块る: ");
        int month = scanner.nextInt();
        System.out.print("块闹: ");
        int age = scanner.nextInt();
        if(month >= 4 && month <= 10){
            if(age >= 18 && age <= 60){
                System.out.println("布基60");
            }else if(age < 18){
                System.out.println("布基30");
            }else if(age > 60){
                System.out.println("布基20");
            }
        }else{
            if(age >= 18 && age <= 60){
                System.out.println("布基40");
            }else{
                System.out.println("布基20");
            }
        }
    }

}