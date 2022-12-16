package homework3;

public class CarFactory {
	private static CarFactory instance =  new CarFactory();
	public static int CarNumber = 10000;
	
	private CarFactory() {
		
	}
	
	public static CarFactory getInstance() {
		if (instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	public Car createCar() {
		Car car = new Car();
		return car;
	}
	
	
}


