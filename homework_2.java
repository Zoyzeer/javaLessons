public class homework_2 {
    public static void main(String[] args) {

        int x = 3;
        int y = 4;

        System.out.println(x + y); // Виводить суму x і y (7)
        System.out.println("" + x + y); // Виводить значення x і y поспіль (34)

        // Друга частина
        int decimalNumber1 = 101;
        int decimalNumber2 = 11;
        int decimalNumber3 = 111;

        int binaryNumber1 = 2;
        int binaryNumber2 = 23;
        int binaryNumber3 = 15;

        String binary1 = Integer.toBinaryString(binaryNumber1);
        String binary2 = Integer.toBinaryString(binaryNumber2);
        String binary3 = Integer.toBinaryString(binaryNumber3);

        System.out.println("Десяткові числа:");
        System.out.println(decimalNumber1);
        System.out.println(decimalNumber2);
        System.out.println(decimalNumber3);

        System.out.println("Двійкові числа:");
        System.out.println(binary1);
        System.out.println(binary2);
        System.out.println(binary3);

        //Третя частина
        //int i = 5;
        //i = i + +;  ПОМИЛКА
        //System.out.println(i);
        //i = 5; ПОВИНЕН БУТИ int
        //i = i++ + i++;
        //System.out.println(i);  // RESULT: 11
        //i = 5; ПОВИНЕН БУТИ int
        //i = i++ + ++i;
        //System.out.println("i:  " + i); // RESULT: 12
        //i = 5; ПОВИНЕН БУТИ int
        //i = ++i + ++i;
        //System.out.println("i:  " + i); // RESULT: 13

    }
}
