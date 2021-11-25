import java.util.Scanner;

public class SeqSearch {
    public static void main(String[] args) {
        String[] names = {"a","b","c","d"};
        Scanner myScanner = new Scanner(System.in);
        int index = -1;

        System.out.print("name: ");
        String name = myScanner.next();

        for(int i = 0; i < names.length; i++){
            //Compare String -> equals 
            if(name.equals(names[i])){
                index = i;
                System.out.println("find it, index = " + (i+1));
                break;
            }
        }

        if(index == -1){
            System.out.println("nothing");
        }
    }
}
