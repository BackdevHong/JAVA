public class MembershipTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;

        VIPCustomer customerKim= new VIPCustomer(10020, "김유신");
        customerKim.bonusPoint = 1000;

        System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerKim.showCustomerInfo());

        Customer vc = new VIPCustomer(0, "no-name");

        System.out.println(vc.showCustomerInfo());
    }
}
