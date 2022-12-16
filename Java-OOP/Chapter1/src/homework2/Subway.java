package homework2;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.passengerCount ++;
		this.money += money;
	}
	
	public void subwayInfo() {
		System.out.println(lineNumber + "호선의 탑승자는 " + passengerCount + "이고, 수입은 " + money + "원 입니다.");
	}
}
