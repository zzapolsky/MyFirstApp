package lr5.Example6;

 class Task1 {


        private int min;
        private int max;

        public void SetInt(int num1, int num2){

            System.out.println("Метод SetInt() c 2-я аргументами");
            min = Math.min(num1, num2);
            max = Math.max(num1, num2);
        }

        public void SetInt(int num){

            System.out.println("Метод SetInt() c 1-м аргументом");
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        void PrintInt() {
            System.out.println("Min = "+min);
            System.out.println("Max = "+max);
        }

        Task1(int num1, int num2){
            System.out.println("Конструктор Task1() c 2-я аргументами");
            min = Math.min(num1, num2);
            max = Math.max(num1, num2);
        }

        Task1(int num){
            System.out.println("Конструктор Task1() c 1-м аргументом");
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

    }

