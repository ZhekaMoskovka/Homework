package Homework5_2_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    public ArrayList<String> animals = new ArrayList<>(8);
    Scanner input = new Scanner(System.in);
    int i = 0;

    public void add() {
        while (i < 8) {
            System.out.print("Введите название животного: ");
            String animal = input.next();
            System.out.print("Введите номер его ячейки от 1 до 8: ");
            int index = input.nextInt();
            if (index - 1 <= animals.size() && index > 0) {
                animals.add(index - 1, animal);
                ++i;
            } else {
                System.out.print("Неправильно заданая ячейка\n");
            }
        }
    }
    public void get() {
        for (int i = 0; i < animals.size(); i++) {
            System.out.printf("Ячейка: %s    Животное: %s\n", i + 1, animals.get(i));
        }
    }
}