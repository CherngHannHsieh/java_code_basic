
public class RandomMath {
    public static void main(String[] args){
        for(int i = 1; i <= 10 ; i++){
            System.out.println((int)(Math.random() * 100) + 1);
        }
    }
}

class Break1{
    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            if( i == 3){
                break;
            }
            System.out.println(i);
        }
    }
}