package Class_and_objects_firstPart.mainpackage;

import Class_and_objects_firstPart.mypackage.MyInt;

public class MainProgram {
    public static void main(String[] args) {
        // Створення об'єкта а1 типу MyInt та присвоєння йому значення
        MyInt a1 = new MyInt(3);

        // Створення об'єкта а2 типу MyInt та присвоєння йому значення а1
        MyInt a2 = a1;

        // Виведення значень а1.x та а2.x у консоль
        System.out.println("Значення а1.x: " + a1.x);
        System.out.println("Значення а2.x: " + a2.x);

        // Зміна значення а1.x
        a1.x = 5;

        // Виведення нових значень а1.x та а2.x у консоль
        System.out.println("Нове значення а1.x: " + a1.x);
        System.out.println("Нове значення а2.x: " + a2.x);
    }
}
