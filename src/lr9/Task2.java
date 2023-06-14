package lr9;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        try{
            System.out.println("Введите колличество строк массива: ");
            int lines = in.nextInt();//Число строк
            System.out.println("Введите колличество столбцов массива: ");
            int colons = in.nextInt();//Число столбцов
            int[][] matrix = new int[lines][colons];
            for(int i = 0; i < lines; i++){//Заполняю матрицу
                for(int k = 0; k < colons; k++){
                    matrix[i][k] = (int)(Math.random()*100);
                }
            }

            for(int i = 0; i < lines; i++){//Вывожу матрицу, заполненную случайными числами, в консоль
                for(int k = 0; k < colons; k++){
                    System.out.print(matrix[i][k] + " ");
                }
                System.out.print("\n");
            }

            System.out.println("Введите номер столбца для его вывода: ");
            int numOfColon = in.nextInt() - 1;

            for(int i = 0; i < lines; i++){
                System.out.print(matrix[i][numOfColon] + "\n");
            }

        }catch (NumberFormatException n){
            System.out.println("Ошибка! Неверный формат данных");
        }catch(NegativeArraySizeException a){
            System.out.println("Ошибка! Строка или столбец не могут быть отрицательными!");
        }catch (ArrayIndexOutOfBoundsException i){
            System.out.println("Ошибка! Нет такого столбца!");
        }catch (OutOfMemoryError o) {
            System.out.println("Ошибочка!");
        }catch (InputMismatchException i){
            System.out.println("Ошибка! Значание не верного формата или не входит в диапазон!");
        }
    }
}
//        В программе, где требуется из матрицы вывести столбец с номером,
//        заданным с клавиатуры, могут возникать ошибки в следующих случаях:
//        –	ввод строки вместо числа;
//        –	нет столбца с таким номером.