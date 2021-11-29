package Homework3_3;

public class Plane extends Vehicle {
    public int height;
    public int numOfPassengers;

    public Plane(int[] coordinates, int cost, double speed, int year, int height, int numOfPassengers) {
        super(coordinates, cost, speed, year);
        this.height = height;
        this.numOfPassengers = numOfPassengers;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Висота полета: " + height);
        System.out.println("Количество пасажиров: " + numOfPassengers);
    }
}
