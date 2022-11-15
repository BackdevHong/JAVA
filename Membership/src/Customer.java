public class Customer {
    protected int customerId;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusPointRatio;

    public Customer(int customerId, String customerName) {
        customerGrade = "SILVER";
        bonusPointRatio = 0.01;
        this.customerId = customerId;
        this.customerName = customerName;

        System.out.println("Customer(int, String) 호출됨.");
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
