package bai4_1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5, "blue");
        System.out.println(circle);
        System.out.println("Area of Circle: " + circle.getArea());

        Cylinder cylinder = new Cylinder(2.5, 5, "green");
        System.out.println(cylinder);
        System.out.println("Volume of Cylinder: " + cylinder.getVolume());
    }
}

