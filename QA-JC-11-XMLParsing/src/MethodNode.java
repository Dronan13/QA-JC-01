import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class MethodNode {
	Node node;
    /**
     * ������� ����� ��������� ������� �� ������ Node ����.
     */
    public MethodNode(Node node) {
        this.node = node;
    }
    /**
     * ���������� ��� ������.
     */
    public String getName() {
        /**
         * �������� �������� ���� ������.
         */
        NamedNodeMap attributes = node.getAttributes();
        /**
         * �������� ���� ���������.
         */
        Node nameAttrib = attributes.getNamedItem("name");

        /**
         * ���������� �������� ��������.
         */
        return nameAttrib.getNodeValue();
    }    
    public String getContent() {
         /**
         * ���������� �������� �����������.
         */
        return "//"+node.getTextContent();
    }

}

