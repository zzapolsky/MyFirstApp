package lr9;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите массив чисел через пробел, для нахождения среднего значения.");
        String[] nums = in.nextLine().split(" ");//Создаю строковый массив
        Integer[] arrayOfNums = new Integer[nums.length];//Создаю целочисленный массив
        try{
            for(int i = 0; i < nums.length; i++){//преобразую строковый массив в целочисленный
                arrayOfNums[i] = Integer.parseInt(nums[i]);
            }
            int symmInts = 0;//Сумма всех положительных чисел
            int count = 0;//Число положительных чисел
            for(int i = 0; i < arrayOfNums.length; i++){//Суммирую положительные числа и узнаю их колличество
                if(arrayOfNums[i] > 0){
                    symmInts += arrayOfNums[i];
                    count++;
                }
            }
            int mediumNums = symmInts/count;//Вычисляю среднее значение
            System.out.println("Среднее значение чисел массива = " + mediumNums);
        }catch(NumberFormatException n){
            System.out.println("Ошибка! Либо введены не числа, либо числовой тип данных не соответствует!");
        }catch (ArithmeticException a){
            System.out.println("Ошибка! В массиве отсутствуют положитнльные эллементы!");
        }
    }
}
//    В программе, вычисляющей среднее значение среди положительных элементов
//    одномерного массива (тип элементов int), вводимого с клавиатуры, могут
//    возникать ошибки в следующих случаях:
//        –	ввод строки вместо числа;
//        –	несоответствие числового типа данных;
//        –	положительные элементы отсутствуют.