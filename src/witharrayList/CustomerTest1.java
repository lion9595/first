package witharrayList;
import java.util.ArrayList;
import polymorphism.Customer;
import polymorphism.VIPCustomer;


public class CustomerTest1 {
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010,"�̼���");
		Customer customerShin = new Customer(10020,"�Ż��Ӵ�");
		Customer customerhong = new Customer(10030,"ȫ�浿");
		Customer customerYoul = new Customer(10040,"������");
		Customer customerKim = new VIPCustomer(10050,"������",12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerhong);
		customerList.add(customerYoul);
		customerList.add(customerKim);
		
		System.out.println("==== �� ���� ��� ====");
		for(Customer customer : customerList)
			System.out.println(customer.showCustomerInfo());
		
		System.out.println("==== �������� ���ʽ� ����Ʈ ��� ====");
		int price = 1000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + " ���� " + cost +
					"�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName() + " ���� ���� ���ʽ� ����Ʈ�� "
					+ customer.getBonusPoint() +"�� �����ϼ̽��ϴ�.");
		}
		
	}
}
