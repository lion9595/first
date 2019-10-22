package exception;


 public class AutoCloseTest {
	public static void main(String[] args) {
		
		try(AutoCloseObj obj = new AutoCloseObj()){
		throw new Exception();
		}
		catch(Exception e) {
			System.out.println("���� �κ��Դϴ�.");
		}
	
	}
}


// ******************************************************************************

/*
//java 8����
public class AutoCloseTest {
	public static void main(String[] args) {
		AutoCloseObj obj = new AutoCloseObj();
		try(AutoCloseObj obj2 = obj){ //java 8���ϴ� obj2(�ٸ�����������)�� �ٽ� �����ؾ���
		throw new Exception();
		}
		catch(Exception e) {
			System.out.println("���� �κ��Դϴ�.");
		}
	
	}
}
*/

//******************************************************************************

/*
//java 9 �̻�
public class AutoCloseTest {
	public static void main(String[] args) {
		AutoCloseObj obj = new AutoCloseObj();
		try(obj){ //java 9 ���ʹ� �缱�� ���� obj�״�� ���
		throw new Exception();
		}
		catch(Exception e) {
			System.out.println("���� �κ��Դϴ�.");
		}
	
	}
}
*/
