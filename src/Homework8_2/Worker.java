package Homework8_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Worker {
    public String firstName;
    public String secondName;
    public String job;
    public int year;
    Date date = new Date();
    SimpleDateFormat formattedDate = new SimpleDateFormat("yyyy");

    public Worker(String firstName, String secondName, String job, int year) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.job = job;
        this.year = year;
    }

    public String getFirstName() {
        return firstName;
    }

    public int experience(){
        return Integer.valueOf(formattedDate.format(date)) - year;
    }
}
