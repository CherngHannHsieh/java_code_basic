public class Homework {
    public static void main(String[] args){
        /*
        to simple
        1. double cash = 100000 , int count = 0
        2. while cash > 0 , if(cash > 50000){}else{}
        */

        double cash = 100000;
        int count = 0;

        while(true){
            if(cash > 50000){
                cash *= 0.95; 
                count++;
            }else{
                cash -= 1000;
                count++;
            }
            if(cash < 1000){
                break;
            }
        }
        System.out.println("total = " + count);
    }
}

class Homework2 {
    public static void main(String[] args){
        /*
        1. int a = 153 -> 1,5,3 -> /100,%100/10,%10
        2. if()
        */
        int n1 = 153;
        int a = (int)(n1 / 100);
        int b = (int)((n1 % 100) / 10);
        int c = n1 % 10;

        if(n1 == a * a * a + b * b * b + c * c * c){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}

class Homework3 {
    public static void main(String[] args){
        // 1. 1~100 獶5计计
        // 2. 5︽int count
        int count = 5;
        for(int i = 1;i <= 100; i++){
            if(i % 5 != 0){
                count--;
                System.out.print(i + "\t");

                if(count == 0){
                    System.out.println();
                    count = 5;
                }
            }
            
        }
    }
}

class Homework4 {
    public static void main(String[] args){
        //才セ借琌计笲衡
        for(char c = 'a';c <= 'z';c++){
            System.out.print(c + "\t");
        }
        for(char c = 'Z';c >= 'A';c--){
            System.out.print(c + "\t");
        }
    }
}

class Homework5 {
    public static void main(String[] args){
        /*
        猔種计拜肈 1/njava -> 0 , 1.0/nΤ弘
        */

        //method 1
        // double sum1 = 0;
        // double sum2 = 0;

        // for(int i = 1;i <= 99;i += 2){
        //     sum1 += 1.0 / i;
        // }
        // for(int i = 2;i <= 100;i += 2){
        //     sum2 += 1.0 / i;
        // }

        // System.out.println(sum1 - sum2);

        //method2
        double sum = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 != 0){
                sum += 1.0 / i;
            }else{
                sum -= 1.0 / i;
            }
        }
        System.out.println(sum);
    }
}

class Homework6 {
    public static void main(String[] args){
        /*
        1. Τ100兜
        2. –兜计硋亥糤
        3. 盻for
        4. i ボ材碭兜ョ琌赣兜程计
        */
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            for(int j = 1; j <= i; j++){
                sum += j;
            }
        }
        System.out.println(sum);
    }
}