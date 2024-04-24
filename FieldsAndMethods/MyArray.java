package FieldsAndMethods;

public class MyArray {
    private String[] array;
    private int size;
    private int capacity;

    public MyArray(int capacity) {
        this.array = new String[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public int length() {
        return size;
    }

    public void put(String str) {
        if (size == capacity) {
            capacity *= 2;
            String[] newArray = new String[capacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size++] = str;
    }

    public String get() {
        if (size == 0) {
            return null;
        }
        String result = array[0];
        System.arraycopy(array, 1, array, 0, size - 1);
        size--;
        return result;
    }
}
