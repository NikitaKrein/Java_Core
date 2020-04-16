package task_2;


import java.util.Objects;

public class DynamicArray<T> {
    private T[] array;

    private static int length = 0;
    private static int standing = 0;

    public DynamicArray(int num) {
        this.array = (T[]) new Object[num];
        length = num;
    }


    public void add(T value) {
        if (standing >= length) {
            resize(length + 1);
        }
        array[standing] = value;
        standing++;
    }

    public T get(int index) {
        if (index < 0 && index >= length)
            throw new ArrayIndexOutOfBoundsException("Index not found");
        return array[index];
    }

    public void remove(int index) {
        if (index < 0 && index >= length)
            throw new ArrayIndexOutOfBoundsException("Index not found");
        for (int i = index; i < length - 1; i++) {
            array[i] = array[i + 1];
        }
        resize(length - 1);
    }

    public void resize(int newNum) {
        T[] newaArray = (T[]) new Object[newNum];
        if (newNum < length) {
            standing = length = newNum;
        }
        for (int i = 0; i < length; i++) {
            newaArray[i] = array[i];
        }
        standing = length;
        length = newNum;
        array = newaArray;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < standing; i++) {
            s += array[i].toString() + " ";
        }
        return s;
    }
}
