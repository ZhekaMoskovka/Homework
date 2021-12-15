package Homework12_2;

import java.util.Scanner;

public class Homework12_2 {
    public static void main(String[] args) {
        Collection strings = new Collection();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите слово: ");
            String word = input.next();
            strings.add(word);
        }
        strings.doubleValue();
        for (int i = 0; i < 10; i++) {
            System.out.println(strings.get(i));
        }
    }
}