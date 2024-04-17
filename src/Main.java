public class Main {
    public static void main(String[] args) {
        Mouse mouse = new Mouse("Simon");
        Cat cat = new Cat("Vasya");
        Dog dog = new Dog("Sharik");

        cat.scare(mouse);
        dog.scare(cat);

        Noisy noisy = () -> System.out.println("Громко");
        dog.scare((Animal) noisy);
    }
}