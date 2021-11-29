package Homework3_3;

public class Ship extends Vehicle {
    public String port;
    public int numOfPassengers;

    public Ship(int[] coordinates, int cost, double speed, int year, String port, int numOfPassengers) {
        super(coordinates, cost, speed, year);
        this.port = port;
        this.numOfPassengers = numOfPassengers;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Порт прибывания: " + port);
        System.out.println("Количество пасажиров: " + numOfPassengers);
    }
}