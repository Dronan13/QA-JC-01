import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
public class ApplicationNode {
	Node node;
	 
    public ApplicationNode(Node node) {
        this.node = node;
    }

    public List<ClassNode> getClasses() {
        ArrayList<ClassNode> classes = new ArrayList<ClassNode>();

        /**
         * Получаем список дочерних узлов для данного узла XML, который
         * соответствует приложению application. Здесь будут располагаться
         * все узлы Node, каждый из которых является объектным
         * представлением тега class для текущего тега application.
         */
        NodeList classNodes = node.getChildNodes();

        for (int i = 0; i < classNodes.getLength(); i++) {
            Node node = classNodes.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                /**
                 * Создаем на основе Node узла своё объектное
                 * представление класса.
                 */
                ClassNode classNode = new ClassNode(node);
                classes.add(classNode);
            }
        }
        return classes;
    }
}
