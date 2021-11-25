public class autoDetail {
    
    public static void main(String[] args){
        //多種數據類型運算時，系統會自動將所有數值轉成容量最大的那種數據類型，然後再進行運算
        int n1 = 10;
        //float n2 = n1 + 1.1; //error
        //double n2 = n1 + 1.1; //ok -> double
        float n2 = n1 + 1.1f;

        //byte,short,char之間不會自動轉換
        byte b1 = 10;
        //char c1 = b1; //error byte cannot lossy convert to char

        //byte,char,short可以進行運算，會先轉為int
        short s1 = 10;
        //short s2 = s1 + b1; //error s1 + b1 => int
        int s2 = s1 + b1;
        //byte b2 = b1 + b1;//error b1 + b1 => int
        
        byte b3 = 1;
        short s3 = 10;
        int a = 1;
        double d = 1.1;
        //最終結果以操作中最大的數據類型
        double d2 = b3 + s3 + a + d; 
    }
}
