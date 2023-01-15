package lr7.example2;

/*
Напишите программу, в которой есть суперкласс с приватным текстовым полем.
В базовом классе должен быть метод для присваивания значения полю: без параметров и с одним текстовым параметром.
Объект суперкласса создается передачей одного текстового аргумента конструктору.
Доступное только для чтения свойство результатом возвращает длину текстовой строки.
На основе суперкласса создается подкласс.
В подклассе появляется дополнительное открытое целочисленное поле.
В классе должны быть такие версии метода для присваивания значений полям
(используется переопределение и перегрузка метода из суперкласса): без параметров, с текстовым параметром, с целочисленным параметром, с текстовым и целочисленным параметром. У конструктора подкласса два параметра (целочисленный и текстовый).
 */


public class main {
    public static void main(String[] args) {
        superClassTest myex0 = new superClassTest();
        String superClassTest0 = myex0.toString();
        System.out.println(superClassTest0);

        superClassTest myex1 = new superClassTest("Тест 1");
        String superClassTest1 = myex1.toString();
        System.out.println(superClassTest1);

        superClassTest myex2 = new subClassTest();
        String subClassTest0 = myex2.toString();
        System.out.println(subClassTest0);

        superClassTest myex3 = new subClassTest("Тест 2");
        String subClassTest1 = myex3.toString();
        System.out.println(subClassTest1);

        superClassTest myex4 = new subClassTest(256);
        String subClassTest2 = myex4.toString();
        System.out.println(subClassTest2);

        superClassTest myex5 = new subClassTest("Тест 3", 256);
        String subClassTest3 = myex5.toString();
        System.out.println(subClassTest3);
    }
}