package Timus.task1023;

import java.util.Scanner;

public class task1023 {


    public static void main(String[] args) {

        long i = 3;
        long a;


        Scanner sc = new Scanner(System.in);
        a = sc.nextLong();
        while (a % i != 0) {
            i++;
        }

        System.out.println(i - 1);
    }
}