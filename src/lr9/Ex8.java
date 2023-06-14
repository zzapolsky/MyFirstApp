package lr9;

public class Ex8 {
    public static int m() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        }
        catch(RuntimeException e){               //Добавил перехват брошенного исключения, чтобы не было ошибки
            return 2;
        }
        finally {
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}
