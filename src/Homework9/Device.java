package Homework9;

public class Device {
    public String manufacture;
    public float price;
    public String serialNumber;

    public Device(String manufacture, float price, String serialNumber) {
        this.manufacture = manufacture;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacture() {
        return manufacture;
    }

    public float getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device: "
                + "manufacture=" + manufacture
                + ", price=" + price
                + ", serialNumber=" + serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return serialNumber.equals(device.serialNumber);
    }

    @Override
    public int hashCode() {
        return (int) price * 1000;
    }
}