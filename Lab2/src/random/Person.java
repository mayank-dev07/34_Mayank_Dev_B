package random;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person Person1 = new Person("Ram", 30);
        Person Person2 = new Person("Sham", 25);
        Person1.printInfo();
        Person2.printInfo();
    }
}
