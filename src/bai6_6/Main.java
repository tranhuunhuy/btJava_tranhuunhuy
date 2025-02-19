package bai6_6;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Pill");
        Animal dog = new Dog("Bull de");
        Animal bigDog = new BigDog("Bull daica");

        cat.greets();
        dog.greets();
        ((Dog) dog).greets((Dog) dog);
        bigDog.greets();
        ((Dog) bigDog).greets((Dog) dog);
        ((BigDog) bigDog).greets((BigDog) bigDog);
    }
}