package Homework17_4;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Arrays;

@XmlRootElement(name = "addresses")
public class Addresses {
    @XmlElement(name = "address")
    private ArrayList<Address> addresses = new ArrayList<>();

    public void add (Address address) {
        addresses.add(address);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(addresses.toArray());
    }
}
