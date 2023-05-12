package lr8;

import java.io.*;
import java.util.Arrays;

public class Example3_0 {
    public static void main(String[] args) throws IOException {
        char[] symbols = new char[]{'Б','В','Г','Д','Ж','З','К','Л','М','Н','П','Р','С','Т','Ф','Х','Ц','Ч','Ш','Щ','б','в','г','д','ж','з','к','л','м','н','п','р','с','т','ф','х','ц','ч','ш','щ'};
        File fileToRead = new File("Text.txt");
        File fileToWrite = new File("Result.txt");
        fileToWrite.createNewFile();
        if(fileToRead.exists()){
            BufferedReader in = null;
            BufferedWriter out = null;
            Integer countLines = 1;
            int countWords = 0;
            String bufferString = null;
            String text = null;
            try {
                in = new BufferedReader(new FileReader("Text.txt"));
                out = new BufferedWriter(new FileWriter("Result.txt"));
                while (true) {
                    countWords = 0;
                    bufferString = "Строка " + countLines.toString() + ": ";
                    text = in.readLine();
                    if(text == null){
                        break;
                    }
                    String[] arr = text.split(" ");
                    for(int i = 0; i < arr.length; i++){
                        char[] firstSym = arr[i].toCharArray();
                        for(int k = 0; k < symbols.length; k++){
                            if(firstSym[0] == symbols[k]){
                                bufferString = bufferString + " " + arr[i];
                                countWords++;
                                break;
                            }
                        }
                    }
                    out.write(bufferString + " " + countWords + " слов\n");
                    System.out.print(bufferString + " " + countWords + " слов\n");
                    countLines++;
                }
            }catch(IOException e ){
                System.out.printf("Ошибка!" + e);
            }finally {
                in.close();
                out.flush();
                out.close();
            }

        }else{
            System.out.printf("Ошибка! Файл не найден!");
            System.exit(1);
        }
    }
}
//Задание 3. Создать проект, позволяющий из одного текстового файла,
//        содержащего несколько строк (тип String) заранее подготовленного текста
//        на русском языке (Пушкин, Лермонтов или другой российсмки классик на
//        Ваш вкус), построчно переписать в другой текстовый файл слова
//        начинающиеся с согласных букв..
//        Требования:
//        – слова из предложения выделять методом split();
//        – в новом файле следует указать номер строки, в которой иско- мые
//        слова находились в исходном файле;
//        – для каждой строки указать количество выбранных слов.