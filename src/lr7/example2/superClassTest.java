package lr7.example2;

/*
суперкласс с приватным текстовым полем.
В базовом классе должен быть метод для присваивания значения полю:
без параметров и с одним текстовым параметром.
Объект суперкласса создается передачей одного текстового аргумента конструктору.
Доступное только для чтения свойство результатом возвращает длину текстовой строки.
 */

public class superClassTest {

    private String str1;

    superClassTest() {setStr1();}

    superClassTest (String str1){setStr1(str1);}

    public void setStr1 (){
        this.str1 = "пусто";
    }

    public void setStr1 (String str1){
        this.str1 = str1;
    }

    public String getStr1(){
        return str1;
    }

    public int getStr1length(){
        return str1.length();
    }


    @Override
    public String toString() {
        String superClassNameAndFieldValue = "superClassTest{" + "str1=\"" + getStr1() + '\"' + " string.length = " +"\""+getStr1length()+"\"}";
        return superClassNameAndFieldValue;
    }
}