package Homework5_4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Homework5_4 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(2);
        array.add(5);
        array.add(8);
        ListIterator<Integer> listIterator = array.listIterator();
        while (listIterator.hasNext()) {
            Integer integer = listIterator.next();
            integer += 1;
            System.out.print(" " + integer + ",");
        }
    }
}