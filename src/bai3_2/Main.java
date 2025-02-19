package bai3_2;

public class Main {
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(1, 2, 3);
        MyPolynomial p2 = new MyPolynomial(3, 4);

        System.out.println("P1: " + p1);
        System.out.println("P2: " + p2);
        System.out.println("P1 + P2: " + p1.add(p2));
        System.out.println("P1 * P2: " + p1.multiply(p2));
        System.out.println("P1(2): " + p1.evaluate(2));
    }
}
