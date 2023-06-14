package lr9;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите массив чисел через пробел: ");
        String[] stringOfNums = in.nextLine().split(" ");//Создаю массив String с числами
        Byte[] nums = new Byte[stringOfNums.length];
        try{
            for (int i = 0; i < stringOfNums.length; i++){//Преобразовываю массив String в массив Byte
                nums[i] = Byte.parseByte(stringOfNums[i]);
            }
            byte sum = 0;
            for(int i = 0; i < stringOfNums.length; i++){
                sum += nums[i];
            }
            System.out.println("Сумма чисел типа Byte равна: " + sum);
        }catch (NumberFormatException n){
            System.out.println("Ошибка! Неверный формат или числа выходят за диапазон Byte!");
        }


    }
}
//    В программе, вычисляющей сумму элементов типа byte одномерного
//    массива, вводимого с клавиатуры, могут возникать ошибки в следующих случаях:
//        –	ввод строки вместо числа;
//        –	ввод или вычисление значения за границами диапазона типа.