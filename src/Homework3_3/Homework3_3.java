package Homework3_3;

public class Homework3_3 {
    public static void main(String[] args) {
        int[] coordinatesCar = {12, 23, 14};
        int[] coordinatesShip = {67, 184, -3};
        int[] coordinatesPlane = {183, 78, 190};
        Car car = new Car(coordinatesCar, 13000, 78.2, 2012);
        Ship ship = new Ship(coordinatesShip, 450000, 34, 2006, "Rivera", 360);
        Plane plane = new Plane(coordinatesPlane, 1200000, 587, 2009, 3274, 186);

        System.out.println("Автомобиль:");
        car.show();
        System.out.println("\nКорабль:");
        ship.show();
        System.out.println("\nСамолет:");
        plane.show();
    }
}
