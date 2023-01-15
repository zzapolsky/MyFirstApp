package lr7.example3;


public class main {
    public static void main(String[] args) {
        subClassOne superClassTest = new subClassOne(111);
        String className1 = superClassTest.toString();
        System.out.println(className1);

        subClassTwo FirstSubClassTest = new subClassTwo(222,'A');
        String className2 = FirstSubClassTest.toString();
        System.out.println(className2);

        subClassThree SecondSubClassTest = new subClassThree(333,'B',"hello");
        String className3 = SecondSubClassTest.toString();
        System.out.println(className3);
    }
}