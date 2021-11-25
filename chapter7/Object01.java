public class Object01{
    public static void main(String[] args){
        //實例化一隻貓
        //創建一隻貓，並賦予cat1，cat1是個object
        Cat cat1 = new Cat();
        cat1.name = "小白";
        cat1.age = 2;
        cat1.color = "白";
        //創建第二隻貓，並賦予cat2，cat2是個object
        Cat cat2 = new Cat();
        cat2.name = "小花";
        cat2.age = 100;
        cat2.color = "花";

        System.out.println(cat1.name + "\t" + cat1.age + "\t" + cat1.color);

        System.out.println(cat2.name + "\t" + cat2.age + "\t" + cat2.color);
    }

}

//定義一個貓類
class Cat{
    //屬性 成員變量
    String name;
    int age;
    String color;
}