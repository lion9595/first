package string;

public class StringTest1 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.print("��ü ���� str1,2  �ּ�  ��  : ");
		System.out.println(str1 == str2);
		System.out.println("��ü ���� str1,2 ���� �� ��  : " + str1.equals(str2));
		
		System.out.println();  //�ٹٲٱ�

		String str3 = "abc";
		String str4 = "abc";
		
		//���Ǯ(constant pool) : str3,4 ó�� "abc"���ڿ��� �޸𸮿� �Ҵ�ǰ� "�� �ּҸ� ����"
		System.out.print("��� Ǯ ��� str1,2  �ּ�   ��  : ");
		System.out.println(str3 == str4);
		System.out.println("��� Ǯ ��� str1,2 ���� �� ��  : " + str3.equals(str4));
		
		
		
	}

}
