package HashCollision;

import HashTable.MyHash;

public class HashCollisionTest {
    public static void main(String[] args) {
        MyHash myHash = new MyHash(3);

        myHash.saveData("HongInSung", "Test");
        myHash.saveData("HondES", "Test2");

        System.out.println(myHash.getData("HongInSung")); // Test2가 나옴. 충돌이 일어남.
    }
}
