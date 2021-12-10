package Homework10_2;

public class List<T> implements MyList<T>{
    Object []array;
    int size = array.length;

    @Override
    public int length() {
        return size;
    }

    @Override
    public void add(int pos, T t) {
        Object []newArray = new Object[size + 1];
        for (int i = 0; i < size; i++){
            if (i < pos){
                newArray[i] = array[i];
            } else if (i == pos) {
                newArray[i] = t;
            } else {
                newArray[i + 1] = array[i];
            }
        }
        array = newArray;
        size += 1;
    }

    @Override
    public void add(T t) {
        add(size, t);
    }

    @Override
    public T get(int pos) {
        return (T) array[pos];
    }

    public List(T[] array) {
        this.array = array;
    }
    public List(int size) {
        this.size = size;
        this.array = new Object[size];
    }
}