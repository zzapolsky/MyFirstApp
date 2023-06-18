package lr11.example6.linkedList.add;


import java.util.LinkedList;
import java.util.List;

public class LinkedListAddingToTheMiddle {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 7000000; i++) {
            linkedList.add(i);
        }
        System.out.println("Время выполнения операции добавления linkedList = " + getRunningTime(linkedList));
    }

    private static long getRunningTime(List<Integer> list){
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1; i++) {
            list.add(3500000, i);
        }
        long end = System.currentTimeMillis();

        return end - start;

    }
}