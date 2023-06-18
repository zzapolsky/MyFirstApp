package lr11.example6.arrayList.remove;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveToTheEnd {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 7000000; i++) {
            arrayList.add(i);
        }

        System.out.println("Время выполнения операции удаления arrayList = " + getRunningTime(arrayList));
    }

    private static long getRunningTime(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1; i++) {
            list.remove(6999999);
        }
        long end = System.currentTimeMillis();

        return end - start;

    }
}