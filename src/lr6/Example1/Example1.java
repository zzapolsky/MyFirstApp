package lr6.Example1;

class Example1 {
    //два поля: символьное и текстовое.
    private char ch;
    private String str;


    public void SetField(char c) {
        ch = c;
        System.out.print("\n Вызов метода SetField c аргументом char. ch =" + ch);
    }


    public void SetField(String s) {
        str = s;
        System.out.print("\n Вызов метода SetField c аргументом string. str =" + str);
    }

    public void SetField(char[] CharArray) {
        if (CharArray.length == 1) {
            ch = CharArray[0];
            System.out.print("\n Вызов метода SetField c массивом char. ch =" + ch);
        } else {
            str = new String(CharArray);
            System.out.print("\n Вызов метода SetField c массивом string. str =" + str);
        }
    }


}
