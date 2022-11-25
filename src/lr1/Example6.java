package lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input firstname: ");
        String firstname = in.nextLine();

        System.out.println("Input lastname: ");
        String lastname = in.nextLine();

        System.out.println("Input middle name: ");
        String middlename = in.nextLine();

        System.out.println("firstname: " + firstname);
        System.out.println("lastname: " + lastname);
        System.out.println("middle name: " + middlename);
        in.close();

    }

}
