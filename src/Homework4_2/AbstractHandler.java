package Homework4_2;

public abstract class AbstractHandler {
    public String name;

    public void open() {
        System.out.printf("%s was opened\n", name);
    }

    public void create() {
        System.out.printf("%s was created\n", name);
    }

    public void change() {
        System.out.printf("%s was changed\n", name);
    }

    public void save() {
        System.out.printf("%s was saved\n", name);
    }
}