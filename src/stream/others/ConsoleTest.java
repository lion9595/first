package stream.others;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console console = System.console();
		
		System.out.println("�̸� : ");
		String name = console.readLine();
		System.out.println("���� : ");
		String job = console.readLine();
		System.out.println("��й�ȣ : ");
		char[] pass = console.readPassword();			
		String strPass = new String(pass);
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
		
		
		
	}

}
