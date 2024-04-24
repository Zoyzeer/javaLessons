package FieldsAndMethods;

public class Main {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(3);

        myArray.put("first");
        myArray.put("second");
        myArray.put("3th");

        System.out.println("Length: " + myArray.length());
        for (int i = 0; i < myArray.length(); i++) {
            System.out.println("Element " + i + ": " + myArray.get());
        }
        
        System.out.println("Length: " + myArray.length());
    }
}

