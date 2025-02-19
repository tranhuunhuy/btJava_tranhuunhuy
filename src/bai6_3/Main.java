package bai6_3;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(2, 4, 5, 10);
        System.out.println("Initial position: " + point);

        point.moveUp();
        System.out.println("After moving up: " + point);

        point.moveDown();
        System.out.println("After moving down: " + point);

        point.moveLeft();
        System.out.println("After moving left: " + point);

        point.moveRight();
        System.out.println("After moving right: " + point);
    }
}
