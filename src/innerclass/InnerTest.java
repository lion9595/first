package innerclass;

class OutClass{
	private int num = 10;
	private static int snum = 20;
	
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass{
		int inNum =100;
		//static int sInNum = 200; // 인스턴스 내부클레스에 "정적변수" 선언 불가
		
		void inTest() {
			System.out.println("OutClass num : " + num + " (외부클래스의 인스턴스 변수)");
			System.out.println("OutClass num : " + snum + " (외부클래스의 정적변수 변수)");
		}
	} // End_Inclass
	
		//static void sTest() {}  // 위의 정적변수 처럼 "정적메소드"도 정의 불가능
		public void usingClass() {
			inClass.inTest();
		}
	
} // End_OutClass 

public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스를 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();
	}

}
