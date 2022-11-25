package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {

            System.out.println("Введите Ваше имя:");
            String name = in.nextLine();

            System.out.println("Введите Ваш год рождения:");
            int age = in.nextInt();

            LocalDate today = LocalDate.now();

            int year = today.getYear();

            int b = year - age;

            System.out.println("Вас зовут -  " + name);
            System.out.println("Ваш возраст - " + b);

        }
    }
}