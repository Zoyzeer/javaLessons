public class array_and_string {
    public static void main(String[] args){

        // Створення рядка "Hello world!"
        String str = "Hello world!";
        
        // Виведення першого символу
        System.out.println("Перший символ: " + str.charAt(0));
        
        // Виведення останнього символу
        System.out.println("Останній символ: " + str.charAt(str.length() - 1));
        
        // Створення масиву символів із слова "world"
        char[] chars = "world".toCharArray();
        
        // Виведення масиву у консоль
        System.out.println("Масив символів:");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();
        
        // Виведення передостаннього елемента масиву, не використовуючи прямий доступ за індексом
        System.out.println("Передостанній елемент масиву: " + chars[chars.length - 2]);


        System.out.println("------------------------------------------");


        int a = 5;
        int b = 10;

        // Змінюємо значення змінних за допомогою інкременту та декременту
        a++; 
        --b; 

        System.out.println("a після постінкременту: " + a);
        System.out.println("b після преінкременту: " + b);

        // Різниця між ++a та a++:
        int x = 3;
        int y = 3;

        int preIncrementResult = ++x; 
        int postIncrementResult = y++; 

        System.out.println("Значення змінної x після преінкременту: " + x); // x збільшиться до 4
        System.out.println("Значення змінної y після постінкременту: " + y); // y також збільшиться до 4

        System.out.println("Результат преінкременту: " + preIncrementResult); // Результат преінкременту: 4
        System.out.println("Результат постінкременту: " + postIncrementResult); // Результат постінкременту: 3


    }
}
