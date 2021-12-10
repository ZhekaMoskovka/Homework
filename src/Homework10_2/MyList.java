package Homework10_2;

public interface MyList<T> {
    int length ();
    void add (int pos, T t);
    void add (T t);
    T get(int num);
}