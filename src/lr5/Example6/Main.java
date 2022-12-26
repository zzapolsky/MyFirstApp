package lr5.Example6;

public class Main {


        public static void main(String[] args) {
                                //конструктор с 2-я аргументами
            Task1 mytask = new Task1(2,5);
            mytask.PrintInt();
                                //конструктор с 1-м аргументом
            mytask = new Task1(1);
            mytask.PrintInt();
                                //метод с 2-я аргументами
            mytask.SetInt(3,15);
            mytask.PrintInt();
                                //метод с 1-м аргументом
            mytask.SetInt(-9);
            mytask.PrintInt();
        }
    }

