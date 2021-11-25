public class homework {
    public static void main(String[] args){
        char c1 = '\n';
        char c2 = '\t';
        char c3 = '\r';
        char c4 = '\\';
        char c5 = '1';
        char c6 = '2';
        char c7 = '3';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
    }
}

class homework2{
    public static void main(String[] args){
        String b1 = "www";
        String b2 = "eee";
        System.out.println(b1 + b2);

        char c1 = 'b';
        char c2 = 'g';
        System.out.println(c1 + c2); // bg?? ->得到b字碼值+g字碼值，注意char 的計算是把char轉為數字再相加，儲存讀取亦是

        double p1 = 1000;
        double p2 = 2000;
        System.out.println(p1 + p2);
    }
}

class homework3{
    public static void main(String[] args){
        String name = "jack";
        int age = 22;
        double score = 88.9;
        char gender = 'g';
        String hobby = "play";
        System.out.println("姓名\t年齡\t成績\t性別\t興趣\n" + name + "\t" + age + "\t"  + score + "\t"  + gender + "\t"  + hobby);
    }
}
