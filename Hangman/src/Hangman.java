import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		//������� ������ ��� ���������� � �������
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter words to store: ");
		//��������� ������ �� ������� ������������ ���������
		String wordsInString = in.nextLine();
		//������� ������ �� ���� ��������� � ������� ���������� ������	
		String [] wordsList = wordsInString.split(" ");
		//������� �������������� ������ �� ��������
		char[][] words = new char[wordsList.length][];
		//������� �������������� ������ ����������� ���� ��� �������� �������� �� ��������� ������
		//���� �������, �� ���������� ��������������� ������� � true
		boolean[][] wordsFlags = new boolean[wordsList.length][];
		//����������� �������
		int lives = 10;
		//���� ��� ������� ���� � ������ ��������
		for(int i = 0; i<words.length; i++){
			//���������� ������ ������ ������ ��� ������ ����� ��������
			//����������� ���� � ����� �������� ����� �������� wordsList[i].length()
			words[i] = new char[wordsList[i].length()]; 	
			//���������� ���������� ������ ������� ������ ��������� ���� 								
			wordsFlags[i] = new boolean[wordsList[i].length()];
			//������� � ������ ������ ������ �������� �������������� �� ���� �� �����������
			//����� toCharArray() - ��������� ������ �� �������� �� ������
			words[i] = wordsList[i].toCharArray();			
		}
		//���� ��� ������������ ������� ������ � false �.�. ����� ��� �� ����������
		//words.length ���������� ����������� �����
		for(int i = 0; i<words.length; i++){
			//words[i].length ���������� ����������� �������� � ����� �������
			for(int j = 0; j<words[i].length; j++){
				wordsFlags[i][j]=false;
			}
		}
		//������� ��� ��������� ����� ����� �����������
		for(int i = 0; i<words.length; i++){
			System.out.print(Arrays.toString(words[i]));			
		} 
		System.out.println();	
		
		//������� ��������� ��������� �����
		Random rnd = new Random();
		//���������� ��������� ����� ����� �� 0(������������) �� words.length (�� ������������) 
		int wordIndex = rnd.nextInt(words.length);
		//������� ���������� ��������� ���������������� �����
		for(int i = 0; i<words[wordIndex].length; i++){
			System.out.print("_ ");
		}
		//���� ��������� ���� ������ ����� ����
		while(lives>0){
			// ���� ������� ��������� �� �� ��� ���� ������� ���������� ����
			boolean letterFag=false;
			System.out.print(" Enter letter: ");
			//��������� ������������ ��� ������ 
			//��������������� � ������ �������� �� ������� ����� ������ ������ �������
			char letter = in.next().toCharArray()[0];
			//���� ��� ������ ���������� ��������
			for(int i = 0; i<words[wordIndex].length; i++){
				//���� ������� ���������� ��������� ��� ���� ���������� ������� 
				//� ����������������   ����� true
				if(letter==words[wordIndex][i]){
					wordsFlags[wordIndex][i]=true;
					letterFag=true;
				}
			}
			//���� ������ ��������� �������� � �����	
			for(int i = 0; i<wordsFlags[wordIndex].length; i++){
				if(wordsFlags[wordIndex][i]==true)
					System.out.print(words[wordIndex][i]+" ");	
				else
					System.out.print("_ ");
			}
			//����� ����������� ���������� ������
			System.out.print("Lifes left "+lives);
			//���� ���� �� ������� �� ��������� ����������� ������
			if(letterFag!=true){
				lives--;
			}
			//���� ������ ��� �� ������� "GAME OVER"
			if(lives==0){
				System.out.println("GAME OVER");				
			}
		}

	}

}
