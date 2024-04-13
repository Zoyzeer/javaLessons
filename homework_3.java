public class homework_3 {
    public static void main(String[] args) {

        int[] nums = new int[] { 1, 2, 3, 5 };

        // Створюємо рядок для зберігання чисел з масиву
        StringBuilder sb = new StringBuilder();

        // Додаємо числа з масиву до рядка
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
            // Додаємо ";" між числами, за винятком останнього
            if (i < nums.length - 1) {
                sb.append(";");
            }
        }

        // Виводимо рядок з числами у консоль
        System.out.println(sb.toString());

        String phrase = "Мама мила раму";

        // Розділяємо рядок на підрядки (слова) за пробілом
        String[] words = phrase.split(" ");

        // Виводимо масив слів у консоль
        for (String word : words) {
            System.out.println(word);
        }

        String text = "Я хочу перенесення рядків.";

        // Заміна символів пробілу на символи перенесення рядків
        String replacedText = text.replace(" ", "\n");

        // Виведення результату у консоль
        System.out.println(replacedText);

        // Створення масиву із 10 цілих чисел
        int[] numbers = new int[10];

        // Ініціалізація масиву початковими значеннями
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1; // Встановлюємо початкові значення від 1 до 10
        }

        // Виведення початкового масиву
        System.out.println("Початковий масив:");
        printArray(numbers);

        // Зміна значень у масиві
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 10; // Збільшуємо кожне значення в 10 разів
        }

        // Виведення зміненого масиву
        System.out.println("\nЗмінений масив:");
        printArray(numbers);

        double[] decimals = new double[5];

        // Ініціалізація масиву деякими значеннями (опціонально)
        decimals[0] = 3.14;
        decimals[1] = 2.718;
        decimals[2] = 1.414;
        decimals[3] = 6.62607015e-34; // Наприклад, число Планка
        decimals[4] = -1.602176634e-19; // Наприклад, заряд електрону

        // Виведення масиву у консоль
        for (double num : decimals) {
            System.out.println(num);
        }




        byte myByte = 10;
        int myInt = 100;
        long myLong = 1000L;

        // Створення масиву типу int
        int[] myArray = new int[3];

        myArray[0] = myByte;
        myArray[1] = myInt;
        myArray[2] = (int) myLong;

        // Виведення елементів масиву у консоль
        for (int num : myArray) {
            System.out.println(num);
        }



        // Створення двовимірного масиву
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Виведення двовимірного масиву у консоль
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " "); // Перехід на новий рядок після кожного рядка масиву
            }
            System.out.println(); 
        }
        
    }

    // Метод для виведення масиву у консоль
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    

}
