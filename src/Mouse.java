class Mouse extends Animal {
        public Mouse(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println(name + " убегает");
        }

        @Override
        public void speak() {
            System.out.println(name + " пищит");
        }
    }
