package Exceptions;

public class Task_1 {
    public static void main(String[] args) {
        try{
            throw new Exception("Это исключение");
        } catch (Exception e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        } finally {
            System.out.println("Это блок finally");
        }
    }
}
