public class Homework07 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("money","white",10);
        Dog dog2 = new Dog("lucky","green",1);
        dog1.show();
        dog2.show();
    }
}

class Dog{
    String name;
    String color;
    int age;

    public Dog(String name,String color,int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void show(){
        System.out.println("name = " + name);
        System.out.println("color = " + color);
        System.out.println("age = " + age);
    }
}