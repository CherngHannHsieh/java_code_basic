import java.util.Random;
import java.util.Scanner;

public class Homework14 {
    public static void main(String[] args) {
        Tom tom = new Tom();
        Scanner myScanner = new Scanner(System.in);
        int getReturn = 0;
        for(int i = 1; i <= 3 ;i++){
            System.out.print("輸入 0石頭 1剪刀 2布 : ");
            int player = myScanner.nextInt();
            System.out.println("--------------------");
            if(tom.play(player) == 1){
                getReturn++;
            }
            System.out.println("--------------------");
        }
        System.out.println("Tom win " + getReturn);
    }
}

class Tom{
    int com;
    int person;
    
    public int play(int player){
        //電腦隨機
        Random r  = new Random();
        com = r.nextInt(3); // 0-2
        // com = (int)(Math.random() * 3);
        person = player;
        if(person - com == -1 || (person == 2 && com ==0)){
            System.out.println("Tom = " + person + " Com = " + com + "\t你贏了");
            return 1;
        }else if (person == com){
            System.out.println("Tom = " + person + " Com = " + com + "\t平手");
            return 0;
        }else{
            System.out.println("Tom = " + person + " Com = " + com + "\t你輸了");
            return 0;
        }
    }
}