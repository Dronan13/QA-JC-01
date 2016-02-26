import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
		//—оздаем экземал€р класса HumanGenerator 
		HumanGenerator hg = new HumanGenerator();
		//вызов метода определени€ данных
		hg.setData();
		//вызов метода генерации фио
		hg.dataGeneration(300);
		//вызов метода записи сгенерированных фио
		hg.writeDataList("out.txt");
	}

}
