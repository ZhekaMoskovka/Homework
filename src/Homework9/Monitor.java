package Homework9;

public class Monitor extends Device{
    public int resolutionX;
    public int resolutionY;

    public Monitor(String manufacture, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacture, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor: "
                + "manufacture=" + manufacture
                + ", price=" + price
                + ", serialNumber=" + serialNumber
                + ", resolutionX=" + resolutionX
                + ", resolutionY=" + resolutionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Monitor monitor = (Monitor) o;
        return resolutionX == monitor.resolutionX && resolutionY == monitor.resolutionY;
    }

    @Override
    public int hashCode() {
        return (int) price * 12;
    }
}