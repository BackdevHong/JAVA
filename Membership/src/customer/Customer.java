package customer;

public class Customer {
    protected int customerId;
    protected String customerName;
    protected String customerGrade;
    public int bonusPoint;
    protected double bonusPointRatio;

    public Customer(int customerId, String customerName) {
        customerGrade = "SILVER";
        bonusPointRatio = 0.01;
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public int CalcPrice(int price) {
        bonusPoint += price * bonusPointRatio;
        return price;
    }

    public String showCustomerInfo() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerGrade='" + customerGrade + '\'' +
                ", bonusPoint=" + bonusPoint +
                '}';
    }

}
