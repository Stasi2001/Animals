class Cat extends Animal implements Noisy {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(name + " убежала");
    }

    @Override
    public void speak() {
        System.out.println(name + " мурлычет");
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " шумит");
    }
}
