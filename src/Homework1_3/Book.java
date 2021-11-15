package Homework1_3;


public class Book {
    public class Title {
        public String title;

        public void setTitle(String title) {
            this.title = title;
        }
        public String getTitle() {
            return title;
        }
    }
    Title title = new Title();
    public class Author {
        public String author;

        public void setAuthor(String author) {
            this.author = author;
        }
        public String getAuthor() {
            return author;
        }
    }
    Author author = new Author();
    public class Content {
        public String content;

        public void setContent(String content) {
            this.content = content;
        }
        public String getContent() {
            return content;
        }
    }
    Content content = new Content();
    public void show() {
        System.out.println("[Название книги: " + title.getTitle());
        System.out.println(" Автор книги: " + author.getAuthor());
        System.out.println(" Содержание: " + content.getContent() + "]");
    }

}
