package lr2;

import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для подсчета тысяч, но не более 10000: ");
        int a = in.nextInt();

        if (a>=10000) System.out.println("Число не удовлетворяет условиям");
        else {
            int b = a / 10;

            int c = b / 10;

            int d = c / 10;

            int e = d % 10;

            if (e == 0) System.out.println("Число меньше тысячи");
            else if (e == 1) System.out.println("Число " + a + " содержит "+ e + " тысячу");
            else if (e == 2) System.out.println("Число " + a + " содержит "+ e + " тысячи");
            else if (e == 3) System.out.println("Число " + a + " содержит "+ e + " тысячи");
            else if (e == 4) System.out.println("Число " + a + " содержит "+ e + " тысячи");
            else if (e == 5) System.out.println("Число " + a + " содержит "+ e + " тысяч");
            else if (e == 6) System.out.println("Число " + a + " содержит "+ e + " тысяч");
            else if (e == 7) System.out.println("Число " + a + " содержит "+ e + " тысяч");
            else if (e == 8) System.out.println("Число " + a + " содержит "+ e + " тысяч");
            else if (e == 9) System.out.println("Число " + a + " содержит "+ e + " тысяч");
        }

    }
}


//5. Напишите программу, которая проверяет, сколько тысяч во введенном
//        пользователем числе (определяется четвертая цифра справа в десятичном
//        представлении числа).