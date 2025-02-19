package bai6_2;

public class Main {
    public static void main(String[] args) {
        GeometricObject circle = new Circle(6);
        GeometricObject rectangle = new Rectangle(4, 7);

        System.out.println(circle);
        System.out.println("Area of circle: " + circle.getArea());
        System.out.println("Perimeter of circle: " + circle.getPerimeter());

        System.out.println(rectangle);
        System.out.println("Area of rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());
    }
}
