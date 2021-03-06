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
            System.out.println("sum是3和5的倍數");
        }else{
            System.out.println("sum不是3和5的倍數");
        }
    }
}

class IfPractice3 {
    //閏年判斷
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("year = ");
        int year = scanner.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " 年是閏年");
        }else{
            System.out.println(year + " 年不是閏年");
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
                System.out.println("信用極好");
            }else if(credit > 80 && credit <= 99){
                System.out.println("信用優秀");
            }else if(credit >= 60 && credit <= 80){
                System.out.println("信用一般");
            }else{
                System.out.println("信用不及格");
            }
        }else{
            System.out.println("範圍在0~100之間");
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
            //接收String , 再用charAt進行定位
            char gender = scanner.next().charAt(0);
            if(gender == '男'){
                System.out.println("進入男子組決賽");
            }else{
                System.out.println("進入女子組決賽");
            }
        }else{
            System.out.println("已經被淘汰了");
        }
    }
}

class IfPractice6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("輸入月份: ");
        int month = scanner.nextInt();
        System.out.print("輸入年齡: ");
        int age = scanner.nextInt();
        if(month >= 4 && month <= 10){
            if(age >= 18 && age <= 60){
                System.out.println("票價為60");
            }else if(age < 18){
                System.out.println("票價為30");
            }else if(age > 60){
                System.out.println("票價為20");
            }
        }else{
            if(age >= 18 && age <= 60){
                System.out.println("票價為40");
            }else{
                System.out.println("票價為20");
            }
        }
    }

}