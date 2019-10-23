package stream.others;
import java.io.*;

public class RandomAccessFileTest {
	public static void main(String[] args) throws IOException{
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);
		System.out.println("파일 포인터 위치 : "+rf.getFilePointer());  
		rf.writeDouble(3.14);					//getFilePointer() : 파일 포인터 위치를 반환하는 메서드
		System.out.println("파일 포인터 위치 : "+rf.getFilePointer());
		rf.writeUTF("안녕하세요");
		System.out.println("파일 포인터 위치 : "+rf.getFilePointer());
		
		rf.seek(0);
		
		
		int i = rf.readInt();
		double d =rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println("파일 포인터 위치 : "+ rf.getFilePointer());
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
		//ddd
		
		
		
	}

}
