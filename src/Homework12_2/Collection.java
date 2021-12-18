package Homework12_2;

import java.util.ArrayList;

public class Collection {
    public int size = 0;
    public ArrayList<String> array;

    public int size() {
        return size;
    }

    public void add(String t) {
        array.add(t);
        size += 1;
    }

    public void doubleValue() {
       ArrayList<String> newArray = new ArrayList<>(size * 2);
       for (int i = 0; i < size; i++) {
           for (int j = 0; j < 2; j++){
               newArray.add(array.get(i));
           }
       }
       array = newArray;
    }
    public String get (int pos) {
        return array.get(pos);
    }
}