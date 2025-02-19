package bai1_8;

public class Main {
    public static void main(String[] args) {
        Time t1 = new Time(3, 27, 59);
        System.out.println(t1);

        t1.setHour(7);
        t1.setMinute(35);
        t1.setSecond(7);
        System.out.println(t1);
        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());

        t1.setTime(23, 59, 59);
        System.out.println(t1);

        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond());

        System.out.println(t1.previousSecond());
        System.out.println(t1.previousSecond().previousSecond());
    }
}
