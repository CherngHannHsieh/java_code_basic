public class MethodPractice02 {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "mname";
        p.age = 1100;

        MyTool m = new MyTool();
        Person p2 = m.copyPerson(p);

        System.out.println(p.name + "\t" + p.age);
        System.out.println(p2.name + "\t" + p2.age);
    }
}

class Person{
    int age;
    String name;
}

class MyTool{
    //返回類型 名稱 形參 方法體
    public Person copyPerson(Person p){
        Person p2 = new Person();
        p2.name = p.name;
        p2.age =  p.age;
        return p2;
    }
}


