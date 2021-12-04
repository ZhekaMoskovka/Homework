package Homework7_2;

public enum Animals {
    LION(16) {
        @Override
        public String getName() {
            return "Lion";
        }
    }, PARROT(2) {
        @Override
        public String getName() {
            return "Parrot";
        }
    }, ELEPHANT(20) {
        @Override
        public String getName() {
            return "Elephant";
        }
    }, HIPPO(18) {
        @Override
        public String getName() {
            return "Hippo";
        }
    }, WOLF(6) {
        @Override
        public String getName() {
            return "Wolf";
        }
    }, RABBIT(3) {
        @Override
        public String getName() {
            return "Rabbit";
        }
    };
    int age;

    Animals(int age) {
        this.age = age;
    }

    public String getName() {
        return "Null";
    }

    @Override
    public String toString() {
        return "Animal: " + getName() + "\nAge: " + age;
    }
}