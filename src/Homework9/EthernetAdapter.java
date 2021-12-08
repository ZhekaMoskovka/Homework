package Homework9;

public class EthernetAdapter extends Device{
    public int speed;
    public String mac;

    public EthernetAdapter(String manufacture, float price, String serialNumber, int speed, String mac) {
        super(manufacture, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public String getMac() {
        return mac;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EthernetAdapter ethernetAdapter = (EthernetAdapter) o;
        return mac.equals(ethernetAdapter.mac);
    }

    @Override
    public int hashCode() {
        return speed * (int) price * 100;
    }
}