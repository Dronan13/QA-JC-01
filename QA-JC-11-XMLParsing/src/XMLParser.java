import java.io.File;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLParser {
	
	private static final String SPACE = "   ";
	
	private static Document getDocument(String docName) throws Exception {
        try {
        	/*создали фабрику строителей, сложный и грамосткий процесс 
        	 *(по реже выполн€йте это действие)*/
            DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
            f.setValidating(false);
            // создали конкретного строител€ документа 
            DocumentBuilder builder = f.newDocumentBuilder();
            // стооитель построил документ 
            return builder.parse(new File(docName));
        }catch (Exception exception) {
            String message = "XML parsing error!";
            throw new Exception(message);
        }
    } 
	
	
    private static void showDocument(Document doc){
    	//контент документа в виде "строки"
        StringBuffer content = new StringBuffer();
        Node node = doc.getChildNodes().item(0);
        
        ApplicationNode appNode = new ApplicationNode(node);
 
        content.append("Application \n");
 
        List<ClassNode> classes = appNode.getClasses();
 
        for (int i = 0; i < classes.size(); i++) {
            ClassNode classNode = classes.get(i);
            content.append(SPACE + "Class: " + classNode.getName() + " \n");
 
            List<MethodNode> methods = classNode.getMethods();
 
            for (int j = 0; j < methods.size(); j++) {
                MethodNode methodNode = methods.get(j);
                content.append(SPACE + SPACE + "Method: "
                        + methodNode.getName() +" "+methodNode.getContent()+ " \n");
            }
        }
        System.out.println(content);
        
    }
    
	public static void main(String[] args) throws Exception { 
		Document doc = getDocument("testXML.xml");
        showDocument(doc);
	}
	
	/**
     * ¬озвращает объект Document, который €вл€етс€ объектным представлением
     * XML документа.
     */
    
} 



