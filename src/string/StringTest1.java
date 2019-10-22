package string;

public class StringTest1 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.print("객체 생성 str1,2  주소  비교  : ");
		System.out.println(str1 == str2);
		System.out.println("객체 생성 str1,2 내부 값 비교  : " + str1.equals(str2));
		
		System.out.println();  //줄바꾸기

		String str3 = "abc";
		String str4 = "abc";
		
		//상수풀(constant pool) : str3,4 처럼 "abc"문자열이 메모리에 할당되고 "그 주소를 대입"
		System.out.print("상수 풀 사용 str1,2  주소   비교  : ");
		System.out.println(str3 == str4);
		System.out.println("상수 풀 사용 str1,2 내부 값 비교  : " + str3.equals(str4));
		
		
		
	}

}
