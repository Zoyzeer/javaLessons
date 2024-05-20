package collections;
import java.util.ArrayList;
import java.util.Iterator;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        // Обход с использованием цикла for
        System.out.println("Traversal using for loop: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Обход с использованием цикла for-each
        System.out.println("\nTraversal using for-each loop: ");
        for(String fruit : list){
            System.out.println(fruit);
        }

        // Обход с использованием цикла while
        System.out.println("\nTraversal using while loop: ");
        int index = 0;
        while (index < list.size()) {
            System.out.println(list.get(index));
            index++;
        }

        // Обход с использованием итератора
        System.out.println("\nTraversal using iterator: ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
