package bai1_3;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1.7f, 2.4f);
        System.out.println(r1);
        Rectangle r2 = new Rectangle();
        System.out.println(r2);

        r1.setLenght(5.5f);
        r1.setWidth(7.7f);
        System.out.println(r1);
        System.out.println("length is: " + r1.getLenght());
        System.out.println("width is: " + r1.getWidth());

        System.out.printf("area is: %.2f%n", r1.getArea());
        System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());
    }
}
