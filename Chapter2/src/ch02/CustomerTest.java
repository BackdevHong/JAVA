package ch02;

public class CustomerTest {
	public static void main(String[] args) {
//		Customer customerLee = new Customer();
//		customerLee.setCustomerName("이순신");
//		customerLee.setCustomerID(10010);
//		customerLee.bonusPoint = 1000;
//		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerHong = new VIPCustomer();
		customerHong.setCustomerName("홍인성");
		customerHong.setCustomerID(10020);
		customerHong.bonusPoint = 10000;
		System.out.println(customerHong.showCustomerInfo());
	}
}
