public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Generic", 5);
        Mammal cat = new Mammal("Whiskers", 3, "Gray");
        Bird eagle = new Bird("Eddie", 10, 2.5);
        Dog goldenRetriever = new Dog("Buddy", 2, "Golden", "Golden Retriever");

        // Task 4: Call makeSound() and display information using toString()
        genericAnimal.makeSound();
        System.out.println(genericAnimal);

        cat.makeSound();
        System.out.println(cat);

        eagle.makeSound();
        System.out.println(eagle);

        goldenRetriever.makeSound();
        System.out.println(goldenRetriever);
    }
}
