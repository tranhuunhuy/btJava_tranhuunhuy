package bai3_5;

public class Main {
    public static void main(String[] args) {
        MyDate date = new MyDate(2023, 12, 25);
        System.out.println(date.toString());
        System.out.println(date.nextDay().toString());
    }
}

