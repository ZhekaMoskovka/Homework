package Homework17_3;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class Homework17_3 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();
            Element rootElement = doc.createElement("cities");
            doc.appendChild(rootElement);
            Element address = doc.createElement("address");
            rootElement.appendChild(address);
            Element city = doc.createElement("city");
            city.setAttribute("size", "big");
            city.setTextContent("Kiev");
            address.appendChild(city);
            Element street = doc.createElement("street");
            street.setTextContent("Marshala Tymoshenka");
            address.appendChild(street);
            Element house = doc.createElement("house");
            house.setAttribute("floors", "15");
            house.setTextContent("26A");
            address.appendChild(house);
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult sr = new StreamResult(new File("src/Homework17_3/Cities.xml"));
            t.transform(source, sr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
}