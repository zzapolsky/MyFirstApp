//Напишите программу с классом, в котором есть статические методы, которым
  //      можно передавать произвольное количество целочисленных аргументов (или
    //    целочисленный массив). Методы, на основании переданных аргументов или массива,
      //  позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее
        //значение из набора чисел.

        package lr6.Example3;

public class Main {
    private static class Example2{

        private static void calcMax(int ... array){
            int max = array[0];
            for (int i =0; i<array.length; i++) {
                max = Math.max(max, array[i]);
            }
            System.out.println("Наибольшее значение[] = "+max);
        }

        private static void calcMin(int ... array){
            int min = array[0];
            for (int i =0; i<array.length; i++) {
                min = Math.min(min, array[i]);
            }
            System.out.println("Наименьшее значение[] = "+min);
        }

        private static void calcAvg(int ... array){
            int sum = 0;
            for (int i =0; i<array.length; i++) {
                sum = array[i]+sum;
            }
            double avg = (double)sum/array.length;
            System.out.println("Среднее значение[] = "+avg);
        }
    }
    public static void main(String[] args) {
        Example2.calcMin(5,0,800,-100,43,5,6,25);     //-100
        Example2.calcMax(1,54,-11,2,35,100);         //100
        Example2.calcAvg(156,58,56,-2,23,-6,2,113); //50
    }
}