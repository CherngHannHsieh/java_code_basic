public class ternary{
    public static void main(String[] args){
        // int a = 10;
        // int b = 99;
        // int result = a < b ? a : b;
        //int c = a < b ? 1.1 : 2.5;//error double->int
        // System.out.println(result);
        int a = 553;
        int b = 33;
        int c = 123;
        //���R
        // 1. �����ӡA���Ӥ�����j�����Ӧb�P�ĤT�Ӥ�
        int m1 = a > b ? a : b;
        int m2 = m1 > c ? m1 : c;
        System.out.println(m2);

    }
}