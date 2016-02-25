import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		//создаем сканер для считывания с консоли
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter words to store: ");
		//считываем строку со словами разделенными пробелами
		String wordsInString = in.nextLine();
		//создаем массив из слов используя в ачестве раделителя пробел	
		String [] wordsList = wordsInString.split(" ");
		//создаем несиметрричный массив из символов
		char[][] words = new char[wordsList.length][];
		//создаем несиметрричный массив логического типа для хранения сведений об угаданных буквах
		//если угадали, то установили соответствующий элемент в true
		boolean[][] wordsFlags = new boolean[wordsList.length][];
		//колличество попыток
		int lives = 10;
		//цикл для перевод слов в массив символов
		for(int i = 0; i<words.length; i++){
			//определяем размер каждой строки под каждое слово отдельно
			//колличество букв в слове получаем через коммадну wordsList[i].length()
			words[i] = new char[wordsList[i].length()]; 	
			//аналогично определяем размер массива флагов найденных букв 								
			wordsFlags[i] = new boolean[wordsList[i].length()];
			//заносим в каждую строку массив символов сформированный из слов по отдельности
			//метод toCharArray() - формирует массив из символов из строки
			words[i] = wordsList[i].toCharArray();			
		}
		//цикл для изначального задания флагов в false т.к. буквы еще не определены
		//words.length возвращает колличество строк
		for(int i = 0; i<words.length; i++){
			//words[i].length возвращает колличество символов с троке массива
			for(int j = 0; j<words[i].length; j++){
				wordsFlags[i][j]=false;
			}
		}
		//выводит все введенные слова после распознания
		for(int i = 0; i<words.length; i++){
			System.out.print(Arrays.toString(words[i]));			
		} 
		System.out.println();	
		
		//создаем генератор случайных чисел
		Random rnd = new Random();
		//генерируем случайное целое число от 0(включительно) до words.length (не включительно) 
		int wordIndex = rnd.nextInt(words.length);
		//выводим количество пропусков соответствующего слова
		for(int i = 0; i<words[wordIndex].length; i++){
			System.out.print("_ ");
		}
		//цикл действует пока жизней более нуля
		while(lives>0){
			// флаг который указывает на то что было найдено совпадение букв
			boolean letterFag=false;
			System.out.print(" Enter letter: ");
			//введенное воспринемаем как строку 
			//преобразованную в массив символов из которой взяли только первый элемент
			char letter = in.next().toCharArray()[0];
			//цикл для поиска совпадений символов
			for(int i = 0; i<words[wordIndex].length; i++){
				//если найдено совпадение указываем что флаг найденного символа 
				//и соответствующего   равен true
				if(letter==words[wordIndex][i]){
					wordsFlags[wordIndex][i]=true;
					letterFag=true;
				}
			}
			//цыкл вывода найденных символов в слове	
			for(int i = 0; i<wordsFlags[wordIndex].length; i++){
				if(wordsFlags[wordIndex][i]==true)
					System.out.print(words[wordIndex][i]+" ");	
				else
					System.out.print("_ ");
			}
			//вывод колличества оставшихся жизней
			System.out.print("Lifes left "+lives);
			//если букв не найдено то уменьшаем колличество жизней
			if(letterFag!=true){
				lives--;
			}
			//если жизней нет то выводим "GAME OVER"
			if(lives==0){
				System.out.println("GAME OVER");				
			}
		}

	}

}
