package Homework11_2;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework11_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer temp = iterator.next();
            System.out.print(temp + ", ");
        }
    }
}