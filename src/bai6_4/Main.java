package bai6_4;

public class Main {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(7, 10, 3, 3, 4);
        System.out.println(circle);
        circle.moveUp();
        circle.moveRight();
        System.out.println(circle);
    }
}

