package bai5_2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(7, "blue");

        Cylinder cylinder = new Cylinder(circle, 10);

        System.out.println("Cylinder base color: " + cylinder.getBaseColor());
        System.out.println("Cylinder volume: " + cylinder.volume());
    }
}
