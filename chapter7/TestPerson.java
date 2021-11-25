public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("jack", 20);
        Person p2 = new Person("ff", 60);
        System.out.println(p1.compareTo(p2));
    }
}

class Person{
    String name;
    int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public boolean compareTo(Person p){
        //注意 String比較使用equals()
        // if(this.name.equals(p.name) && this.age == p.age){
        //     return true;
        // }else{
        //     return false;
        // }
        return this.name.equals(p.name) && this.age == p.age ? true : false;
    }
}
