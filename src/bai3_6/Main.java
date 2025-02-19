package bai3_6;

public class Main {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 10, 5, 5);
        Container container = new Container(0, 0, 100, 100);

        System.out.println(container);
        System.out.println(ball.toString());
        System.out.println("Collides: " + container.collides(ball));
    }
}
