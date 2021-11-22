package Homework3_4;

import java.util.Scanner;

public class Homework3_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите номер ключа(если ключа нету введите none): ");
        String key = input.next();
        if (key.equals("00000000")) {
            DocumentWorker documentWorker = new ProDocumentWorker();
        } else if (key.equals("11111111")) {
            DocumentWorker documentWorker = new ExpertDocumentWorker();
        } else {
            DocumentWorker documentWorker = new DocumentWorker();
        }
    }
}