package lr4;

import java.util.Scanner;

public class Example8 {
    private static class Caeser {
        static String encryptTxt;
        private static String encrypt(String enText, int key) //цикл для шифрования текста по ключу
        {
            char[] ArrayTxt = enText.toCharArray();
            int[] CharCode = new int[ArrayTxt.length];
            for (int i = 0; i < ArrayTxt.length; i++)
            {
                CharCode[i] = ArrayTxt[i];
                CharCode[i] = CharCode[i] + key;
            }
            for (int i = 0; i < ArrayTxt.length; i++)
            {
                ArrayTxt[i] = (char) CharCode[i];
            }
            encryptTxt = new String(ArrayTxt);
            return encryptTxt;
        }

        private static String decrypt(String enText, int key)//цикл для дешифровки текста по ключу
        {
            char[] ArrayText = enText.toCharArray();
            int[] CharCode = new int[ArrayText.length];
            for (int i = 0; i < ArrayText.length; i++)
            {
                CharCode[i] = ArrayText[i];
                CharCode[i] = CharCode[i] - key;
            }
            for (int i = 0; i < ArrayText.length; i++)
            {
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
//        введенный текст. Используете кодовую таблицу символов. При запуске
//        программы в консоль необходимо вывести сообщение: «Введите текст для
//        шифрования», после ввода текста, появляется сообщение: «Введите ключ».
//        После того как введены все данные, необходимо вывести преобразованную
//        строку с сообщением «Текст после преобразования : ». Далее необходимо
//        задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)»,
//        если пользователь вводит «y», тогда выполнить обратное преобразование.
//        Если пользователь вводит «n», того программа выводит сообщение «До
//        свидания!». Если пользователь вводит что-то другое, отличное от «y» или «n»,
//        то программа ему выводит сообщение: «Введите корректный ответ».