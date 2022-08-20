package homework2;

public class Texi {
	String companyName;
	int money;
	
	public Texi(String companyName) {
		this.companyName = companyName;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void texiInfo() {
		System.out.println(companyName + " 수입은 " + money + "원 입니다.");
	}
}
