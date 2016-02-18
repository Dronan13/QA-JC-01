package box;
//����� ���������, ��������� �� ������ Box
public class HeavyBox extends Box{
	int weight; // ��� �������
	
	HeavyBox(int w, int h, int l, int m) {
        width = w;
        height = h;
        length = l;
        boxLabel = "Heavy box";
        weight = m; // �����
    }
	
	// �����������, ��� ��������� �������� �� ��������� ��� �������� � ��������� ����
    HeavyBox(int m) {
    	width = 10;
        height = 10;
        length = 10;
        boxLabel = "Heavy box";
        weight = m; // �����
    }
    
	// �����������
    // �������������� ���������� � ������� ��������� ����� super
    HeavyBox(int w, int h, int d, int m, String bL) {
        super(w, h, d, bL); // ����� ������������ �����������(����� Box)
        weight = m; // �����
    }
}
