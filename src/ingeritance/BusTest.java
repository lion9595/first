package ingeritance;

public class BusTest {

	public static void main(String[] args) {
		Car car = new Bus();
		car.run();
		
		Bus bus=(Bus)car;  //type을 Bus로 강제 변환 시켜 주어야함
		bus.ppangppang();
		
		
	}

}
