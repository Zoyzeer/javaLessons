package collections_second;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task_1 {
    public static Map<String, Integer> mapStringLengths(List<String> strings) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (String str : strings) {
            resultMap.put(str, str.length());
        }
        return resultMap;
    }

    public static void main(String[] args) {
        List<String> strings = List.of("тут", "там", "стол");
        Map<String, Integer> result = mapStringLengths(strings);
        System.out.println(result);
    }
}
