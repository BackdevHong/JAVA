package shoping;

public class ClientTest {
    public static void main(String[] args) {
        Client client = new Client();
        client.orderNumber = "201907210001";
        client.clientID = "abc123";
        client.orderDate = "2019년 7월 21일";
        client.clientName = "홍길순";
        client.orderID = "PD0345-12";
        client.orderAddress = "서울시 영등포구 여의도동 20번지";

        System.out.println("주문 번호 :" + client.orderNumber);
        System.out.println("주문자 아이디 :" + client.clientID);
        System.out.println("주문 날짜 :" + client.orderDate);
        System.out.println("주문자 이름 :" + client.clientName);
        System.out.println("주문 상품 번호 :" + client.orderID);
        System.out.println("배송 주소 :" + client.orderAddress);


    }
}
