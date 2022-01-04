package Homework17_4;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class Homework17_4 {
    public static void main(String[] args) {
        Addresses addresses = new Addresses();
        addresses.add(new Address("Kiev", "Marshala Tymoshenka", "27A"));
        try {
            File file = new File("src/Homework17_4/Cities.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Addresses.class);
            Marshaller mar = jaxbContext.createMarshaller();
            mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            mar.marshal(addresses, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
