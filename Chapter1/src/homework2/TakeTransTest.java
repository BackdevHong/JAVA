package homework2;

public class TakeTransTest {

	public static void main(String[] args) {
		Student James = new Student("James", 5000);
		Student Tomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		Subway greenSubway = new Subway(2);
		
		James.takeBus(bus100);
		Tomas.takeSubway(greenSubway);
		
		James.showInfo();
		Tomas.showInfo();
		
		bus100.busInfo();
		greenSubway.subwayInfo();
		
//		여기서부터 숙제 부분입니다.
		
		Student Edward = new Student("Edward", 20000);
		
		Texi texi = new Texi("잘 간다 운수택시");
		
		Edward.takeTexi(texi);
		
		Edward.showInfo();
		
		texi.texiInfo();
	}

}
