package Homework8_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Homework8_3 {
    static public void checkShop(String shopName) throws WrongShopException {
        if (shopName.equals("Гошан") || shopName.equals("Оли") || shopName.equals("Идея")) {
        } else {
            throw new WrongShopException();
        }
    }

    static public void sortArray(ArrayList<Price> array) {
        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j < i; j++) {
                char[] j1 = array.get(j).shopName.toCharArray();
                char[] j2 = array.get(j + 1).shopName.toCharArray();
                for (int g = 0; g < j1.length; g++) {
                    if (j1[g] > j2[g]) {
                        Price temp = array.get(j);
                        array.set(j, array.get(j + 1));
                        array.set(j + 1, temp);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Price> products = new ArrayList<>(2);

        for (int i = 0; i < 2; i++) {
            System.out.print("Введите название магазина: ");
            String shopName = input.next();
            try {
                checkShop(shopName);
            } catch (WrongShopException e) {
                System.err.println(e.getMessage());
                i -= 1;
                continue;
            }
            System.out.print("Введите название товара: ");
            String productName = input.next();
            System.out.print("Введите стоимость товара: ");
            double price = input.nextDouble();
            products.add(new Price(productName, shopName, price));
        }
        sortArray(products);
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("Название магазина: %s\nНазвание товара: %s\nСтоимость: %f\n\n", products.get(i).shopName, products.get(i).productName, products.get(i).price);
        }
    }
}