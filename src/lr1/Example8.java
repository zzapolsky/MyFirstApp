package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите номер дня недели: ");
        int day = in.nextInt();

        System.out.println("Введите номер месяца: ");
        int month = in.nextInt();

        System.out.println("Введите число: ");
        int date = in.nextInt();
        if (date>31) System.out.println("Неверное число" );
        else System.out.print(date);

        if (month == 1) System.out.print(" января,");
        else if (month == 2) System.out.print(" февраля,");
        else if (month == 3) System.out.print(" марта,");
        else if (month == 4) System.out.print(" апреля,");
        else if (month == 5) System.out.print(" мая,");
        else if (month == 6) System.out.print(" июня,");
        else if (month == 7) System.out.print(" июля,");
        else if (month == 8) System.out.print(" августа,");
        else if (month == 9) System.out.print(" сентября,");
        else if (month == 10) System.out.print(" октября,");
        else if (month == 11) System.out.print(" ноября,");
        else if (month == 12) System.out.print(" декабря,");
        else System.out.println("Неверный формат месяца");

        if (day == 1) System.out.print(" понедельник");
        else if (day == 2) System.out.print(" вторник");
        else if (day == 3) System.out.print(" среда");
        else if (day == 4) System.out.print(" четверг");
        else if (day == 5) System.out.print(" пятница");
        else if (day == 6) System.out.print(" суббота");
        else if (day == 7) System.out.print(" воскресенье");
        else System.out.println("Неверный формат дня недели");

        in.close();
    }
}