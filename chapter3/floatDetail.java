public class floatDetail {
    public static void main(String[] args){
        //float n1 = 1.1;//incompatible types: possible lossy conversion from double to float
        float n2 = 1.1f;
        double n3 = 1.1;
        double n4 = 1.1f;
        System.out.println(5.12e2); // 5.12*10^2
        System.out.println(5.12E-2); // 5.12/10^2

        //double��float���T
        double n5 = 2.1234567891;
        float n6 = 2.1234567891f;
        System.out.println(n5);
        System.out.println(n6);

        double n11 = 2.7;
        double n12 = 8.1 / 3;
        System.out.println(n11);
        System.out.println(n12); //����2.7���p�ơA�D2.7
        // ��p��L���p�ƶi��۵�����ɭn�p��
        if(Math.abs(n11 - n12) < 0.000001){
            System.out.println("�t�ȫD�`�p�A�����۵�");
        }
        // ���ӭn�H��Ӽƪ��t�Ȫ�����ȡA�b�Y�Ӻ�׽d��P�_
        System.out.println(Math.abs(n11 - n12));
        // shift + alt + k �ƻs���J
        // ctrl + shift + k �R�����
    }
}
