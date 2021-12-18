package Homework12_3;

import java.util.LinkedList;
import java.util.Scanner;

public class Homework12_3 {
    public static LinkedList<Integer> getIntegerList(int []nums) {
        LinkedList<Integer> newNums = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            newNums.add(nums[i]);
        }
        return newNums;
    }
    public static int getMinimum (LinkedList<Integer> nums) {
        int min = nums.stream().min((x, y) -> Integer.compare(x, y)).get();
        return min;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Сколько чисел вы хотите ввести? ");
        int listCapacity = input.nextInt();
        int []nums = new int[listCapacity];
        for (int i = 0; i < listCapacity; i++) {
            System.out.print("Введите целое цисло: ");
            nums[i] = input.nextInt();
        }
        LinkedList<Integer> integerLinkedList = getIntegerList(nums);
        System.out.println("Минимум: " + getMinimum(integerLinkedList));
    }
}