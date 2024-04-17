abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void run();

    public abstract void speak();

    public void scare(Animal animal) {
        System.out.println(this.name + " испугався " + animal.name);
        animal.speak();
        animal.run();
    }
}

interface Noisy {
    void makeNoise();
}
