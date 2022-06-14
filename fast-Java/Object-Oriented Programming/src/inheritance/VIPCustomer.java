package inheritance;

public class VIPCustomer extends Customer{
    double salesRatio;
    private int agentID;

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    @Override // 에노데이션 - 컴파일러에게 오버라이드된 메서드다라는 의미를 전해준다.
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }

}
