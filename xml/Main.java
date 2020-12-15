package sk.itsovy.kovalcik.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static final String xmlFilePath = "C:\\Users\\Kovi\\Desktop\\xmlfile.xml";

    public static void main(String argv[]) {

        try {

            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();

            Document document = documentBuilder.newDocument();

            Element root = document.createElement("bill");
            document.appendChild(root);

            Element date = document.createElement("date");
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date date1 = new Date();
            date.appendChild(document.createTextNode(String.valueOf(date1)));
            root.appendChild(date);

            Element items = document.createElement("items");
            items.appendChild(document.createTextNode("James"));
            root.appendChild(items);

            // lastname element
            Element lastname = document.createElement("lastname");
            lastname.appendChild(document.createTextNode("Harley"));
            root.appendChild(lastname);

            // email element
            Element email = document.createElement("email");
            email.appendChild(document.createTextNode("james@example.org"));
            root.appendChild(email);

            // department elements
            Element department = document.createElement("department");
            department.appendChild(document.createTextNode("Human Resources"));
            root.appendChild(department);

            // create the xml file
            //transform the DOM Object to an XML File
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(xmlFilePath));

            // If you use
            // StreamResult result = new StreamResult(System.out);
            // the output will be pushed to the standard output ...
            // You can use that for debugging

            transformer.transform(domSource, streamResult);

            System.out.println("Done creating XML File");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }
}

