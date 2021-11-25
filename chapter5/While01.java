public class While01 {
    public static void main(String[] args){
        int i = 1;
        while(i <= 10){
            System.out.println(" " + i);
            i++;
        }
        System.out.println(i);
    }
}

class While02 {
    public static void main(String[] args){
        /*
        て羉虏
        1. 1~100
        2. 1~100い3计
        ネ
        1. 絛瞅
        2. 计
        */
        int start = 1;
        int end = 100;
        int t = 3;
        while(start <= end){
            if(start % t == 0){
                System.out.println("i = " + start);
            }
            start++;
        }
    }

}

class While03 {
    public static void main(String[] args){
        /*
        て羉虏
        1. 40~200
        2. 40~200案计
        ネ
        1. 絛瞅
        2. 计
        */
        int start = 40;
        int end = 200;
        int t = 2;
        while(start <= end){
            if(start % t == 0){
                System.out.println("i = " + start);
            }
            start++;
        }
    }

}