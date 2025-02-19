package bai1_7;

public class Main {
    public static void main(String[] args) {
        Date d1 = new Date(13, 1, 2025);
        System.out.println(d1);

        d1.setMonth(12);
        d1.setDay(25);
        d1.setYear(2025);
        System.out.println(d1);
        System.out.println("Month: " + d1.getMonth());
        System.out.println("Day: " + d1.getDay());
        System.out.println("Year: " + d1.getYear());

        d1.setDate(27, 5, 2026);
        System.out.println(d1);
    }
}
