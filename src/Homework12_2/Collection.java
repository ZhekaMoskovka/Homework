package Homework12_2;

import java.util.Iterator;

public class Collection implements java.util.Collection<String> {
    int size = 0;
    String []array;
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(String t) {
        String []newArray = new String[size + 1];
        for (int i = 0; i < size + 1; i++){
            if (i < size){
                newArray[i] = array[i];
            } else if (i == size) {
                newArray[i] = t;
            }
        }
        array = newArray;
        size += 1;
        return true;
    }


    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(java.util.Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(java.util.Collection<? extends String> c) {
        return false;
    }

    @Override
    public boolean removeAll(java.util.Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(java.util.Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
    public void doubleValue() {
        String []newArray = new String[size * 2];
        int j = 0;
        for (int i = 0; i < size; i++) {
            for (int k = 0; k < 2; k++){
                newArray[j] = array[i];
                j++;
            }
        }
        array = newArray;
    }
    public String get (int pos) {
        return array[pos];
    }
}