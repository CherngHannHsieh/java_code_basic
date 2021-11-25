public class floatDetail {
    public static void main(String[] args){
        //float n1 = 1.1;//incompatible types: possible lossy conversion from double to float
        float n2 = 1.1f;
        double n3 = 1.1;
        double n4 = 1.1f;
        System.out.println(5.12e2); // 5.12*10^2
        System.out.println(5.12E-2); // 5.12/10^2

        //double比float更精確
        double n5 = 2.1234567891;
        float n6 = 2.1234567891f;
        System.out.println(n5);
        System.out.println(n6);

        double n11 = 2.7;
        double n12 = 8.1 / 3;
        System.out.println(n11);
        System.out.println(n12); //接近2.7的小數，非2.7
        // 對計算過的小數進行相等比較時要小心
        if(Math.abs(n11 - n12) < 0.000001){
            System.out.println("差值非常小，視為相等");
        }
        // 應該要以兩個數的差值的絕對值，在某個精度範圍判斷
        System.out.println(Math.abs(n11 - n12));
        // shift + alt + k 複製插入
        // ctrl + shift + k 刪除當行
    }
}
