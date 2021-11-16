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

class Title {
    public String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

class Author {
    public String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class Content {
    public String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}