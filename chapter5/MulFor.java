import java.util.Scanner;

public class MulFor {
    public static void main(String[] args){
        /*
        ���c��²
        1.) �p��1�ӯZ�����Z
        1.1 �Ы�scanner ������J
        1.2 ��������
        2.) 3�ӯZ
        3.) �Ҧ��Z�Ū����� totalScore 
        4.) int pass , score > 60
         */
        Scanner myScanner = new Scanner(System.in);
        double totalScore = 0;
        int pass = 0;
        int classNum = 3;
        int stuNum = 5;
        for(int i = 1;i <= classNum; i++){
            double sum = 0;
            for(int j = 1; j <= stuNum; j++){
                System.out.print("�п�J��" + i + "�ӯZ��" + j + "�Ӿǥͪ����Z: ");
                double score = myScanner.nextDouble();
                if(score >= 60){
                    pass++;
                }
                sum += score;
                System.out.println(score);
            }
            System.out.println("sum = " + sum + " , ���� = " + (sum / 5));
            totalScore += sum;
        }
        System.out.println("�T�ӯZ�`�� = " + totalScore + "�A ���� = " + (totalScore/15));
        System.out.println("�ή�H�� = " + pass);
    }
}


class MulFor2 {
    public static void main(String[] args){
        /*
        ���c��²
        1. 1*1~1*9
        2. 2*2~9*9
        */
        for(int i = 1;i <= 9;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(j + "*" + i + "=" + (i * j));
                System.out.print("\t");
            }
            System.out.println("");
        }
    }

}

class MulFor3 {
    public static void main(String[] args){
        /* �Ťߪ��r��
        ���c��²
        1. �x�� 5*5
        2. �b�Ӫ��r��
        *
        **
        ***
        ****
        *****
        3. ��Ӫ��r��      �Ů�
       *      1    2*1-1  4
      ***     3    2*2-1  3 
     *****    5    2*3-1  2
    *******   7    2*4-1  1
   *********  9    2*5-1  0
        4. �Ťߪ��r��
       *      1    ��e�檺�Ĥ@�өM�̫�@�ӬO*
      * *     2    ��e�檺�Ĥ@�өM�̫�@�ӬO*
     *   *    2    ��e�檺�Ĥ@�өM�̫�@�ӬO*
    *     *   2    ��e�檺�Ĥ@�өM�̫�@�ӬO*
   *********  9    ����
        �����ᬡ
        1. �h�ư����ܼ�
        */

        int totalLevel = 25;

        for(int i = 1;i <= totalLevel;i++){
            //�b��X*���e�n�Ҽ{�Ů�
            for(int k = 1;k <= totalLevel - i;k++){
                System.out.print(" ");
            }
            //����C�h��*�Ӽ�
            for(int j = 1;j <= 2 * i - 1;j++){
                //��e�檺�Ĥ@�өM�̫�@�ӬO*�A�̫�@�h���O*
                if(j == 1 || j == 2 * i -1 || i == totalLevel){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            //���h
            System.out.println("");
        }
    }
}

class MulFor4 {
    public static void main(String[] args){
        /*
        �Ťߵ٧�
        1. �b�Ӫ��r��
        2. ��Ӫ��r��
        3. �˪����r��
        4. ��ӵ٧�
        5. �Ťߵ٧�
        */
        //�W��
        for(int i = 1;i <= 5;i++){

            for(int k = 1;k <= 5 - i;k++){
                System.out.print(" ");
            }

            for(int j = 1;j <= 2 * i - 1;j++){
                if(j == 1 || j == 2 * i - 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }            
            }
            System.out.println("");
        }
        //�U��
        for(int i = 4;i >= 1;i--){

            for(int k = 1;k <= 5 - i;k++){
                System.out.print(" ");
            }

            for(int j = 1;j <= 2 * i - 1;j++){
                if(j == 1 || j == 2 * i -1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}