package Homework6_2;

public class Vehicle {
    public String model;
    public Vehicle(String model) {
        this.model = model;
    }

    public void print() {
        System.out.println("Модель: " + model);
    }
    public class Wheel {
        public String wheel;
        public Wheel(String wheel) {
            this.wheel = wheel;
        }
        public void print() {
            System.out.println("Руль (левосторонний, правосторонний): " + wheel);
        }
    }
    public class Door {
        public int doors;

        public Door(int doors) {
            this.doors = doors;
        }

        public void print() {
            System.out.println("Количество дверей: " + doors);
        }
    }
}