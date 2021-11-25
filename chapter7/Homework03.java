public class Homework03 {
    public static void main(String[] args) {
        Book b1 = new Book("DD",5000);
        b1.info();
        b1.updatePrice();
        b1.info();
    }
}

class Book{
    String name;
    int price;

    public Book(String name,int price){
        this.name = name;
        this.price = price;
    }

    public void updatePrice(){
        if(price > 150){
            price  = 150;
        }else if(price > 100){
            price = 100;
        }
    }

    public void info(){
        System.out.println(name + "\t" + price);
    }
}