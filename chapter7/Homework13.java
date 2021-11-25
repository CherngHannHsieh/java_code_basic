import javax.naming.ldap.ManageReferralControl;

public class Homework13 {
    public static void main(String[] args) {
        PassObject pass = new PassObject();
        Circle c = new Circle();
        pass.printArea(c, 5);
    }
}

class Circle{
    double radius;
    public double findArea(){
        return Math.PI * radius * radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
}

class PassObject{
    public void printArea(Circle c , int times){
        System.out.println("Radius\tArea");
        for(int i = 1; i <= times ; i++){
            c.radius = i;
            System.out.println(c.radius + "\t" +c.findArea());
        }
    }
}