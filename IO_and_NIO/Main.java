package IO_and_NIO;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите текст. Для окончания ввода введите 'end' ");
            while (true) {
                String line = scanner.nextLine().trim();
                if (line.equalsIgnoreCase("end")) {
                    break;
                } else if (line.equalsIgnoreCase("next")) {
                    lines.add("");                
                } else {
                    if (!line.isEmpty()) {
                        if (!lines.isEmpty()) {
                            String lastLine = lines.get(lines.size() - 1);
                            lines.set(lines.size() - 1, lastLine + line + ", ");
                        } else {
                            lines.add(line + ", ");
                        }
                    }
                }
            }
        }

        try (FileWriter writer = new FileWriter("output.csv")) {
            for (String line : lines) {
                writer.write(line + "\n");
            }
            System.out.println("CSV файл успешно создан: 'output.csv' ");
        } catch (Exception e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
