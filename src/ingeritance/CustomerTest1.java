package ingeritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint=1000;
		System.out.println(customerLee.showCustomerInfo());
		
		
		
	}

}
