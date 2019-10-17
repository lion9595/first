package interfaceex;


public class CompleteCalc extends Calculater {

	@Override
	public int times(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public int devide(int num1, int num2) {
		if(num2!=0)
			return num1/num2;
		else
			return Calc.ERROR;
	}
	
	@Override
	public void description() {
		// TODO Auto-generated method stub
		super.description();
	}

	@Override
	public String square(int num1, int num2) {
		return (int)(num1 * num1) + "," + (int)(num2*num2);
	}

	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}
	
}
