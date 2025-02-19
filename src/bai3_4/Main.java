package bai3_4;

public class Main {
    public static void main(String[] args) {
        MyTime time = new MyTime(17, 57, 27);
        System.out.println("Current time: " + time);

        time.nextSecond();
        System.out.println("After next second: " + time);

        time.previousSecond();
        System.out.println("After previous second: " + time);

        time.nextMinute();
        System.out.println("After next minute: " + time);

        time.previousMinute();
        System.out.println("After previous minute: " + time);

        time.nextHour();
        System.out.println("After next hour: " + time);

        time.previousHour();
        System.out.println("After previous hour: " + time);
    }
}

