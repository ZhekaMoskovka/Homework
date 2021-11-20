package Homework1_3;

import java.util.Scanner;

public class Homework1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите название книги: ");
        String title_input = input.next();
        Title title = new Title();
        title.setTitle(title_input);
        System.out.print("Введите автора книги: ");
        String author_input = input.next();
        Author author = new Author();
        author.setAuthor(author_input);
        System.out.print("Введите содержание книги: ");
        String content_input = input.next();
        Content content = new Content();
        content.setContent(content_input);
        Book book = new Book(title, author, content);
        System.out.println("Данные по книге: ");
        book.show();
    }
}