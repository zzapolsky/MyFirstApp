package lr5.Example5;

public class Main {
    public static void main(String[] args) {

        Task1 mytask = new Task1(21);
        System.out.println("Число = "+mytask.PrintInt());


        mytask.Set(15);
        System.out.println("Число = "+mytask.PrintInt());


        mytask.Set(125);
        System.out.println("Число = "+mytask.PrintInt());


        mytask.Set(-15);
        System.out.println("Число = "+mytask.PrintInt());


        mytask.Set();
        System.out.println("Число = "+mytask.PrintInt());
    }
}