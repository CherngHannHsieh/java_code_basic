public class logic {
    public static void main(String[] args){
        int age = 50;
        if(age > 20 && age < 90){
            System.out.println("ok100");
        }

        if(age > 20 & age < 90){
            System.out.println("ok200");
        }

        int a = 4;
        int b = 9;

        //對於&&而言，前者為false，後者不判斷
        if(a < 1 && ++b < 50){
            System.out.println("ok300");
        }
        System.out.println(a + " " + b);

        //對於&而言，前者為false，後者仍會判斷
        if(a < 1 & ++b < 50){
            System.out.println("ok300");
        }
        System.out.println(a + " " + b);
    }
}

class logic2{
    public static void main(String[] args){
        int age = 50;
        if(age > 20 || age < 30){
            System.out.println("ok100");
        }

        if(age > 20 | age < 30){
            System.out.println("ok200");
        }

        int a = 4;
        int b = 9;
        //對於||而言，前者為true，後者不判斷
        if(a > 1 || ++b > 4){
            System.out.println("ok300");
        }
        System.out.println(a + " " + b);
        //對於|而言，前者為true，後者不判斷
        if(a > 1 | ++b > 4){
            System.out.println("ok300");
        }
        System.out.println(a + " " + b);
    }
}
