import java.util.Scanner;

public class conditions_loops {
    
    public static void main(String[] args) {
        // 1/3
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficients a, b and c for the quadratic equation ax^2 + bx + c = 0:");

        System.out.print("a = ");
        double a = scanner.nextDouble();

        System.out.print("b = ");
        double b = scanner.nextDouble();

        System.out.print("c = ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has two different roots: ");
            System.out.println("x1 = " + root1);
            System.out.println("x2 = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The equation has one double root: ");
            System.out.println("x = " + root);
        } else {
            System.out.println("The equation has no real roots.");
        }

        scanner.close();

        // 2/3
        Scanner scannerObj = new Scanner(System.in);

        System.out.println("Enter a series of numbers separated by spaces: ");
        String input = scannerObj.nextLine();

        String[] numbersStr = input.split(" ");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String numStr : numbersStr) {
            int num = Integer.parseInt(numStr);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);

        scannerObj.close();

        // 3/3
        String text = "Роняє ліс багряний свій убір,\n" +
                      "Срібне мороз, що в'януло поле,\n" +
                      "Прогляне день ніби мимоволі\n" +
                      "І сховається за край окружних гір.";

        int count = countSubstringOccurrencesIgnoreCase(text, "про");

        System.out.println("Кількість входжень літер 'про' або 'Про': " + count);
    }

        public static int countSubstringOccurrencesIgnoreCase(String text, String subString) {
            int count = 0;
            int lastIndex = 0;

            text = text.toLowerCase();
            subString = subString.toLowerCase();

            while (lastIndex != -1) {
                lastIndex = text.indexOf(subString, lastIndex);
                if (lastIndex != -1) {
                    count++;
                    lastIndex += subString.length();
                }
            }

            return count;
    }
}
