package ingeritance;

public class OverridingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer vc = new VIPCustomer(10030,"������",2000);
		vc.bonusPoint=1000;
		
				
		
		System.out.println(vc.getCustomerName()+"���� ���� �ؾ��ϴ� �ݾ���"+vc.calcPrice(10000)+"�� �Դϴ�.");
		
		
	}

}
