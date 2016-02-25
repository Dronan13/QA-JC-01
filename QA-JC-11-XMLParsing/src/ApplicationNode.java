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
         * �������� ������ �������� ����� ��� ������� ���� XML, �������
         * ������������� ���������� application. ����� ����� �������������
         * ��� ���� Node, ������ �� ������� �������� ���������
         * �������������� ���� class ��� �������� ���� application.
         */
        NodeList classNodes = node.getChildNodes();

        for (int i = 0; i < classNodes.getLength(); i++) {
            Node node = classNodes.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                /**
                 * ������� �� ������ Node ���� ��� ���������
                 * ������������� ������.
                 */
                ClassNode classNode = new ClassNode(node);
                classes.add(classNode);
            }
        }
        return classes;
    }
}
