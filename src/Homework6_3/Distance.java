package Homework6_3;

public class Distance {
    double distance;

    public void print() {
    }

    public static class Converter {
        public double convertMetersToKilometers(double meters) {
            return meters / 1000;
        }

        public double convertKilometersToMiles(double kilometers) {
            return kilometers / 1.61;
        }

        public double convertCentimetersToInch(double centimeters) {
            return centimeters / 2.54;
        }
    }
}