package Homework12_4;

import java.util.HashMap;
import java.util.Scanner;

public class Homework12_4 {
    public static void main(String[] args) {
        HashMap<String, String> familiesInCities = new HashMap<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите фамилию семьи: ");
            String secondName = input.next();
            System.out.printf("Введите в каком городе проживает семья %s: ", secondName);
            String city = input.next();
            familiesInCities.put(city, secondName);
        }
        System.out.print("Введите город в котором проживает какая-то семья: ");
        String findFamilyInCity = input.next();
        System.out.println("Семья проживающая в этом городе: " + familiesInCities.get(findFamilyInCity));
    }
}