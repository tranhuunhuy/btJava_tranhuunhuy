package bai2_5;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "Alester", 'f');
        Account account1 = new Account(101, customer1, 500);

        System.out.println(account1.toString());

        account1.deposit(100);
        System.out.println(account1.toString());

        account1.withdraw(150);
        System.out.println(account1.toString());

        account1.withdraw(500);
    }
}
