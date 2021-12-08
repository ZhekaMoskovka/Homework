package Homework9;

public class Main {
    public static void main(String[] args) {
        Device device1 = new Device("Samsung", 500, "ab123456qwd");
        Device device2 = new Device("Xiaomi", 200, "ewf22334546qd");
        Device device3 = new Device("Leagoo", 120, "ab123456qwd");

        System.out.println(device1);
        System.out.println(device2);
        System.out.println(device3);

        System.out.println("device1.equals(device2)" + device1.equals(device2));
        System.out.println("device2.equals(device3)" + device2.equals(device3));
        System.out.println("device1.equals(device3)" + device1.equals(device3));

        System.out.println("device1.hashCode()" + device1.hashCode());
        System.out.println("device2.hashCode()" + device2.hashCode());
        System.out.println("device3.hashCode()" + device3.hashCode());

        Monitor monitor1 = new Monitor("Samsung", 600, "qw2324523fwef", 1920, 1080);
        Monitor monitor2 = new Monitor("AOC", 300, "qw2324523fwef", 1366, 766);
        Monitor monitor3 = new Monitor("Acer", 400, "dejw0987313daf", 1920, 1080);

        System.out.println(monitor1);
        System.out.println(monitor2);
        System.out.println(monitor3);

        System.out.println("monitor1.equals(monitor2)" + monitor1.equals(monitor2));
        System.out.println("monitor2.equals(monitor3)" + monitor2.equals(monitor3));
        System.out.println("monitor1.equals(monitor3)" + monitor1.equals(monitor3));

        System.out.println("monitor1.hashCode()" + monitor1.hashCode());
        System.out.println("monitor2.hashCode()" + monitor2.hashCode());
        System.out.println("monitor3.hashCode()" + monitor3.hashCode());

        EthernetAdapter ethernetAdapter1 = new EthernetAdapter("Samsung", 600, "qw2324523fwef", 1000, "ed2134562dfr55234");
        EthernetAdapter ethernetAdapter2 = new EthernetAdapter("Xiaomi", 200, "qw2324523fwef", 1000, "ed2134562dfr55234");
        EthernetAdapter ethernetAdapter3 = new EthernetAdapter("TP-Link", 300, "qw2324523fwef", 1000, "ed2134562dfr55234");

        System.out.println(ethernetAdapter1);
        System.out.println(ethernetAdapter2);
        System.out.println(ethernetAdapter3);

        System.out.println("ethernetAdapter1.equals(ethernetAdapter2): " + ethernetAdapter1.equals(ethernetAdapter2));
        System.out.println("ethernetAdapter2.equals(ethernetAdapter3): " + ethernetAdapter2.equals(ethernetAdapter3));
        System.out.println("ethernetAdapter1.equals(ethernetAdapter3): " + ethernetAdapter1.equals(ethernetAdapter3));

        System.out.println("ethernetAdapter1.hashCode()" + ethernetAdapter1.hashCode());
        System.out.println("ethernetAdapter2.hashCode()" + ethernetAdapter2.hashCode());
        System.out.println("ethernetAdapter3.hashCode()" + ethernetAdapter3.hashCode());
    }
}