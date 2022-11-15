import customer.Customer;
import customer.GoldCustomer;
import customer.VIPCustomer;

public class MembershipTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;

        System.out.println(customerLee.CalcPrice(10000));

        VIPCustomer customerKim= new VIPCustomer(10020, "김유신");
        customerKim.bonusPoint = 1000;

        System.out.println(customerKim.CalcPrice(10000));

        Customer vc = new VIPCustomer(12345, "noname");
        vc.bonusPoint = 0;

        System.out.println(vc.CalcPrice(10000));

        Customer customerHong = new GoldCustomer(10030, "홍인성");
        customerHong.bonusPoint = 0;

        System.out.println(customerHong.CalcPrice(10000));

        System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerKim.showCustomerInfo());
        System.out.println(vc.showCustomerInfo());
        System.out.println(customerHong.showCustomerInfo());
    }
}
