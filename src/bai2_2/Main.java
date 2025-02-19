package bai2_2;

public class Main {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Nhu Y", "yth@gmail.com", 'm');
        authors[1] = new Author("Truc", "lbtt@gmail.com", 'm');

        Book java = new Book("Java", authors, 19.99, 99);
        System.out.println(java);
    }
}
