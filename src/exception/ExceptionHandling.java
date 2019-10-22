package exception;
import java.io.FileInputStream;
import java.lang.Exception;


public class ExceptionHandling {
	static String path = "D:\\JAVA_LAB\\a.txt";
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream(path);
	
	//	System.out.println(fis);
		fis.close();
			
	}

}
