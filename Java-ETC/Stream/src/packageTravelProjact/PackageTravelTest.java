package packageTravelProjact;

import java.util.ArrayList;
public class PackageTravelTest {
    public static void main(String[] args) {
        TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
        TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
        TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);

        ArrayList<TravelCustomer> travelCustomers = new ArrayList<>();
        travelCustomers.add(customerLee);
        travelCustomers.add(customerKim);
        travelCustomers.add(customerHong);

        System.out.println("===== 명단 =====");
        travelCustomers.stream()
                .forEach(customer -> System.out.println(customer.getName())); // 명단 출력

        System.out.println("===== 총 비용 =====");
        System.out.println(travelCustomers.stream()
                .mapToInt(customer -> customer.getPrice())
                .sum());

        System.out.println("===== 20세 이상 고객 출력 =====");
        travelCustomers.stream()
                .filter(customer -> customer.getAge() >= 20)
                .map(customer -> customer.getName())
                .sorted()
                .forEach(customer -> System.out.println(customer));
    }
}
