public class For01 {
    public static void main(String[] args){
        //1.�`���ܼ�;2.�`������;4.�`���ܼƭ��N
        for(int i = 0 ; i < 8 ; i++){
            //3.����{���X
            System.out.println("MDFK" + (i+1));
        }

        for(int i = 0,j = 0; i < 3;i++, j+= 2){
            System.out.println("i=" + i + " j=" + j);
        }
    }
}

class For02 {
    public static void main(String[] args){
        // 1~100�����Ҧ�9�����ơA�έp�ӼƩM�`�M
        /* ���R
        ���c��²
        1. ��X1~100����
        2. �b��X���L�{���A�u��X9������
        3. �w�q�@���ܼ�count�A�x�s�Ӽ��`�M
        4. �w�q�@���ܼ�sum�A�x�s�Ҧ����ƪ��[�`
        �ͦ��ᬡ
        1. �N�d�򪺭Ȱ����ܶq
        2. �N���Ƨאּ�ܶq t
        */
        int count = 0;
        int sum = 0;
        int start = 1;
        int end = 100;
        int t = 9;
        for(int i = start; i <= end; i++){
            if(i % t == 0){
                System.out.println("i = " + i);
                count++;
                sum += i;
            }
        }
        System.out.println("��" + count + "��9������");
        System.out.println("sum = " + sum);
    }
}

class For03 {
    public static void main(String[] args){
        /*
        ���c��²
        1. ��X0~5
        2. �᭱�� + �O 5-i
        �ͦ��ᬡ
        1. �N 5 �����ܼ� n
        */
        int n = 50;
        for(int i = 0 ; i <= n ; i++){
            System.out.println(i + "+" + (n - i) + "=" + n);
        }
    }
}