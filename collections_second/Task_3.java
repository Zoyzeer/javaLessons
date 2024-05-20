package collections_second;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task_3 {
    public static void addToArrayList() {
        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // Время в миллисекундах
        System.out.println("Добавление в ArrayList заняло: " + duration + " мс");
    }

    public static void addToLinkedList() {
        List<Integer> linkedList = new LinkedList<>();
        long startTime = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // Время в миллисекундах
        System.out.println("Добавление в LinkedList заняло: " + duration + " мс");
    }

    public static void getRandomElements(List<Integer> list) {
        Random random = new Random();
        long startTime = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            int randomIndex = random.nextInt(list.size());
            list.get(randomIndex);
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // Время в миллисекундах
        System.out.println("Выбор элементов наугад занял : " + duration + " мс");
    }

    public static void main(String[] args) {
        addToArrayList();
        addToLinkedList();

        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }

        getRandomElements(arrayList);
    }
}
