package customer;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010,"이순신");
        Customer customerKim = new Customer(10020,"김택준");
        Customer customerHong = new GoldCustomer(10030,"홍인성");
        Customer customerTak = new GoldCustomer(10040,"귀여운");
        Customer customerjun = new VIPCustomer(10050,"뙈지몬",1234);

        customerLee.bonusPoint = 10000;
        customerKim.bonusPoint = 10000;
        customerHong.bonusPoint = 10000;
        customerTak.bonusPoint = 10000;
        customerjun.bonusPoint = 10000;

        ArrayList<Customer> customerList = new ArrayList<Customer>();
        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHong);
        customerList.add(customerTak);
        customerList.add(customerjun);

        for ( Customer customer : customerList ){
            customer.calcPrice(10000);
            System.out.println(customer.showCustomerInfo() + " 지불한 금액은 " + customer.calcPrice(10000) + "원 입니다.");
        }
    }
}
