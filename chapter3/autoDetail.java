public class autoDetail {
    
    public static void main(String[] args){
        //�h�ؼƾ������B��ɡA�t�η|�۰ʱN�Ҧ��ƭ��ন�e�q�̤j�����ؼƾ������A�M��A�i��B��
        int n1 = 10;
        //float n2 = n1 + 1.1; //error
        //double n2 = n1 + 1.1; //ok -> double
        float n2 = n1 + 1.1f;

        //byte,short,char�������|�۰��ഫ
        byte b1 = 10;
        //char c1 = b1; //error byte cannot lossy convert to char

        //byte,char,short�i�H�i��B��A�|���ରint
        short s1 = 10;
        //short s2 = s1 + b1; //error s1 + b1 => int
        int s2 = s1 + b1;
        //byte b2 = b1 + b1;//error b1 + b1 => int
        
        byte b3 = 1;
        short s3 = 10;
        int a = 1;
        double d = 1.1;
        //�̲׵��G�H�ާ@���̤j���ƾ�����
        double d2 = b3 + s3 + a + d; 
    }
}
