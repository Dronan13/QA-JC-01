import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
		//������� ��������� ������ HumanGenerator 
		HumanGenerator hg = new HumanGenerator();
		//����� ������ ����������� ������
		hg.setData();
		//����� ������ ��������� ���
		hg.dataGeneration(300);
		//����� ������ ������ ��������������� ���
		hg.writeDataList("out.txt");
	}

}
