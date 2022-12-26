package lr5.Example6;

 class Task1 {

        //два закрытых целочисленных поля (max и min).
        private int min;
        private int max;
        //Значения полям присваиваются с помощью открытого метода.
        public void SetInt(int num1, int num2){
            //сравниваются текущие значения полей и значения аргументов, переданных методу.
            //  Самое большое из значений присваивается полю max, а самое маленькое из значений присваивается полю min.
            System.out.println("Метод SetInt() c 2-я аргументами");
            min = Math.min(num1, num2);
            max = Math.max(num1, num2);
        }

        public void SetInt(int num){
            //сравниваются текущие значения полей и значения аргументов, переданных методу.
            //  Самое большое из значений присваивается полю max, а самое маленькое из значений присваивается полю min.
            System.out.println("Метод SetInt() c 1-м аргументом");
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        //метод, отображающий в консольном окне значения полей объекта.
        void PrintInt() {
            System.out.println("Min = "+min);
            System.out.println("Max = "+max);
        }
        //конструктор, который работает по тому же принципу, что и метод для присваивания значений полям
        Task1(int num1, int num2){
            System.out.println("Конструктор Task1() c 2-я аргументами");
            min = Math.min(num1, num2);
            max = Math.max(num1, num2);
        }
        //конструктор, который работает по тому же принципу, что и метод для присваивания значений полям
        Task1(int num){
            System.out.println("Конструктор Task1() c 1-м аргументом");
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

    }

