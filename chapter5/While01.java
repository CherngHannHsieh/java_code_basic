public class While01 {
    public static void main(String[] args){
        int i = 1;
        while(i <= 10){
            System.out.println("�A�n " + i);
            i++;
        }
        System.out.println(i);
    }
}

class While02 {
    public static void main(String[] args){
        /*
        ���c��²
        1. 1~100
        2. 1~100��3������
        �ͦ��ᬡ
        1. �d��
        2. ����
        */
        int start = 1;
        int end = 100;
        int t = 3;
        while(start <= end){
            if(start % t == 0){
                System.out.println("i = " + start);
            }
            start++;
        }
    }

}

class While03 {
    public static void main(String[] args){
        /*
        ���c��²
        1. 40~200
        2. 40~200������
        �ͦ��ᬡ
        1. �d��
        2. ����
        */
        int start = 40;
        int end = 200;
        int t = 2;
        while(start <= end){
            if(start % t == 0){
                System.out.println("i = " + start);
            }
            start++;
        }
    }

}