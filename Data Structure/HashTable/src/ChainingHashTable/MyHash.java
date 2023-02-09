package ChainingHashTable;

public class MyHash {
    private Slot[] hashTable;

    public MyHash(int size) {
        this.hashTable = new Slot[size];
    }

    public boolean saveData(String key, String value) {
        int address = this.HashFunc(key);
        if (this.hashTable[address] != null) {
            Slot findSlot = this.hashTable[address];
            Slot prevSlot = this.hashTable[address];
            while (findSlot != null) {
                if (findSlot.key == key) {
                    findSlot.value = value;
                    return true;
                } else {
                    prevSlot = findSlot;
                    findSlot = findSlot.next;
                }
            }
            prevSlot.next = new Slot(key, value);
        } else {
            this.hashTable[address] = new Slot(key, value);
        }
        return true;
    }

    public String getData(String key) {
        int address = this.HashFunc(key);
        if (this.hashTable[address] == null) {
            return null;
        } else {
            Slot findSlot = this.hashTable[address];
            while( findSlot != null ) {
                if (findSlot.key.equals(key)) {
                    return findSlot.value;
                } else {
                    findSlot = findSlot.next;
                }
            }
        }
        return null;
    }
    public int HashFunc(String key) {
        return (int)(key.charAt(0)) % this.hashTable.length;
    }
}
