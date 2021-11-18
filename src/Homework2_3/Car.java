package Homework2_3;

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
        this.year = year;
        this.speed = speed;
    }

    Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}