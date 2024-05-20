package Exceptions;

public class Task_2 {
    public void g() throws Exception {
        throw new Exception("Это исключение из метода g()");
    }

    public void f() throws Exception {
        try {
            g();
        } catch (Exception e) {
            System.out.println("Это исключение поймано в f(): " + e.getMessage());
            throw new Exception("Новое исключение из метода f()");
        }
    }

    public static void main(String[] args) {
        Task_2 example = new Task_2();
        try {
            example.f();
        } catch (Exception e) {
            System.out.println("Это исключение поймано в main(): " + e.getMessage());
            e.printStackTrace();
        }
    }
}
