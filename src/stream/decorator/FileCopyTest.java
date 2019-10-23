package stream.decorator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
	public static void main(String[] args) {
		long millisecond = 0;
		try(FileInputStream fis = new FileInputStream("a.zip");
			FileOutputStream fos = new FileOutputStream("copy.zip")) {
			millisecond = System.currentTimeMillis(); //파일을 복사하기 전 시간
			int i;
			while((i=fis.read())!=-1) {
				fos.write(i);
			}
			millisecond = System.currentTimeMillis() - millisecond;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("파일을 복사 하는데 걸린 시간 : "+millisecond + "millisecond 소요 되었습니다.");
		
	}

}
