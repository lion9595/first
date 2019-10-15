package ingeritance;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	
	
	

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint+= price*bonusRatio;
		return price-(int)(price*saleRatio);
	}

	public VIPCustomer() {
		customerGrade ="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
		System.out.println("VIPCustomer() 생성자 호출");
	}
	
	public VIPCustomer(int customerID,String customerName, int agentID) {
		super(customerID,customerName);
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
		this.agentID=agentID;
		System.out.println("VIPCustomer(int, Sting) 생성자 호출");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	
	
}
