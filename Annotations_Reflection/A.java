package Annotations_Reflection;

public class A {
    private String id = "123";
    private String name = "A";

    private A() {
    }

    @Override
    public String toString() {
        return "A{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static A createInstance(String id, String name) {
        A instance = new A();
        instance.id = id;
        instance.name = name;
        return instance;
    }

    public static void main(String[] args) {
        A instance = A.createInstance("456", "B");
        System.out.println(instance);
    }
}
