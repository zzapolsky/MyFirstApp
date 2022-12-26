package lr5.Example3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число 1");
        int int1 = in.nextInt();
        System.out.println("Введите число 2");
        int int2 = in.nextInt();
        Task1 mytask1 = new Task1();
        Task1 mytask2 = new Task1(int1);
        Task1 mytask3 = new Task1(int1,int2);
    }
}