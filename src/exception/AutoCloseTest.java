package exception;


 public class AutoCloseTest {
	public static void main(String[] args) {
		
		try(AutoCloseObj obj = new AutoCloseObj()){
		throw new Exception();
		}
		catch(Exception e) {
			System.out.println("예외 부분입니다.");
		}
	
	}
}


// ******************************************************************************

/*
//java 8이하
public class AutoCloseTest {
	public static void main(String[] args) {
		AutoCloseObj obj = new AutoCloseObj();
		try(AutoCloseObj obj2 = obj){ //java 8이하는 obj2(다른참조변수로)를 다시 선언해야함
		throw new Exception();
		}
		catch(Exception e) {
			System.out.println("예외 부분입니다.");
		}
	
	}
}
*/

//******************************************************************************

/*
//java 9 이상
public class AutoCloseTest {
	public static void main(String[] args) {
		AutoCloseObj obj = new AutoCloseObj();
		try(obj){ //java 9 부터는 재선언 없이 obj그대로 사용
		throw new Exception();
		}
		catch(Exception e) {
			System.out.println("예외 부분입니다.");
		}
	
	}
}
*/
