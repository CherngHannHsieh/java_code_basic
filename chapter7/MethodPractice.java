public class MethodPractice {
    public static void main(String[] args) {
        AA a = new AA();
        if(a.isOdd(1)){
            System.out.println("�_��");
        }else{
            System.out.println("����");
        }
        a.print(10, 10, '&');
    }
}

class AA{
    //��^���� ��k�W�� ��k���ΰ� ��k��
    public boolean isOdd(int n){
        return n % 2 != 0;
    }
    
    //��^���� ��k�W�� ��k���ΰ� ��k��
    public void print(int row,int colume,char c){
        for(int i = 0;i<row;i++){
            for(int j = 0; j < colume;j++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}