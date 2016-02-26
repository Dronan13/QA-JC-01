import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

public class HumanGenerator {
	/*
	 * ������� �������� ������������ �������� 
	 * ��� �������� ����� �� ��������������� ������
	 */
	private ArrayList<HumanEntity> dataList = new ArrayList<HumanEntity>();
	private ArrayList<String> surnameList = new ArrayList<String>();
	private ArrayList<String> maleNameList = new ArrayList<String>();
	private ArrayList<String> femaleNameList = new ArrayList<String>();
	private ArrayList<String> maleFathersnameList = new ArrayList<String>();
	private ArrayList<String> femaleFathersnameList = new ArrayList<String>();
	
	//����� ����������� ����������
	public void setData() throws FileNotFoundException{
		
		//��� ������� ���������� ���� ����
		surnameList = FileWorker.read("Surname.txt");
		
		maleNameList = FileWorker.read("Name_male.txt");
		maleFathersnameList = FileWorker.read("Fathersname_male.txt");
		
		femaleNameList = FileWorker.read("Name_female.txt");
		femaleFathersnameList = FileWorker.read("Fathersname_female.txt");
										         
	}
	
	public HumanEntity humanGenerate(){
		//��������� ������ HumanEntity
		HumanEntity he = new HumanEntity();
		//��������� ������ Random
		Random rnd = new Random();
		//������� ��� ������� ���� ���� <0.5 �� 
		//���������� ������ ��� �������, ����� ��� �������
		if(rnd.nextDouble()<0.5){
			he.setSex("male");
			//surnameList.size() - ���������� ���������� ��������� � surnameList
			//rnd.nextInt(surnameList.size()) - ���������� ����� �� 0 �� surnameList.size()
			//surnameList.get(...) - ���������� ������� surnameList �� ������������ �����
			he.setSurname(surnameList.get(rnd.nextInt(surnameList.size())));
			he.setName(maleNameList.get(rnd.nextInt(maleNameList.size())));			
			he.setFathersname(maleFathersnameList.get(rnd.nextInt(maleFathersnameList.size())));
			//���������� ����
			int day = 1+rnd.nextInt(28),//����������� ��������� 0�� ��������
			month = 1+rnd.nextInt(12), //����������� ��������� 0�� ��������
			year = 1960+rnd.nextInt(2000-1960); //�� ������ ���� ������� 1960 ��� � ���� 2000���
			he.setBirthday(day+"."+month+"."+year);
		}			
		else{
			he.setSex("female");		
			he.setSurname(surnameList.get(rnd.nextInt(surnameList.size()))+"a");		
			he.setName(femaleNameList.get(rnd.nextInt(femaleNameList.size())));			
			he.setFathersname(femaleFathersnameList.get(rnd.nextInt(femaleFathersnameList.size())));
			int day = 1+rnd.nextInt(28),
			month = 1+rnd.nextInt(12), 
			year = 1960+rnd.nextInt(2000-1960);
			he.setBirthday(day+"."+month+"."+year);
		}	
		return he;
	}

	//������ �������� ������ �� size - ���������
	public void dataGeneration(int size){
		while(size!=0){
			dataList.add(humanGenerate());
			size--;
		}
	}
	//������ � ���� ��������
	public void writeDataList(String fileName) {
		String s;
		StringBuilder sb= new StringBuilder();
		//������ for � ���������,
		//���� ������ ���������� ��� ������ ������� ����� HumanEntity 
		//�������� � dataList
		for(HumanEntity he : dataList){
			s = he.getSex()+" "+he.getSurname()+" "+he.getName()+" "+he.getFathersname()+" "+he.getBirthday();
			sb.append(s);
			sb.append("\r\n");
		}
		FileWorker.write(fileName, sb);	
	}
}
