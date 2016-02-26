import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileWorker {
	//Метод записи строки
	public static void write(String fileName, String text) {
	    //Определяем файл
	    File file = new File(fileName); 
	    try {
	        //проверяем, что если файл не существует то создаем его
	        if(!file.exists()){
	            file.createNewFile();
	        } 
	        //PrintWriter обеспечит возможности записи в файл
	        PrintWriter out = new PrintWriter(file.getAbsoluteFile()); 
	        try {
	            //Записываем текст у файл
	            out.print(text);
	        } finally {
	            //После чего мы должны закрыть файл
	            //Иначе файл не запишется
	            out.close();
	        }
	    } catch(IOException e) {
	        throw new RuntimeException(e);
	    }
	}
	//Метод записи StringBuilder"а
	public static void write(String fileName, StringBuilder text) {
	    //Определяем файл
	    File file = new File(fileName); 
	    try {
	        //проверяем, что если файл не существует то создаем его
	        if(!file.exists()){
	            file.createNewFile();
	        } 
	        //PrintWriter обеспечит возможности записи в файл
	        PrintWriter out = new PrintWriter(file.getAbsoluteFile()); 
	        try {
	            //Записываем текст у файл
	            out.print(text);
	        } finally {
	            //После чего мы должны закрыть файл
	            //Иначе файл не запишется
	            out.close();
	        }
	    } catch(IOException e) {
	        throw new RuntimeException(e);
	    }
	}
	
	public static ArrayList<String> read(String fileName) throws FileNotFoundException {
		/*ArrayList - автоматически расширяемый массив. 
		 * Вы можете работать с массивом, но при этом не 
		 * используются квадратные скобки.
		 */
		ArrayList<String> strList = new ArrayList<String>();
	    File file = new File(fileName);
	    if(file.exists()){
	    	try {
		        //Объект для чтения файла в буфер
		        BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
		        try {
		            //В цикле построчно считываем файл
		            String s;
		            while ((s = in.readLine()) != null) {
		            	strList.add(s);
		            }
		        } finally {
		            //Также не забываем закрыть файл
		            in.close();
		        }
		    } catch(IOException e) {
		        throw new RuntimeException(e);
		    }	
        } 
	    //Возвращаем полученный список с файла
	    return strList;
	}
}
