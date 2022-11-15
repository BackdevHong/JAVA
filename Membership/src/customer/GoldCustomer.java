package customer;

public class GoldCustomer extends Customer{

    private double salesRatio;
    public GoldCustomer(int customerId, String customerName) {
        super(customerId, customerName);
        customerGrade = "GOLD";
        salesRatio = 0.1;
        bonusPointRatio = 0.02;
    }

    @Override
    public int CalcPrice(int price) {
        bonusPoint += price * bonusPointRatio;
        price -= (int) (price * salesRatio);
        return price;
    }
}
