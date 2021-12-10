package Homework10_3;

public class MyDictionary<TKey, TValue> {
    int size = 0;
    Object []arrayKeys = new Object[size];
    Object []arrayValues = new Object[size];

    public void set(TKey key, TValue value) {
        Object []newArrayKeys = new Object[size + 1];
        Object []newArrayValues = new Object[size + 1];
        for (int i = 0; i < size; i++){
            if (i < size - 1){
                newArrayKeys[i] = arrayKeys[i];
                newArrayValues[i] = arrayValues[i];
            } else if (i == size - 1) {
                newArrayKeys[i] = key;
                newArrayValues[i] = value;
            }
        }
        arrayKeys = newArrayKeys;
        arrayValues = newArrayValues;
        size += 1;
    }

    public TValue get (TKey key) {
        for (int i = 0; i < size; i++) {
            if (arrayKeys[i].equals(key)) {
                return (TValue) arrayValues[i];
            }
        }
        return null;
    }
    public int length() {
        return size;
    }
}