package bai4_5;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("blue", false);
        System.out.println(shape);

        Circle circle = new Circle(5.5, "green", true);
        System.out.println(circle);
        System.out.println("Area of circle: " + circle.getArea());
        System.out.println("Perimeter of circle: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(4, 7, "yellow", true);
        System.out.println(rectangle);
        System.out.println("Area of rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());

        Square square = new Square(6, "red", false);
        System.out.println(square);
        System.out.println("Area of square: " + square.getArea());
        System.out.println("Perimeter of square: " + square.getPerimeter());

        square.setSide(8);
        System.out.println("Updated square: " + square);
        System.out.println("Updated side: " + square.getSide());
    }
}

