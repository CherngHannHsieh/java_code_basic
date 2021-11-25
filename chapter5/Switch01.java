import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("��J�r��a~g: ");
        char input = scanner.next().charAt(0);
        //�bjava���A�u�n���Ȫ�^�A�N�O�@�Ӫ�F��
        //1. ��F�����ƾ��������Mcase�����G�����@�P�A�άO�i�H�۰��ন�i�H���ۤ���������A�p��Jchar�A�`�q��int
        //2. ��F������^�ȥ����� byte , short , int ,char , enum , String
        //3. case���ȥ����O�`�q�α`�q��F���A����O�ܶq
        switch(input){
            case 'a':
                System.out.println("�P���@");
                break;
            case 'b':
                System.out.println("�P���G");
                break;
            case 'c':
                System.out.println("�P���T");
                break;
            case 'd':
                System.out.println("�P���|");
                break;
            case 'e':
                System.out.println("�P����");
                break;
            case 'f':
                System.out.println("�P����");
                break;
            case 'g':
                System.out.println("�P����");
                break;
            default:
                System.out.println("�W�X�d��");
                break;
        } 
    }
}

class Switch2{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("��J�r��: ");
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
        //1.�P�_���Z�ή�P�_
        Scanner scanner = new Scanner(System.in);
        System.out.print("��J���Z: ");
        int score = scanner.nextInt();
        if(score >= 0 && score <= 100){
            switch(score/60){
                case 0:
                    System.out.println("���ή�");
                    break;
                case 1:
                    System.out.println("�ή�");
                    break;
            }
        }else{
            System.out.println("���Z��J���~");
        }
    }
}

class Switch4{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("��J���: ");
        int month = scanner.nextInt();
        switch(month){
            case 3:
            case 4:
            case 5:
                System.out.println("�K�u");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("�L�u");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("��u");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("�V�u");
                break;
        }
    }

}