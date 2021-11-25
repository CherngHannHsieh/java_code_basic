public class ConstructorExercise {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.age + "\t" + p1.name);

        Person p2 = new Person("dd",50);
        System.out.println(p2.age + "\t" + p2.name);
    }
}

class Person{
    int age;
    String name;
    //無參建構子
    public Person(){
        age = 18;
    }

    public Person(String pName,int pAge){
        age = pAge;
        name = pName;
    }
}
