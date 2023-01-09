//Напишите программу со статическим методом, аргументом которому передается
//        целочисленный массив, а результатом возвращается среднее значение для элементов
//        массива (сумма значений элементов, деленная на количество элементов в массиве).

package lr6.Example8;

import java.math.RoundingMode;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random(500);
        int ArrayLength = 11;
        int intArray[] = new int[ArrayLength];
        for (int i = 0 ; i <ArrayLength; i++){
            intArray[i] = random.nextInt(500);
            System.out.println("intArray["+i+"] = "+intArray[i]);
        }

        System.out.println("Среднее значение intArray["+ArrayLength+"] = "+Example8.ArrayAvg(intArray));
    }
    protected static class Example8{
        private static double ArrayAvg (int Array[]){
            int sum=0;
            for (int i = 0 ; i <Array.length; i++){
                sum += Array[i];
            }
            double result = (double)sum/Array.length;
          //  result = (2, RoundingMode.HALF_UP);
            return result;
        }
    }
}