package Timus.task1877;

import java.util.Scanner;

public class task1877 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c1 = in.nextInt();
        int c2 = in.nextInt();
        if (c1 % 2 == 0 || c2 % 2 != 0) {
            System.out.println("yes"); // ответ должен быть строго как в дано, "Yes" дает Wrong Answer
        } else {
            System.out.println("no");
        }
    }
}
