package ingeritance;

public class OverrideingTest1 {
	public static void main(String[] args) {
		Customer customerLee = new Customer(10010,"�̼���");
		customerLee.bonusPoint=1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020,"������",12345);
		customerKim.bonusPoint=10000;
		
		int price = 10000;
		System.out.println(customerLee.getCustomerName()+"���� �����ؾ��� �ݾ��� "+
				customerLee.calcPrice(price)+"�� �Դϴ�.");
		System.out.println(customerKim.getCustomerName()+"���� �����ؾ��� �ݾ��� "+
				customerKim.calcPrice(price)+"�� �Դϴ�.");
		
		
		
	}
}
