import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
//http://www.codenet.ru/webmast/xml/part1.php#p3
public class ModifyXMLFile {
	public void ModifyFile(){ 
		try {
	        String filepath = "Export.xml";
	        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
	        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
	        Document doc = docBuilder.parse(filepath);
	
	        // Получаем первый элемент;
	        Node Staff = doc.getElementsByTagName("Staff").item(0);
	
	        // обновляем атрибут "id"
	        NamedNodeMap attr = Staff.getAttributes();
	        Node nodeAttr = attr.getNamedItem("id");
	        nodeAttr.setTextContent("0002");
	
	        // добавляем новый узел к "Staff"
	        Element year = doc.createElement("year");
	        year.appendChild(doc.createTextNode("2015"));
	        Staff.appendChild(year);
	        // пишем контент в XML файл
	        TransformerFactory transformerFactory = TransformerFactory.newInstance();
	        Transformer transformer = transformerFactory.newTransformer();
	        DOMSource domSource = new DOMSource(doc);
	        StreamResult streamResult = new StreamResult(new File(filepath));
	        transformer.transform(domSource, streamResult);
	
	        System.out.println("File modified!");
	    } catch (ParserConfigurationException e) {
	        e.printStackTrace();
	    } catch (TransformerException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } catch (SAXException e) {
	        e.printStackTrace();
	    }
	}
}
