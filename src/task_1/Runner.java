package task_1;

import org.w3c.dom.ls.LSOutput;

public class Runner {
    public static void main(String[] args) {
        DynamicDoubleArray dynamicDoubleArray = new DynamicDoubleArray(7);
        dynamicDoubleArray.add(7);
        dynamicDoubleArray.add(1);
        dynamicDoubleArray.add(2);
        dynamicDoubleArray.add(3);
        dynamicDoubleArray.add(4);
        dynamicDoubleArray.add(99);
        dynamicDoubleArray.add(567);
        dynamicDoubleArray.add(724);
        System.out.println(dynamicDoubleArray);
        System.out.println(dynamicDoubleArray.get(2));
        dynamicDoubleArray.remove(2);
        dynamicDoubleArray.remove(0);
        System.out.println(dynamicDoubleArray);
        dynamicDoubleArray.resize(3);
        System.out.println(dynamicDoubleArray);
        dynamicDoubleArray.resize(22);
        System.out.println(dynamicDoubleArray);
        dynamicDoubleArray.add(2);
        System.out.println(dynamicDoubleArray);
    }
}
