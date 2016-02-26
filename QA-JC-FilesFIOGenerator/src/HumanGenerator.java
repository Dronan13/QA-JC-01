import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

public class HumanGenerator {
	/*
	 * Ñîçäàåì ïåðå÷åíü áåçðàçìåðíûõ ìàññèâîâ 
	 * äëÿ õðàíåíèÿ ñòðîê èç ñîîòâåòñòâóþùèõ ôàéëîâ
	 */
	private ArrayList<HumanEntity> dataList = new ArrayList<HumanEntity>();
	private ArrayList<String> surnameList = new ArrayList<String>();
	private ArrayList<String> maleNameList = new ArrayList<String>();
	private ArrayList<String> femaleNameList = new ArrayList<String>();
	private ArrayList<String> maleFathersnameList = new ArrayList<String>();
	private ArrayList<String> femaleFathersnameList = new ArrayList<String>();
	
	//Ìåòîä îïðåäåëåíèÿ ïàðàìåòðîâ
	public void setData() throws FileNotFoundException{
		
		//äëÿ êàæäîãî ñò÷èòûâàåò ñâîé ôàéë
		surnameList = FileWorker.read("Surname.txt");
		
		maleNameList = FileWorker.read("Name_male.txt");
		maleFathersnameList = FileWorker.read("Fathersname_male.txt");
		
		femaleNameList = FileWorker.read("Name_female.txt");
		femaleFathersnameList = FileWorker.read("Fathersname_female.txt");
										         
	}
	
	public HumanEntity humanGenerate(){
		//åêçåìïëÿð êëàññà HumanEntity
		HumanEntity he = new HumanEntity();
		//åêçåìïëÿð êëàññà Random
		Random rnd = new Random();
		//óñëîâèå äëÿ çàäàíèå ïîëà åñëè <0.5 òî 
		//ãåíåðèðóåì äàííûå äëÿ ìóæ÷èíû, èíà÷å äëÿ æåíùèíû
		if(rnd.nextDouble()<0.5){
			he.setSex("male");
			//surnameList.size() - âîçâðàùàåò êîëè÷åñòâî ýëåìåíòîâ â surnameList
			//rnd.nextInt(surnameList.size()) - ãåðåðèðóåò ÷èñëî îò 0 äî surnameList.size()
			//surnameList.get(...) - âîçâðàùàåò ýëåìåíò surnameList îò ñãåðåíèííîãî ëèñòà
			/*
			 * int i = surnameList.size();
			 * int j = rnd.nextInt(i);
			 * String sur = surnameList.get(j)
			 * he.setSurname(size);
			 */
			he.setSurname(surnameList.get(rnd.nextInt(surnameList.size())));
			he.setName(maleNameList.get(rnd.nextInt(maleNameList.size())));			
			he.setFathersname(maleFathersnameList.get(rnd.nextInt(maleFathersnameList.size())));
			//ãåíåðèðóåì äàòó
			int day = 1+rnd.nextInt(28),//êîìïåíñàöèÿ ãåíåðàöèè 0ãî çíà÷åíèÿ
			month = 1+rnd.nextInt(12), //êîìïåíñàöèÿ ãåíåðàöèè 0ãî çíà÷åíèÿ
			year = 1960+rnd.nextInt(2000-1960); //íà âûõîäå äàåò ìèíèìóì 1960 ãîä è ìàêñ 2000ãîä
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

	//ìåòîäî ñîçäàíèÿ ñïèñêà èç size - ýëåìåíòîâ
	public void dataGeneration(int size){
		while(size!=0){
			dataList.add(humanGenerate());
			size--;
		}
	}
	//çàïèñü â ôàéë çíà÷åíèé
	public void writeDataList(String fileName) {
		String s;
		StringBuilder sb= new StringBuilder();
		//àíàëîã for ñ ñ÷åò÷èêîì,
		//öèêë ïðîñòî ïåðåáåðàåò âñå ïîäðÿä îáúåêòû êëàññ HumanEntity 
		//õðàíèìûå â dataList
		for(HumanEntity he : dataList){
			s = he.getSex()+" "+he.getSurname()+" "+he.getName()+" "+he.getFathersname()+" "+he.getBirthday();
			sb.append(s);
			sb.append("\r\n");
		}
		FileWorker.write(fileName, sb);	
	}
}
