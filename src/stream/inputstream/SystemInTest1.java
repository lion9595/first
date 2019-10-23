package stream.inputstream;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) throws IOException{
		// 알파벳 입력 엔터
		System.out.println("입력 : ");
		int i;
		try {
			i=System.in.read();
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
