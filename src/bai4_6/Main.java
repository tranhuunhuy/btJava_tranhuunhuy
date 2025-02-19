package bai4_6;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        Mammal mammal = new Mammal("Generic Mammal");
        Cat cat = new Cat("Tom");
        Dog dog1 = new Dog("Bull");
        Dog dog2 = new Dog("Pull");

        System.out.println(animal);
        System.out.println(mammal);
        System.out.println(cat);
        System.out.println(dog1);

        cat.greets();
        dog1.greets();
        dog1.greets(dog2);
    }
}

