import client.AClazz;
import client.BClazz;

public class Main {
    public static void main(String[] args) {
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        System.out.println("두 객체가 똑같을까?");
        System.out.println(aClazz.getSocketClient().equals(bClazz.getSocketClient()));
    }
}