public class Homework11 {
    public static void main(String[] args) {
        
    }
}

/*
�n�D�_�Ϋغc�l -> �q�֪���
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
        this(name,gender,age); //�ϥΨ�e�@�Ӫ��غc�l
        // this(job,sal); ����g�b�ĤG��
        this.job = job;
        this.sal = sal;
    }
}