package Homework8_2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class Homework8_2 {

    static public void checkYearFormat(int year) throws WrongYearException {
        Date date = new Date();
        SimpleDateFormat formattedDate = new SimpleDateFormat("yyyy");
        if (year < 1950 || year > Integer.valueOf(formattedDate.format(date))) {
            throw new WrongYearException();
        }
    }
    public static void main(String[] args) {
        int listCapacity = 5;
        ArrayList <Worker> workers= new ArrayList<>(listCapacity);
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < listCapacity; i++) {
            System.out.print("Введите имя: ");
            String firstName = input.next();
            System.out.print("Введите фамилию: ");
            String secondName = input.next();
            System.out.print("Введите название специальности: ");
            String job = input.next();
            try{
                System.out.print("Введите год начала работы: ");
                int year = input.nextInt();
                checkYearFormat(year);
                workers.add(new Worker(firstName, secondName, job, year));
            } catch (WrongYearException e) {
                System.err.print(e.getMessage());
                i -= 1;
                continue;
            }
        }
        workers.sort(Comparator.comparing(Worker::getFirstName));
        for (int i = 0; i < workers.size(); i++) {
            System.out.printf("Имя: %s\nФамилия: %s\nНазвание специальности: %s\nСтаж работы: %s\n\n", workers.get(i).firstName, workers.get(i).secondName, workers.get(i).job, workers.get(i).experience());
        }
    }
}