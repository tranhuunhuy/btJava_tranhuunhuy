package bai6_5;

public class Main {
    public static void main(String[] args) {
        ResizableCircle resizableCircle = new ResizableCircle(7);

        System.out.println("Initial " + resizableCircle);
        System.out.println("Area: " + resizableCircle.getArea());
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());

        resizableCircle.resize(150);

        System.out.println("\nAfter resizing by 150%: " + resizableCircle);
        System.out.println("Area: " + resizableCircle.getArea());
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());
    }
}

