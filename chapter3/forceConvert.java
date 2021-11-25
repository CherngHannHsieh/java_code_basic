public class forceConvert {
    public static void main(String[] args){
        //強制轉換，精度大->精度小
        int n1 = (int)1.6; //精度損失
        System.out.println(n1);
        int n2 = 2000;
        byte b = (byte)n2; //數值溢出
        System.out.println(b);

        //int x = (int)10*3.5; // error double -> int
        int x = (int)(10*3.5);
        System.out.println(x);
    }
}
