public class Homework05 {
    public static void main(String[] args) {
        Circle c = new Circle(3);
        c.circleLength();
        c.circleArea();
    }
}

class Circle{
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void circleLength(){
        System.out.println(2 * Math.PI * radius);
    }

    public void circleArea(){
        System.out.println(3.14 * Math.PI * radius);
    }
}