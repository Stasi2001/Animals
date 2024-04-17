
class Dog extends Animal implements Noisy {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(name + " убегает");
    }

    @Override
    public void speak() {
        System.out.println(name + " гав-гав");
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " шумит");
    }
}

