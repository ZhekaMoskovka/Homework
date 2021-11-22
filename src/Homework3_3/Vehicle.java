package Homework3_3;

public class Vehicle {
    public int[] coordinates = new int[3];
    public int cost;
    public double speed;
    public int year;

    public Vehicle(int[] coordinates, int cost, double speed, int year) {
        this.coordinates = coordinates;
        this.cost = cost;
        this.speed = speed;
        this.year = year;
    }

    public void show() {
        System.out.print("Координаты: [");
        for (int i = 0; i < 3; i++) {
            if (i != 2) {
                System.out.print(coordinates[i] + ", ");
            } else {
                System.out.print(coordinates[i]);
            }
        }
        System.out.print("]\n");
        System.out.println("Стоимость: " + cost);
        System.out.println("Скорость: " + speed);
        System.out.println("Год выпуска: " + year);
    }
}