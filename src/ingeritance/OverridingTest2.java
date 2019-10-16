package ingeritance;

public class OverridingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer vc = new VIPCustomer(10030,"나몰라",2000);
		vc.bonusPoint=1000;
		
				
		
		System.out.println(vc.getCustomerName()+"님이 지불 해야하는 금액은"+vc.calcPrice(10000)+"원 입니다.");
		
		
	}

}
