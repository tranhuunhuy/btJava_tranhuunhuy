package bai6_6;

abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void greets();
}
