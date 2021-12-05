package Homework8_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Homework8_3 {
    static public void checkShop (String shopName) throws WrongShopException {
        if (shopName.equals("Гошан") || shopName.equals("Оли") || shopName.equals("Идея")) {
        } else {
            throw new WrongShopException();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Price> products = new ArrayList<>(2);

        for (int i = 0; i < 2; i++) {
            String shopName = new String();
            try {
                System.out.print("Введите название магазина: ");
                shopName = input.next();
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
        products.sort(Comparator.comparing(Price::getShopName));
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("Название магазина: %s\nНазвание товара: %s\nСтоимость: %f\n\n", products.get(i).shopName, products.get(i).productName, products.get(i).price);
        }
    }
}
