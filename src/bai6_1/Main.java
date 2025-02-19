package bai6_1;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "Red", true);
        Shape rectangle = new Rectangle(4, 6, "Blue", false);
        Shape square = new Square(3, "Green", true);

        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println();

        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        System.out.println();

        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

        Shape[] shapes = {circle, rectangle, square};
        System.out.println("\nPolymorphic behavior:");
        for (Shape shape : shapes) {
            System.out.println("Area of " + shape.getClass().getSimpleName() + ": " + shape.getArea());
            System.out.println("Perimeter of " + shape.getClass().getSimpleName() + ": " + shape.getPerimeter());
        }
    }
}
