import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("輸入字符a~g: ");
        char input = scanner.next().charAt(0);
        //在java中，只要有值返回，就是一個表達式
        //1. 表達式的數據類型應和case的長亮類型一致，或是可以自動轉成可以互相比較的類型，如輸入char，常量為int
        //2. 表達式的返回值必須為 byte , short , int ,char , enum , String
        //3. case的值必須是常量或常量表達式，不能是變量
        switch(input){
            case 'a':
                System.out.println("星期一");
                break;
            case 'b':
                System.out.println("星期二");
                break;
            case 'c':
                System.out.println("星期三");
                break;
            case 'd':
                System.out.println("星期四");
                break;
            case 'e':
                System.out.println("星期五");
                break;
            case 'f':
                System.out.println("星期六");
                break;
            case 'g':
                System.out.println("星期日");
                break;
            default:
                System.out.println("超出範圍");
                break;
        } 
    }
}

class Switch2{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("輸入字母: ");
        char c = scanner.next().charAt(0);
        switch(c){
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            default:
                System.out.println("other");
                break;
        }
    }
}

class Switch3{

    public static void main(String[] args){
        //1.判斷成績及格與否
        Scanner scanner = new Scanner(System.in);
        System.out.print("輸入成績: ");
        int score = scanner.nextInt();
        if(score >= 0 && score <= 100){
            switch(score/60){
                case 0:
                    System.out.println("不及格");
                    break;
                case 1:
                    System.out.println("及格");
                    break;
            }
        }else{
            System.out.println("成績輸入錯誤");
        }
    }
}

class Switch4{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("輸入月份: ");
        int month = scanner.nextInt();
        switch(month){
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
        }
    }

}