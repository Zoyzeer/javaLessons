package lesson_eight_second;

public class lesson_eight2 {
    
    @FunctionalInterface
    interface Pow {
        int pow (int number, int pow);
    }

    public class Main{    
        public static void main(String[] args) {
            //реализация интерфейса Pow через лямбду
            Pow powerFunction = (number, pow) -> {
                int result = 1;
                for (int i = 0; i < pow; i++) {
                    result *= number;
                }
                return result;
            };

            int number = 2; //возводящее число
            int exponent = 3; //степень
            int result = powerFunction.pow(number, exponent);

            System.out.println(number + " в степени " + exponent + " = " + result); //результат
        }
    }
}
