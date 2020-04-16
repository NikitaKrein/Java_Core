package task_2;

public class Runner {
    public static void main(String[] args) {
        DynamicArray<Integer> a = new DynamicArray<Integer>(3);
        a.add(7);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(99);
        a.add(567);
        a.add(724);
        System.out.println(a);
        System.out.println(a.get(2));
        a.remove(2);
        a.remove(0);
        System.out.println(a);
        a.resize(3);
        System.out.println(a);
        a.resize(22);
        System.out.println(a);
        a.add(2);
        System.out.println(a);
    }
}
