package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
		static String path = "D:\\JAVA_LAB\\a.txt";
	public Class loadClass(String fileName,String className) throws 
	FileNotFoundException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(path);
		Class c = Class.forName(className);
		
		return c;
	}
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		//test.loadClass("a.txt", "java.lang.String");
//		try {
//			test.loadClass("a.txt", "java.lang.String");
//		} catch (FileNotFoundException | ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
