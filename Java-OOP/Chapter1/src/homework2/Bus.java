package homework2;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.passengerCount ++;
		this.money += money;
	}
	
	public void busInfo() {
		System.out.println(busNumber + "번의 탑승자는 " + passengerCount + "이고, 수입은 " + money + "원 입니다.");
	}
}

