public class PropertiesDetail {
    public static void main(String[] args) {
        //創建Person對象
        //p1 是 對象名(對象引用)
        //new Person() 創建的的對象空間(數據)，才是真正的對象
        Person p1 = new Person();

        //對象的默認值，遵守array規則
        System.out.println(p1.age);
        System.out.println(p1.name);
        System.out.println(p1.sal);
        System.out.println(p1.isPass);
    }
}

class Person{
    int age;
    String name;
    double sal;
    boolean isPass;
}