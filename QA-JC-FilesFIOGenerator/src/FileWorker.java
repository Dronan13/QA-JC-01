import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileWorker {
	//����� ������ ������
	public static void write(String fileName, String text) {
	    //���������� ����
	    File file = new File(fileName); 
	    try {
	        //���������, ��� ���� ���� �� ���������� �� ������� ���
	        if(!file.exists()){
	            file.createNewFile();
	        } 
	        //PrintWriter ��������� ����������� ������ � ����
	        PrintWriter out = new PrintWriter(file.getAbsoluteFile()); 
	        try {
	            //���������� ����� � ����
	            out.print(text);
	        } finally {
	            //����� ���� �� ������ ������� ����
	            //����� ���� �� ���������
	            out.close();
	        }
	    } catch(IOException e) {
	        throw new RuntimeException(e);
	    }
	}
	//����� ������ StringBuilder"�
	public static void write(String fileName, StringBuilder text) {
	    //���������� ����
	    File file = new File(fileName); 
	    try {
	        //���������, ��� ���� ���� �� ���������� �� ������� ���
	        if(!file.exists()){
	            file.createNewFile();
	        } 
	        //PrintWriter ��������� ����������� ������ � ����
	        PrintWriter out = new PrintWriter(file.getAbsoluteFile()); 
	        try {
	            //���������� ����� � ����
	            out.print(text);
	        } finally {
	            //����� ���� �� ������ ������� ����
	            //����� ���� �� ���������
	            out.close();
	        }
	    } catch(IOException e) {
	        throw new RuntimeException(e);
	    }
	}
	
	public static ArrayList<String> read(String fileName) throws FileNotFoundException {
		/*ArrayList - ������������� ����������� ������. 
		 * �� ������ �������� � ��������, �� ��� ���� �� 
		 * ������������ ���������� ������.
		 */
		ArrayList<String> strList = new ArrayList<String>();
	    File file = new File(fileName);
	    if(file.exists()){
	    	try {
		        //������ ��� ������ ����� � �����
		        BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
		        try {
		            //� ����� ��������� ��������� ����
		            String s;
		            while ((s = in.readLine()) != null) {
		            	strList.add(s);
		            }
		        } finally {
		            //����� �� �������� ������� ����
		            in.close();
		        }
		    } catch(IOException e) {
		        throw new RuntimeException(e);
		    }	
        } 
	    //���������� ���������� ������ � �����
	    return strList;
	}
}
