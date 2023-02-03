package HashTable;

public class MyHashTest {
    public static void main(String[] args) {
        MyHash myHash = new MyHash(20);

        myHash.saveData("Hong", "01057009900");
        myHash.saveData("Jubg", "01034569876");

        System.out.println(myHash.getData("Hong"));
    }
}
