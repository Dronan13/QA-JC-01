

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ClassNode {
	Node node;	 
    /**
     * Создаем новый экземпляр объекта на основе Node узла.
     */
    public ClassNode(Node node) {
        this.node = node;
    }
    /**
     * Возвращает список методов класса.
     */
    public List<MethodNode> getMethods() {
        ArrayList<MethodNode> methods = new ArrayList<MethodNode>();
        /**
         * Получаем список дочерних узлов для данного узла XML, 
         * который соответствует классу class. Здесь будут располагаться 
         * все узлы Node, каждый из которых является объектным 
         * представлением тега method для текущего тега class.
         */
        NodeList methodNodes = node.getChildNodes();
        for (int i = 0; i < methodNodes.getLength(); i++) {
            node = methodNodes.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                /**
                 * Создаем на основе Node узла своё объектное представление
                 * метода.
                 */
                MethodNode methodNode = new MethodNode(node);
                methods.add(methodNode);
            }
        }
        return methods;
    }
    /**
     * Возвращае имя класса.
     */
    public String getName() {
        /**
         * Получаем атрибуты узла метода.
         */
        NamedNodeMap attributes = node.getAttributes();
        /**
         * Получаем узел аттрибута.
         */
        Node nameAttrib = attributes.getNamedItem("name");
        /**
         * Возвращаем значение атрибута.
         */
        return nameAttrib.getNodeValue();
    }
}
