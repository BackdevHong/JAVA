public class VIPCustomer extends Customer{
    private double salesRatio;
    private int agentId;

    public VIPCustomer(int customerId, String customerName) {
        super(customerId, customerName);

        customerGrade = "VIP";
        bonusPointRatio = 0.05;
        salesRatio = 0.1;
        System.out.println("VIPCustomer(int, String) 호출됨.");
    }

    public int getAgentId() {
        return agentId;
    }
}
