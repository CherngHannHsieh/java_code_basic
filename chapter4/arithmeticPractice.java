public class arithmeticPractice {
    public static void main(String[] args){
        int i = 1;
        i = i++;    
        //(1.temp = 1 (2.i = i + 1 (3.i = temp 
        System.out.println(i);  // 1
    }
}

class arithmeticPractice2 {
    public static void main(String[] args){
        int i = 1;
        i = ++i;    
        //(1.i = i + 1 (2.temp = i (3.i = temp 
        System.out.println(i);  // 1
    }
}

class arithmeticPractice3 {
    public static void main(String[] args){
       //還有59天放假，等於幾周幾天
       //分析
       /*
       1. 使用 int 存 days
       2. 一週7天，week = days/7 , leftDays = days % 7
       */
       int day = 59;
       int week = day / 7;
       day = day % 7;
       System.out.println(week + "週" + day + "天");
    }
}

class arithmeticPractice4 {
    public static void main(String[] args){
       //華氏攝氏轉換，攝氏 = 5/9 * (華氏 - 100)
       //分析
       /*
       1. 使用 double 存 華氏、攝氏
       2. c = 5/9 * (f - 100)
       3. 考慮數學公式與java的運算方式差異
       */
       double f = 1234.6;
       // 5/9 在java中會變成0
       double c = 5.0 / 9 * (f - 100);
       System.out.println(c);
    }
}