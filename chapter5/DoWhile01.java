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
        ���c��²
        1. 1~200
        2. 1~200 �O 5������ �����O3������
        3. �έp�Ӽ�
        �����ᬡ
        1.�d��
        2.����
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
        ���c��²
        1. ������ �ٿ���
        2. �����ϥΪ̵��� -> scanner
        3. �P�_�٤��ٿ� �����~��j��
         */
        Scanner myScanner = new Scanner(System.in);
        char answer = ' ';
        do{
            System.out.print("�٤��ٿ�(y/n): ");
            answer = myScanner.next().charAt(0);
            if(answer == 'n'){
                System.out.println("�{�q���s�@");
            }else{
                System.out.println("����ٿ��A�Ѹg�a�q");
            }
        }while(answer != 'y'); 
        System.out.println("�ٿ��F");
    } 
}