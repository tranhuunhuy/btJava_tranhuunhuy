package bai3_1;

public class Main {
    public static void main(String[] args) {
        MyComplex c1 = new MyComplex(3, 4);
        MyComplex c2 = new MyComplex(1, -2);

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);

        MyComplex sum = c1.addNew(c2);
        System.out.println("c1 + c2: " + sum);

        MyComplex difference = c1.subtractNew(c2);
        System.out.println("c1 - c2: " + difference);

        MyComplex product = c1.multiply(c2);
        System.out.println("c1 * c2: " + product);

        try {
            MyComplex quotient = c1.multiply(c2);
            System.out.println("c1 / c2: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }

        System.out.println("Magnitude of c1: " + c1.magnitude());
        System.out.println("Magnitude of c2: " + c2.magnitude());

        System.out.println("Argument of c1 (in radians): " + c1.argument());
        System.out.println("Argument of c2 (in radians): " + c2.argument());

        MyComplex conjugateC1 = c1.conjugate();
        System.out.println("Conjugate of c1: " + conjugateC1);

        System.out.println("Is c1 real? " + c1.isReal());
        System.out.println("Is c1 imaginary? " + c1.isImaginary());

        System.out.println("c1 equals (3, 4)? " + c1.equals(3, 4));
        System.out.println("c1 equals c2? " + c1.equals(c2));
    }
}

