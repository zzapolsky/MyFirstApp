package lr5.Example4;

class Task1{

    private char ch1;
    private int int1;

    Task1(int i, char c){
        ch1 = c;
        int1 = i;
        int length = (int) (Math.log10(int1) + 1);
        double result = (double)ch1 + (double)int1*1/Math.pow(10, length);
        System.out.println("result1 = "+result+"; ch = "+(double)ch1+ "; int = "+length);
    }

    Task1(double d){

        char ch1 = (char)d;

        int1 = (int)((d -(int)d)*100);
        System.out.println("ch = "+ch1+"; int = "+int1);
    }
}