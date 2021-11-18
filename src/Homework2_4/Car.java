package Homework2_4;

class Car {
    int year;
    double speed;
    int weight;
    String color;

    Car() {
    }

    Car(int year) {
        this.year = year;
    }

    Car(int year, double speed) {
        this(year);
        this.speed = speed;
    }

    Car(int year, double speed, int weight) {
        this(year, speed);
        this.weight = weight;
    }

    Car(int year, double speed, int weight, String color) {
        this(year, speed, weight);
        this.color = color;
    }
}