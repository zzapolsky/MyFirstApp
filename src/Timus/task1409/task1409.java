package Timus.task1409;


import java.io.PrintWriter;
import java.util.Scanner;

public class task1409 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a + b - 1;

        int h = c - a;
        int l = c - b;
        out.println(h+ " " +l);
        out.flush();
    }
}
