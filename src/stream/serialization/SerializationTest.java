package stream.serialization;
import java.io.*;

class Person{
	private static final long serialCersionUID = -1503252402544036183L;
	String name;
	String job;

	public Person(){}

	public Person(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}
	
	
	


}
public class SerializationTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Person personLee = new Person("�̼���","�屺");
		Person personKim = new Person("��ö��","���̻�");
		
		try(FileOutputStream fos = new FileOutputStream("serial.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(personLee);
			oos.writeObject(personKim);
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		try(FileInputStream fis = new FileInputStream("serial.out");
			ObjectInputStream ois = new ObjectInputStream(fis)) {
				
			Person p1 = (Person)ois.readObject();	
			Person p2 = (Person)ois.readObject();	

			System.out.println(p1);
			System.out.println(p2);
			
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
		
		
	}

}
