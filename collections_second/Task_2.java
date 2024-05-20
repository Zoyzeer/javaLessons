package collections_second;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task_2 {
    public static Map<Integer, List<String>> groupByStringLength(List<String> strings) {
        Map<Integer, List<String>> resultMap = new HashMap<>();
        
        for (String str : strings) {
            int length = str.length();
            if (resultMap.containsKey(length)) {
                resultMap.get(length).add(str);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(str);
                resultMap.put(length, newList);
            }
        }
        return resultMap;
    }

    public static void main(String[] args) {
        List<String> strings = List.of("тут", "там", "стол");
        Map<Integer, List<String>> result = groupByStringLength(strings);
        System.out.println(result);
    }
}
