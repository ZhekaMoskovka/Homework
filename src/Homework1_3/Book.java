package Homework1_3;

public class Book {

    Title title = new Title();
    Author author = new Author();
    Content content = new Content();

    public void show() {
        System.out.println("[Название книги: " + title.getTitle());
        System.out.println(" Автор книги: " + author.getAuthor());
        System.out.println(" Содержание: " + content.getContent() + "]");
    }

}