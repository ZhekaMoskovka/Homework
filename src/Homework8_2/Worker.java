package Homework8_2;

public class Worker {
    public String firstName;
    public String secondName;
    public String job;
    public int year;
    public int date = 2021;

    public Worker(String firstName, String secondName, String job, int year) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.job = job;
        this.year = year;
    }

    public String getFirstName() {
        return firstName;
    }

    public int experience() {
        return date - year;
    }
}