package lr11.example6.linkedList.get;

import java.util.LinkedList;
import java.util.List;

public class LinkedListGetElement {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 70000000; i++) {
            linkedList.add(i);
        }
        System.out.println("Время выполнения операции получения linkedList = " + getRunningTime(linkedList));

    }

    private static long getRunningTime(List<Integer> list){
        long start = System.currentTimeMillis();

        System.out.println(list.get(69999999));
        long end = System.currentTimeMillis();

        return end - start;

    }
}