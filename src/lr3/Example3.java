package lr3;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввведите количество чисел Фибоначчи\n");
        int a = in.nextInt();

        Fib.WhileFib(a);
        Fib.ForFib(a);
    }

    static class Fib {
        static void WhileFib(int a) {
            System.out.println("\n\nверсия программы c оператором \"while\"");
            int i = a;
            long k = 0;
            long l = 1;
            long m = 1;
            while (i > 0) {
                System.out.printf("%d, ", m);
                m = k + l;
                k = l;
                l = m;
                i--;
            }
        }

        static void ForFib(int a) {
            System.out.println("\n\nверсия программы с оператором \"for\"");
            long k = 0;
            long l = 1;
            long m = 1;
            for (int a1 = a; a1 > 0; --a1) {
                System.out.printf("%d, ", m);
                m = k + l;
                k = l;
                l = m;
            }
        }
    }
}