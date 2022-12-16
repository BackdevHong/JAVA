package customer;

public class VIPCustomer extends Customer{
    private double salesRatio;
    private int agentId;

    public VIPCustomer(int customerId, String customerName) {
        super(customerId, customerName);

        customerGrade = "VIP";
        bonusPointRatio = 0.05;
        salesRatio = 0.1;
    }

    @Override
    public int CalcPrice(int price) {
        bonusPoint += price * bonusPointRatio;
        price -= (int) (price * salesRatio);
        return price;
    }


    public int getAgentId() {
        return agentId;
    }
}
