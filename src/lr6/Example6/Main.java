//Напишите программу со статическим методом, которому аргументом передается
//        целочисленный массив и целое число. Результатом метод возвращает ссылку на новый
//        массив, который получается из исходного массива (переданного первым аргументом
//        методу), если в нем взять несколько начальных элементов. Количество элементов, которые
//        нужно взять из исходного массива, определяются вторым аргументом метода. Если второй
//        аргумент метода больше длины массива, переданного первым аргументом, то методом
//        создается копия исходного массива и возвращается ссылка на эту копию.

package lr6.Example6;

public class Main {
    public static void main(String[] args) {
        int[] inArray = {-9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,};
        System.out.println("Второй аргумент метода меньше длины массива");
        Example6 myexample = new Example6();
        for (int i = 0; i < myexample.SetArray(inArray, 10).length; i++) {
            System.out.println("outArray[" + i + "] = " + myexample.SetArray(inArray, 10)[i]);
        }
        System.out.println("Второй аргумент метода больше длины массива");
        Example6.SetArray(inArray, 25);
        Example6.viewArray();
    }


    protected static class Example6 {
        private static int outArray[];         //статический метод, которому аргументом передается целочисленный массив и целое число.
        private static int[] SetArray(int inArray[], int count) {

            if (count > inArray.length) {
                count = inArray.length;
            }
            outArray = new int[count];
            for (int i = 0; i < count; i++) {
                outArray[i] = inArray[i];
            }
            return outArray;                  //метод возвращает ссылку на новый массив
        }

        private static void viewArray()
        {
            for (int i = 0; i < Example6.outArray.length; i++) {
                System.out.println("outArray[" + i + "] = " + outArray[i]);
            }
        }
    }
}