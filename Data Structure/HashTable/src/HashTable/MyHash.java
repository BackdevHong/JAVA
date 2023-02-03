package HashTable;

public class MyHash {
    private Slot[] hashTable;

    public MyHash(int size) {
        this.hashTable = new Slot[size];
    }

    public boolean saveData(String key, String value) {
        int address = this.HashFunc(key);
        if (this.hashTable[address] != null) {
            this.hashTable[address].value = value;
        } else {
            this.hashTable[address] = new Slot(value);
        }
        return true;
    }

    public String getData(String key) {
        int address = this.HashFunc(key);
        if (this.hashTable[address] == null) {
            return null;
        } else {
            return this.hashTable[address].value;
        }
    }
    public int HashFunc(String key) {
        return (int)(key.charAt(0)) % this.hashTable.length;
    }
}
