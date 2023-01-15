package lr7.example4;



public class main {
    public static void main(String[] args) {
        //super Class test
        subClassOne superClassTest = new subClassOne('A');
        String className1 = superClassTest.toString();
        System.out.println(className1);
        //super Class copy test
        subClassOne superClassTestCopy = new subClassOne(superClassTest);
        String className1copy = superClassTestCopy.toString();
        System.out.println(className1copy);
        //1 subClass test
        subClassTwo FirstSubClassTest = new subClassTwo('A',"AAA");
        String className2 = FirstSubClassTest.toString();
        System.out.println(className2);
        //1 subClass copy test
        subClassTwo FirstSubClassTestCopy = new subClassTwo(FirstSubClassTest);
        String className2Copy = FirstSubClassTestCopy.toString();
        System.out.println(className2Copy);
        //2 subClass test
        subClassThree SecondSubClassTest = new subClassThree('A',"AAA",512);
        String className3 = SecondSubClassTest.toString();
        System.out.println(className3);
        //2 subClass copy test
        subClassThree SecondSubClassTestCopy = new subClassThree(SecondSubClassTest);
        String className3Copy = SecondSubClassTestCopy.toString();
        System.out.println(className3Copy);
    }
}