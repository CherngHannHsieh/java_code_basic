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

        //���&&�Ө��A�e�̬�false�A��̤��P�_
        if(a < 1 && ++b < 50){
            System.out.println("ok300");
        }
        System.out.println(a + " " + b);

        //���&�Ө��A�e�̬�false�A��̤��|�P�_
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
        //���||�Ө��A�e�̬�true�A��̤��P�_
        if(a > 1 || ++b > 4){
            System.out.println("ok300");
        }
        System.out.println(a + " " + b);
        //���|�Ө��A�e�̬�true�A��̤��P�_
        if(a > 1 | ++b > 4){
            System.out.println("ok300");
        }
        System.out.println(a + " " + b);
    }
}
