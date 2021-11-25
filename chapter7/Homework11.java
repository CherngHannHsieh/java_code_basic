public class Homework11 {
    public static void main(String[] args) {
        
    }
}

/*
要求復用建構子 -> 從少的來
*/
class Employee{
    String name;
    char gender;
    int age;
    String job;
    double sal;

    public Employee(String job, double sal){
        this.job = job;
        this.sal = sal;
    }

    public Employee(String name,char gender,int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Employee(String name,char gender,int age,String job, double sal){
        this(name,gender,age); //使用到前一個的建構子
        // this(job,sal); 不能寫在第二行
        this.job = job;
        this.sal = sal;
    }
}