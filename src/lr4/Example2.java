package lr4;

public class Example2 {
    public static void main(String[] args) {
        int height = 10;
        int i ;
        int j ;
        int a=0;
        for (i = 1 ; i <= height; i++){
            System.out.print("номер строки: " + i + " ");
            for (j = 0; j <=a; j++){
                System.out.print("0");
            }
            a++;
            System.out.println(" Количество символов в строке " + a);
        }
    }
}
// Напишите программу, которая выводит в консольное окно
//   прямоугольный треугольник;