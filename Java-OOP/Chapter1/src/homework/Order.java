package homework;

public class Order {
	public long orderId;
	public int orderPhoneNumber;
	public String address;
	public int orderDate;
	public int orderTime;
	public int orderPrice;
	public int orderMenuId;

	public Order(long orderId, int orderPhoneNumber, String address, int orderDate, int orderTime, int orderPrice,
			int orderMenuId) {
		this.orderId = orderId;
		this.orderPhoneNumber = orderPhoneNumber;
		this.address = address;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderPrice = orderPrice;
		this.orderMenuId = orderMenuId;
	}

	public String getOrder() {
		return orderId + "\n" + orderPhoneNumber + "\n" + address + "\n" + orderDate + "\n" + orderTime + "\n"
				+ orderPrice + "\n" + orderMenuId;
	}
}