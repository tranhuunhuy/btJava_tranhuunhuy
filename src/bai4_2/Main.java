package bai4_2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Dai", "Phu Van");
        System.out.println(person);

        Student student = new Student("Y", "Phu Dong", "Computer Science", 2024, 10000);
        System.out.println(student);

        Staff staff = new Staff("Linh", "Xuan Ky", "FPT school", 50000);
        System.out.println(staff);
    }
}
