package lr7.example2;

/*
На основе суперкласса создается подкласс.
В подклассе появляется дополнительное открытое целочисленное поле.
В классе должны быть такие версии метода для присваивания значений полям (используется переопределение и перегрузка метода из суперкласса):
без параметров,
с текстовым параметром,
с целочисленным параметром,
с текстовым и целочисленным параметром.
У конструктора подкласса два параметра (целочисленный и текстовый).
 */



public class subClassTest extends superClassTest {
    private String str2;

    public int int1;


    subClassTest() {setStr1();}

    subClassTest(String str2) {setStr1(str2);}

    subClassTest(int int1) {setStr1(); this.setInt1(int1);}

    subClassTest(String str2, int int1) {setStr1(str2); this.setInt1(int1);}

    public void setInt1(int int1) {
        this.int1 = int1;
    }
    public void setStr1 (){
        this.str2 = "пусто";
    }

    public void setStr1 (String str2){
        this.str2 = str2;
    }

    public int getInt1(){
        return int1;
    }

    public String getStr1(){
        return str2;
    }

    public int getStr1length(){
        return str2.length();
    }

    @Override
    public String toString() {
        String ClassNameAndFieldValue = "subClassTest{" + "str2=\"" + getStr1() + '\"' + " string.length = " +"\""+getStr1length()+"\"}"
                +"\nsubClassTest{" + "int1=\"" + getInt1() + "\"}";
        return ClassNameAndFieldValue;
    }

}