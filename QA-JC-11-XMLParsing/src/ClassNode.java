

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ClassNode {
	Node node;	 
    /**
     * ������� ����� ��������� ������� �� ������ Node ����.
     */
    public ClassNode(Node node) {
        this.node = node;
    }
    /**
     * ���������� ������ ������� ������.
     */
    public List<MethodNode> getMethods() {
        ArrayList<MethodNode> methods = new ArrayList<MethodNode>();
        /**
         * �������� ������ �������� ����� ��� ������� ���� XML, 
         * ������� ������������� ������ class. ����� ����� ������������� 
         * ��� ���� Node, ������ �� ������� �������� ��������� 
         * �������������� ���� method ��� �������� ���� class.
         */
        NodeList methodNodes = node.getChildNodes();
        for (int i = 0; i < methodNodes.getLength(); i++) {
            node = methodNodes.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                /**
                 * ������� �� ������ Node ���� ��� ��������� �������������
                 * ������.
                 */
                MethodNode methodNode = new MethodNode(node);
                methods.add(methodNode);
            }
        }
        return methods;
    }
    /**
     * ��������� ��� ������.
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
}
