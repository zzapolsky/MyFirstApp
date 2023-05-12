package lr8;

import java.io.*;
import java.net.URL;

public class Example2 {
    public static void readAllByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read(); //читает 1 байт
            if (oneByte !=-1) {      //признак отсутствия конца файла
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        try {
            //с потоком связан файл
            InputStream inFile = new FileInputStream("e:file.txt"); //файл создан и заполнен данными
            readAllByByte(inFile);
            System.out.println("\n\n\n");
            inFile.close();

            //с потоком связана интернет-страница
            InputStream inUrl = new URL("http://google.com").openStream();
            readAllByByte(inUrl);
            System.out.println("\n\n\n");
            inUrl.close();

            //с потоком связан массив типа byte
            InputStream inArray = new ByteArrayInputStream(new byte[]{7,9,3,7,4});
            readAllByByte(inArray);
            System.out.println("\n\n\n");
            inArray.close();

        } catch (IOException e) {
            System.out.println("Ошибка: "+ e);
        }

    }

}
