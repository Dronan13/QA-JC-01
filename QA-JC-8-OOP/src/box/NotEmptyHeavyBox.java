package box;
public class NotEmptyHeavyBox extends HeavyBox{
	
	int density;// ��������� ��������� � �������
	/*
	 * �����������
	 * �������������� ���������� � ������� ��������� ����� super
	 * ��� ������� ������ ���������� ����� HeavyBox
	 */
	NotEmptyHeavyBox(int m, int d) {
		super(m);
		density = d;
	}

}
