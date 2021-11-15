package Homework1_3;
import java.util.Scanner;

public class Homework1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book book = new Book();
        System.out.print("Введите название книги: ");
        String title = input.next();
        book.title.setTitle(title);
        System.out.print("Введите автора книги: ");
        String author = input.next();
        book.author.setAuthor(author);
        System.out.print("Введите содержание книги: ");
        String content = input.next();
        book.content.setContent(content);

        System.out.println("Данные по книге: ");
        book.show();
    }
}
