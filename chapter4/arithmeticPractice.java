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
       //�٦�59�ѩ񰲡A����X�P�X��
       //���R
       /*
       1. �ϥ� int �s days
       2. �@�g7�ѡAweek = days/7 , leftDays = days % 7
       */
       int day = 59;
       int week = day / 7;
       day = day % 7;
       System.out.println(week + "�g" + day + "��");
    }
}

class arithmeticPractice4 {
    public static void main(String[] args){
       //�ؤ�����ഫ�A��� = 5/9 * (�ؤ� - 100)
       //���R
       /*
       1. �ϥ� double �s �ؤ�B���
       2. c = 5/9 * (f - 100)
       3. �Ҽ{�ƾǤ����Pjava���B��覡�t��
       */
       double f = 1234.6;
       // 5/9 �bjava���|�ܦ�0
       double c = 5.0 / 9 * (f - 100);
       System.out.println(c);
    }
}