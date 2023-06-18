package lr13;

public class Example6 {
    public static void main(String[] args) throws InterruptedException {
        int[] arr = new int[]{5, 3, 1, 6, 4, 8, 6, 9};
        sum(arr);
    }

    private static final Object lock = new Object();

    public static void sum(int[] arr) {
        Thread thread1 = new Thread(() -> {
            int temp = 0;
            for (int i = 0; i < arr.length; i++) {
                temp += arr[i];
                System.out.println(Thread.currentThread().getName() + ": " + temp);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Error: " + e);
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            int temp = 0;
            for (int i = 0; i < arr.length; i++) {
                temp += arr[i];
                System.out.println(Thread.currentThread().getName() + ": " + temp);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Error: " + e);
                }
            }
        });
        Thread thread3 = new Thread(() -> {
            int temp = 0;
            for (int i = 0; i < arr.length; i++) {
                temp += arr[i];
                System.out.println(Thread.currentThread().getName() + ": " + temp);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Error: " + e);
                }
            }
        });
        Thread thread4 = new Thread(() -> {
            int temp = 0;
            for (int i = 0; i < arr.length; i++) {
                temp += arr[i];
                System.out.println(Thread.currentThread().getName() + ": " + temp);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Error: " + e);
                }
            }
        });
        Thread thread5 = new Thread(() -> {
            int temp = 0;
            for (int i = 0; i < arr.length; i++) {
                temp += arr[i];
                System.out.println(Thread.currentThread().getName() + ": " + temp);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Error: " + e);
                }
            }
        });
        Thread thread6 = new Thread(() -> {
            int temp = 0;
            for (int i = 0; i < arr.length; i++) {
                temp += arr[i];
                System.out.println(Thread.currentThread().getName() + ": " + temp);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Error: " + e);
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();

    }
}
/*

6. Напишите функцию, которая суммирует элементы в массиве целых чисел при помощи многопоточности.
Количество потоков должно быть равно количеству ядер процессора
 */