package lr4;

import java.util.Scanner;

public class Example9 {
    private static class Caeser {
        static char alphabet[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',        //Английский алфавит для шифрования
                'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r','s',            //с 6 символами
                't', 'u', 'v', 'w', 'x', 'y', 'z', ' ', '.',',','!','?','-'};
        static String encryptTxt;
        private static String encrypt(String enText, int key) //шифрование текста по ключу с использованием алфавита
        {
            char[] ArrayText = enText.toCharArray();
            char[] CharCode = new char[ArrayText.length];
            for (int i = 0; i < ArrayText.length; i++) {
                for (int j = 0; j < alphabet.length; j++) {
                    if (ArrayText[i] == alphabet[j]) {
                        CharCode[i] = (char) Math.abs(alphabet[(j + key) % 32] );// 26 - количество букв в англ.алфавите
                    } else if (CharCode[i] == 0) {                              //+ 6 символов. Делим на 32,
                        CharCode[i] = '*';                                      //чтобы шаг всегда был в диапазоне до 32
                    }
                }

            }
            for (int i = 0; i < ArrayText.length; i++) {
                ArrayText[i] = CharCode[i];
            }
            encryptTxt = new String(ArrayText);
            return encryptTxt;

        }

        private static String decrypt(String enText, int key)   //дешифровка текста по ключу с использованием алфавита
        {
            char[] ArrayText = enText.toCharArray();
            int[] CharCode = new int[ArrayText.length];

            for (int i = 0; i < ArrayText.length; i++) {
                for (int j = 0; j < alphabet.length; j++) {
                    int offset =(j-key);                        //метод вычисления шага дешифровки при переносе
                    if (offset<0) {                             //шага через конец алфавита (А с шагом -3 например)
                        offset = 32 - Math.abs(j-key);
                    }

                    if (ArrayText[i] == alphabet[j]) {

                       CharCode[i]=(alphabet[offset % 32]);    // делим на 32, чтобы шаг всегда был в диапазоне до 32


                    } else if (CharCode[i] == '*') {
                        CharCode[i] = '*';
                    }
                }
            }
            for (int i = 0; i < ArrayText.length; i++) {
                ArrayText[i] = (char) CharCode[i];
            }
            encryptTxt = new String(ArrayText);
            return encryptTxt;
        }
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования: ");
        String txt = in.nextLine();

        System.out.println("Введите ключ: ");
        int key = in.nextInt();


        String encryptStr = Caeser.encrypt(txt, key);

        System.out.println("Текст после преобразования :" + "\"" + encryptStr + "\"");

        System.out.println("Выполнить обратное преобразование? (y/n)");
        boolean transform = false;
        while (!transform) {
            String reply = in.next();

            if (reply.toLowerCase().equals("y")) {
                String decryptStr = Caeser.decrypt(encryptStr, key);
                System.out.println(decryptStr);
                transform = true;
            }
            else if (reply.toLowerCase().equals("n")) {
                System.out.println("До свидания!");
                transform = true;
            }
            else {
                System.out.println("Введите корректный ответ: ");
                transform = false;
            }
        }
    }
}

//        Напишите программу «Шифр Цезаря», которая зашифровывает
//        введенный текст. Используйте собственный алфавит.