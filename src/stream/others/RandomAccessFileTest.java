package stream.others;
import java.io.*;

public class RandomAccessFileTest {
	public static void main(String[] args) throws IOException{
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);
		System.out.println("���� ������ ��ġ : "+rf.getFilePointer());  
		rf.writeDouble(3.14);					//getFilePointer() : ���� ������ ��ġ�� ��ȯ�ϴ� �޼���
		System.out.println("���� ������ ��ġ : "+rf.getFilePointer());
		rf.writeUTF("�ȳ��ϼ���");
		System.out.println("���� ������ ��ġ : "+rf.getFilePointer());
		
		rf.seek(0);
		
		
		int i = rf.readInt();
		double d =rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println("���� ������ ��ġ : "+ rf.getFilePointer());
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
		//ddd
		
		
		
	}

}
