package task_1;

public class DynamicDoubleArray {
    private double[] array;

    private static int length = 0;
    private static int standing = 0;

    public DynamicDoubleArray(int num) {
        array = new double[num];
        length = num;
    }


    public void add(double value) {
        if (standing >= length) {
            resize(length + 1);
        }
        array[standing] = value;
        standing++;
    }

    public double get(int index) {
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
        double[] newaArray = new double[newNum];
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
            s += array[i] + " ";
        }
        return s;
    }
}
