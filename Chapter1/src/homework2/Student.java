package homework2;

public class Student {
	String studentName;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 잔액은 " + money + "원 입니다.");
	}
	
//	여기서 부터 숙제 내용입니다.
	
	public void takeTexi(Texi texi) {
		texi.take(10000);
		this.money -= 10000;
	}
	
}
