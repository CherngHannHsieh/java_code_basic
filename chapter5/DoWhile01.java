import java.util.Scanner;

public class DoWhile01 {
    public static void main(String[] args){
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i <= 10);
        System.out.println(i);
    }
}

class DoWhile02 {
    public static void main(String[] args){
        int i = 1;
        int sum = 0;
        do{
            System.out.println(i);
            sum += i;
            i++;
        }while(i <= 100);
        System.out.println(sum);
    }
}

class DoWhile03 {
    public static void main(String[] args){
        /*
        化繁為簡
        1. 1~200
        2. 1~200 是 5的倍數 但不是3的倍數
        3. 統計個數
        先死後活
        1.範圍
        2.倍數
        */ 
        int i = 1;
        int count = 0;
        do{
            if(i % 5 == 0 && i % 3 != 0){
                System.out.println("i = " + i);
                count++;
            }
            i++;
        }while(i <= 200);
        System.out.println("count = " + count);
    }
}

class DoWhile04 {
    public static void main(String[] args){
        /*
        化繁為簡
        1. 不停問 還錢嗎
        2. 接收使用者答案 -> scanner
        3. 判斷還不還錢 不還繼續迴圈
         */
        Scanner myScanner = new Scanner(System.in);
        char answer = ' ';
        do{
            System.out.print("還不還錢(y/n): ");
            answer = myScanner.next().charAt(0);
            if(answer == 'n'){
                System.out.println("閃電五連鞭");
            }else{
                System.out.println("欠錢還錢，天經地義");
            }
        }while(answer != 'y'); 
        System.out.println("還錢了");
    } 
}