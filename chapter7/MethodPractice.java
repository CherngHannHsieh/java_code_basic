public class MethodPractice {
    public static void main(String[] args) {
        AA a = new AA();
        if(a.isOdd(1)){
            System.out.println("奇數");
        }else{
            System.out.println("偶數");
        }
        a.print(10, 10, '&');
    }
}

class AA{
    //返回類型 方法名稱 方法的形參 方法體
    public boolean isOdd(int n){
        return n % 2 != 0;
    }
    
    //返回類型 方法名稱 方法的形參 方法體
    public void print(int row,int colume,char c){
        for(int i = 0;i<row;i++){
            for(int j = 0; j < colume;j++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}