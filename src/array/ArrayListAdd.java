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
		
//		arrayList1.add(1,10);			//1�� �ε��� �ڸ��� (0~1)������ �ڸ��� 10�� ���� ��������		
//		arrayList1.addAll(arrayList2);	//�����Ҵ��.addAll(���������ô��) �޼ҵ带 ���� arrayList1�� arrayList2�� ���� �ڿ� �����Ѵ�
//		arrayList1.remove(1);			//remove(index_Num) : �ε��� ��ġ�� ���� ����
		
		List<Integer> list=arrayList1.subList(1, 3);  //subList(from_index, to_index) from���� to��������  =>1�� 2�� index�� ������
		
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
