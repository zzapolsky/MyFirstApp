package lr5.Example3;

class Task1 {

    private int num1;
    private int num2;


    Task1(){
        System.out.println("Koнcтpyиpoвaниe объекта test task1(1)");
    }

    Task1(int num1){
        System.out.println("Koнcтpyиpoвaниe объекта task1(2)");
        this.num1 = num1;
        System.out.println("num1^num1 = "+exponentOwnPow (num1));
    }
    public int exponentOwnPow (int num1) {
        this.num1 = num1;
        int result=1;
        for (int i=1; i <= num1;i++) {
            result = num1*result;
        }
        return result;
    }

    Task1(int num1, int num2){
        System.out.println("Koнcтpyиpoвaниe объекта task1(3)");
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("num1^num2 = "+exponentPow (num1,num2));
    }
    public int exponentPow(int n1, int n2){
        n1 = num1;
        n2 = num2;
        int result=1;
        for (int i=1; i <= num2;i++) {
            result = num1*result;
        }
        return result;
    }

}
