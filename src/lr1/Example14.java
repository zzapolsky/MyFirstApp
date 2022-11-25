package lr1;
import java.util.Scanner;

public class Example14 {
        static int square(int a) {
                int result = a * a;
                return result;
        }


        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.println("Введите число для магии: ");
                int a = in.nextInt();
                int b = a - 1;
                int c = a + 1;
                int d = (a + b + c);
                int e = square(d);
                System.out.print(b);
                System.out.print(", " + a);
                System.out.print(", " + c);
                System.out.print(", " + e);


        }

}
