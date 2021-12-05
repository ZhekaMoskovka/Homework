package Homework8_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework8_2 {

    static public void checkYearFormat(int year) throws WrongYearException {
        if (year < 1950 || year > 2021) {
            throw new WrongYearException();
        }
    }

    static public void sortArray(ArrayList<Worker> array) {
        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j < i; j++) {
                char[] j1 = array.get(j).firstName.toCharArray();
                char[] j2 = array.get(j + 1).firstName.toCharArray();
                for (int g = 0; g < j1.length; g++) {
                    if (j1[g] > j2[g]) {
                        Worker temp = array.get(j);
                        array.set(j, array.get(j + 1));
                        array.set(j + 1, temp);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int listCapacity = 2;
        ArrayList<Worker> workers = new ArrayList<>(listCapacity);
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < listCapacity; i++) {
            System.out.print("Введите имя: ");
            String firstName = input.next();
            System.out.print("Введите фамилию: ");
            String secondName = input.next();
            System.out.print("Введите название специальности: ");
            String job = input.next();
            System.out.print("Введите год начала работы: ");
            int year = input.nextInt();
            try {
                checkYearFormat(year);
            } catch (WrongYearException e) {
                System.err.print(e.getMessage());
                i -= 1;
                continue;
            }
            workers.add(new Worker(firstName, secondName, job, year));
        }
        sortArray(workers);
        for (int i = 0; i < workers.size(); i++) {
            System.out.printf("Имя: %s\nФамилия: %s\nНазвание специальности: %s\nСтаж работы: %s\n\n", workers.get(i).firstName, workers.get(i).secondName, workers.get(i).job, workers.get(i).experience());
        }
    }
}