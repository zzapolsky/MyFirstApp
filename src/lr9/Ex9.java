package lr9;

public class Ex9 {
    public static int n() {
        try {
            System.out.println("0");
            return 55;                                               // выход из метода
        } finally {
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        System.out.println(n());
    }
}
