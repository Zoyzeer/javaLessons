package collections;
import java.util.List;
// import java.util.ArrayList;
// import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Task_2 {
    
    public static int getSum(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

    public static List<Integer> getOddNumber(List<Integer> numbers) {
        return numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
    }

    public static List<String> convertToStringList(List<Integer> numbers) {
        return numbers.stream().map(String::valueOf).collect(Collectors.toList());
    }

    public static List<String> doubling(List<String> numbers) {
        return numbers.stream().map(s -> s + s).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);
        // List<String> strings = List.of("a", "b", "c");

        int sum = getSum(numbers);
        List<Integer> oddNumbers = getOddNumber(numbers);
        List<String> stringList = convertToStringList(oddNumbers);
        List<String> doubledStrings = doubling(stringList);

        System.out.println("Sum: " + sum);
        System.out.println("Odd Numbers: " + oddNumbers);
        System.out.println("String List: " + stringList);
        System.out.println("Doubled Strings: " + doubledStrings);
    }
}
