//Напишите программу со статическим методом, аргументом которому передается
//        произвольное количество целочисленных аргументов. Результатом метод возвращает
//        массив из двух элементов: это значения наибольшего и наименьшего значений среди
//        аргументов, переданных методу.

package lr6.Example10;

public class Main {
    public static void main(String[] args) {
        Example10 myexample1 = new Example10();
        Example10 myexample2 = new Example10();
        myexample1.calcMaxMin(3,2,-4,100,23,-50);
        myexample1.viewMaxMin();
        Example10.calcMaxMin(3,0,100,-50,33,-5,6,17);
        Example10.viewMaxMin();
        myexample2.calcMaxMin(3,0,100,-2,33,-50,6,17);
        myexample2.viewMaxMin();
    }
    protected static class Example10{
        private static int[] MaxMin;
        private static int[] calcMaxMin(int ... array){
            int max = array[0];
            int min = array[0];
            for (int i =0; i<array.length; i++) {
                max = Math.max(max, array[i]);
                min = Math.min(min, array[i]);
            }
            MaxMin= new int[]{max, min};
            return MaxMin;
        }
        private static void viewMaxMin() {
            System.out.println("\nMaxMin[Max] = " + MaxMin[0]);
            System.out.println("MaxMin[Min] = " + MaxMin[1]);
        }
    }
}