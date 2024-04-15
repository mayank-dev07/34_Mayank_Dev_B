package random;

public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String toString() {
        return "Name: " + name + ", Breed: " + breed;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("bunty", "Golden Retriever");
        Dog dog2 = new Dog("poplu", "Bulldog");
        System.out.println("Initial Info:");
        System.out.println(dog1);
        System.out.println(dog2);
        dog1.setName("Max");
        dog2.setBreed("Labrador Retriever");
        System.out.println("\nUpdated Info:");
        System.out.println(dog1);
        System.out.println(dog2);
    }
}
