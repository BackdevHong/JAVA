package shop;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy();
        customer.order();
        customer.sell();
        customer.sayHello();

        Buy buyer = customer;
        buyer.buy();
        buyer.order();

        Sell seller = customer;
        seller.sell();
        seller.order();
    }
}
