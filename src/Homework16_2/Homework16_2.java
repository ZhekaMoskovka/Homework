package Homework16_2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Homework16_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();
        Pattern pattern = Pattern.compile("\\s+");
        String []nums = pattern.split(expression);
        Calculator calculator = new Calculator(Double.valueOf(nums[0]), Double.valueOf(nums[2]));
        switch (nums[1]){
            case "+":
                System.out.println("Результат: " + calculator.sum());
                break;
            case "-":
                System.out.println("Результат: " + calculator.sub());
                break;
            case "*":
                System.out.println("Результат: " + calculator.mul());
                break;
            case "/":
                System.out.println("Результат: " + calculator.div());
                break;
        }
    }
}