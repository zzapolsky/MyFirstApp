package Timus.task1820;

import java.util.Scanner;

public class task1820 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = 2;
        if(n<=k){ System.out.print(x);
        }else{

            if (n*2 % k == 0){
                System.out.print(n*2/k);
            }else{
                System.out.print(n*2/k+1);
            }
        }

    }
}

