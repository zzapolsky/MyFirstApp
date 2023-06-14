package lr9;

public class Ex5 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {//Не может перехватить исключение, поскольку является предком RuntimeException
            System.out.println("1");
        }
        System.out.println("2");
    }
}
