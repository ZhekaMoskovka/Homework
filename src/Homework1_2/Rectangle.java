package Homework1_2;

class Rectangle {
    public double side1;
    public double side2;


    public double areaCalculate(double side1, double side2) {
        return side1 * side2;
    }

    public double perimeterCalculate(double side1, double side2) {
        return (side1 + side2) * 2;
    }
}
