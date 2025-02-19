package bai1_1;

public class Main {
    public static void main(String[] args) {
            Circle c1 = new Circle();
            System.out.println("The circle has radius of " + c1.getRadius() + " and the area of " + c1.getArea() + " " + c1.getColor()) ;
            Circle c2 = new Circle(2.0);
            System.out.println("The circle has radius of " + c2.getRadius() + " and the area of " + c2.getArea() + " " + c2.getColor()) ;
            Circle c3 = new Circle(3.0);
            c3.setColor("blue");
            System.out.println("The circle has radius of " + c3.getRadius() + " and the area of " + c3.getArea() + " " + c3.getColor()) ;

    }
}
