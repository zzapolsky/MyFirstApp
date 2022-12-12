package lr3;

public class Example8 {
    public static void main(String[] args) {
        int n = 10;
        char[] charArray = new char[n];
        char b = 'B';

        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = b;
            b += 1;
            if (b =='A'|b =='E'|b =='I'|b =='O'|b =='U'|b =='Y'){
                b += 1;
            }
            System.out.println(charArray[i] + "\t");
        }

        }
    }

