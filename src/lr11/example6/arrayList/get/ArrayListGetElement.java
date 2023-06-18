package lr11.example6.arrayList.get;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGetElement {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 70000000; i++) {
            arrayList.add(i);
        }
        System.out.println("Время выполнения операции получения arrayList = " + getRunningTime(arrayList));

    }

    private static long getRunningTime(List<Integer> list){
        long start = System.currentTimeMillis();

        System.out.println(list.get(69999999));
        long end = System.currentTimeMillis();

        return end - start;

    }
}