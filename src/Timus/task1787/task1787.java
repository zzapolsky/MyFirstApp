package Timus.task1787;

import java.util.Scanner;

public class task1787 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int left =0;

        for(int i=0; i< b; i++) {
            int c = in.nextInt();
            left = left + c - a;
            if(left < 0){
                left =0;
            }
        }
        System.out.println(left);
    }
}
