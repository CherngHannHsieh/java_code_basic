public class forceConvert {
    public static void main(String[] args){
        //�j���ഫ�A��פj->��פp
        int n1 = (int)1.6; //��׷l��
        System.out.println(n1);
        int n2 = 2000;
        byte b = (byte)n2; //�ƭȷ��X
        System.out.println(b);

        //int x = (int)10*3.5; // error double -> int
        int x = (int)(10*3.5);
        System.out.println(x);
    }
}
