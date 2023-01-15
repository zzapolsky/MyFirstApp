package lr7.example5;

public class main {
    public static void main(String[] args) {
        FirstSubClass2 SuperClassTest1 = new FirstSubClass2("Тест");
        SuperClassTest1.PrintToString();

        FirstSubClass SubClassTest1 = new FirstSubClass("Тест 2", 222);
        SubClassTest1.PrintToString();

        SecondSubClass SubClassTest2 = new SecondSubClass("Тест 3", 'A');
        SubClassTest2.PrintToString();

        FirstSubClass2 SuperClassTest2 = new FirstSubClass2(SubClassTest1.getStr1());
        SuperClassTest2.PrintToString();

        FirstSubClass2 SuperClassTest3 = new FirstSubClass2(SubClassTest2.str1);
        SuperClassTest3.PrintToString();
    }
}