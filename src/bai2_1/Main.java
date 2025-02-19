package bai2_1;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Nhu Y", "huuyz@gmail.com", 'm');
        Book book = new Book("Java Programming", author, 29.99, 10);
        System.out.println(book.toString());
    }

}
