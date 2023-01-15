package lr7.example4;

/*
в каждом из классов должен быть конструктор,
позволяющий создавать объект на основе значений полей,
переданных аргументами конструктору,
а также конструктор создания копии.
 */

//на основе суперкласса создается подкласс
public class subClassTwo extends subClassOne {
    subClassTwo(char char1) {
        super(char1);
    }
    //Во втором классе появляется открытое текстовое поле
    public String str1;

    public void setChar1Str1(char char1, String str1) {
        super.char1 = char1;
        this.str1 = str1;
    }
    //original конструктор
    subClassTwo(char char1, String str1) {
        super(char1);
        this.setChar1Str1(char1, str1);
    }
    //конструктор копии
    subClassTwo(subClassTwo copy) {
        super(copy.char1);
        this.setChar1Str1(copy.char1, copy.str1);
    }

    @Override
    public String toString() {
        String SecondFieldValue =
                "\n str 1 = " + this.getStr1();
        return super.toString()+SecondFieldValue;
    }
    public String getStr1() {
        return str1;
    }
}