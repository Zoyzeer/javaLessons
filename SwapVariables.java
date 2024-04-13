public class SwapVariables {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        // Виводимо початкові значення a та b
        System.out.println("Початкові значення:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b; // a = 1 + 2 = 3
        b = a - b; // b = 3 - 2 = 1
        a = a - b; // a = 3 - 1 = 2

        // Виводимо кінцеві значення a та b
        System.out.println("Кінцеві значення:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Третя частина дз
        // a = a + b; // a стає 8 (5 + 3)
        // b = a - b; // b стає 5 (8 - 3)
        // a = a - b; // a стає 3 (8 - 5)

    }
}