package chapter9.Q5;
import java.nio.file.WatchService;
import java.util.ArrayList;

public class CarTest {
	public static void main(String[] args) {
		ArrayList<Car> CarList = new ArrayList<Car>();
		
		CarList.add(new Sonata());
		CarList.add(new Grandeur());
		CarList.add(new Avante());
		CarList.add(new Genesis());
		
		for(Car car : CarList) {
			car.run();
			car.washCar();
			System.out.println("============================");
		}
	}

	
}
