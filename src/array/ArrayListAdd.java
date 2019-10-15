package array;
import java.util.*;

public class ArrayListAdd {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList1=new ArrayList<>();
		ArrayList<Integer> arrayList2=new ArrayList<>();
		
		arrayList1.add(1);
		arrayList1.add(2); //index = 1
		arrayList1.add(3);
		arrayList1.add(4);
		arrayList1.add(5);
		
		arrayList2.add(10);
		arrayList2.add(11);
		
//		arrayList1.add(1,10);			//1번 인덱스 자리에 (0~1)사이의 자리에 10의 값을 끼워넣음		
//		arrayList1.addAll(arrayList2);	//복사할대상.addAll(값을가져올대상) 메소드를 통해 arrayList1에 arrayList2의 값을 뒤에 저장한다
//		arrayList1.remove(1);			//remove(index_Num) : 인덱스 위치의 값을 삭제
		
		List<Integer> list=arrayList1.subList(1, 3);  //subList(from_index, to_index) from에서 to이전까지  =>1번 2번 index만 가져옴
		
		for(int i:arrayList1) {
			System.out.println("value1 :"+i);
		}
		
		System.out.println();
		for(int i:arrayList2) {
			System.out.println("value2 :"+i);
		}
		for(int i:list) {
			System.out.println("subList :"+i);
		}
	
	
	}

}
