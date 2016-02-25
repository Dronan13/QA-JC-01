import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class MethodNode {
	Node node;
    /**
     * Создаем новый экземпляр объекта на основе Node узла.
     */
    public MethodNode(Node node) {
        this.node = node;
    }
    /**
     * Возвращает имя метода.
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
    public String getContent() {
         /**
         * Возвращаем значение содержимого.
         */
        return "//"+node.getTextContent();
    }

}

