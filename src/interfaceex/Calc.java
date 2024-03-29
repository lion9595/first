package interfaceex;

public interface Calc 
{
	double PI = 3.14;
	int ERROR = -9999999;
	
	int add(int num1,int num2);
	int substract(int num1,int num2);
	int times(int num1,int num2);
	int devide(int num1,int num2);
	String square(int num1,int num2);
	
	
	default void description() 
	{
		System.out.println("정수 계산기를 구현합니다.");
		myMethod();
	}

	
	static int total(int[] arr)
	{
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		myStaticMethod();
		return total;	
	}
	
	static void myMethod() {
		System.out.println("private 메서드 입니다.");
	}
	
	static void myStaticMethod() {
		System.out.println("private static 메서드 입니다.");
	}
	

}

