import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

public class HumanGenerator {
	/*
	 * —оздаем перечень безразмерных массивов 
	 * дл€ хранени€ строк из соответствующих файлов
	 */
	private ArrayList<HumanEntity> dataList = new ArrayList<HumanEntity>();
	private ArrayList<String> surnameList = new ArrayList<String>();
	private ArrayList<String> maleNameList = new ArrayList<String>();
	private ArrayList<String> femaleNameList = new ArrayList<String>();
	private ArrayList<String> maleFathersnameList = new ArrayList<String>();
	private ArrayList<String> femaleFathersnameList = new ArrayList<String>();
	
	//ћетод определени€ параметров
	public void setData() throws FileNotFoundException{
		
		//дл€ каждого стчитывает свой файл
		surnameList = FileWorker.read("Surname.txt");
		
		maleNameList = FileWorker.read("Name_male.txt");
		maleFathersnameList = FileWorker.read("Fathersname_male.txt");
		
		femaleNameList = FileWorker.read("Name_female.txt");
		femaleFathersnameList = FileWorker.read("Fathersname_female.txt");
										         
	}
	
	public HumanEntity humanGenerate(){
		//екземпл€р класса HumanEntity
		HumanEntity he = new HumanEntity();
		//екземпл€р класса Random
		Random rnd = new Random();
		//условие дл€ задание пола если <0.5 то 
		//генерируем данные дл€ мужчины, иначе дл€ женщины
		if(rnd.nextDouble()<0.5){
			he.setSex("male");
			//surnameList.size() - возвращает количество элементов в surnameList
			//rnd.nextInt(surnameList.size()) - герерирует число от 0 до surnameList.size()
			//surnameList.get(...) - возвращает элемент surnameList от сгеренинного листа
			he.setSurname(surnameList.get(rnd.nextInt(surnameList.size())));
			he.setName(maleNameList.get(rnd.nextInt(maleNameList.size())));			
			he.setFathersname(maleFathersnameList.get(rnd.nextInt(maleFathersnameList.size())));
			//генерируем дату
			int day = 1+rnd.nextInt(28),//компенсаци€ генерации 0го значени€
			month = 1+rnd.nextInt(12), //компенсаци€ генерации 0го значени€
			year = 1960+rnd.nextInt(2000-1960); //на выходе дает минимум 1960 год и макс 2000год
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

	//методо создани€ списка из size - элементов
	public void dataGeneration(int size){
		while(size!=0){
			dataList.add(humanGenerate());
			size--;
		}
	}
	//запись в файл значений
	public void writeDataList(String fileName) {
		String s;
		StringBuilder sb= new StringBuilder();
		//аналог for с счетчиком,
		//цикл просто переберает все подр€д объекты класс HumanEntity 
		//хранимые в dataList
		for(HumanEntity he : dataList){
			s = he.getSex()+" "+he.getSurname()+" "+he.getName()+" "+he.getFathersname()+" "+he.getBirthday();
			sb.append(s);
			sb.append("\r\n");
		}
		FileWorker.write(fileName, sb);	
	}
}
