package ingeritance;

public class BusTest {

	public static void main(String[] args) {
		Car car = new Bus();
		car.run();
		
		Bus bus=(Bus)car;  //type�� Bus�� ���� ��ȯ ���� �־����
		bus.ppangppang();
		
		
	}

}
