package Homework1_2;
import java.util.Scanner;

public class Homework1_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.print("Введите длину прямоугольника: ");
        rectangle.side1 = input.nextDouble();
        System.out.print("Введите ширину прямоугольника: ");
        rectangle.side2 = input.nextDouble();
        System.out.println("Площалдь: " + rectangle.areaCalculator(rectangle.side1, rectangle.side2));
        System.out.println("Периметр: " + rectangle.perimeterCalculator(rectangle.side1, rectangle.side2));
    }
}
