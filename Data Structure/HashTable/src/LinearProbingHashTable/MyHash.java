package LinearProbingHashTable;

public class MyHash {
    private Slot[] hashTable;

    public MyHash(int size) {
        this.hashTable = new Slot[size];
    }

    public boolean saveData(String key, String value) {
        int address = this.HashFunc(key);
        if (this.hashTable[address] != null) {
            if (this.hashTable[address].key.equals(key)) {
                this.hashTable[address].value = value;
                return true;
            } else {
                int currentAddress = address + 1;
                while (this.hashTable[currentAddress] != null) {
                    if (this.hashTable[currentAddress].key.equals(key)) {
                        this.hashTable[currentAddress].value = value;
                    } else {
                        currentAddress++;
                        if (currentAddress >= this.hashTable.length) {
                            return false;
                        }
                    }
                }
                this.hashTable[currentAddress] = new Slot(key, value);
                return true;
            }
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
            if (this.hashTable[address].key.equals(key)) {
                return this.hashTable[address].value;
            } else {
                int currentAddress = address + 1;
                while (this.hashTable[currentAddress] != null) {
                    if (this.hashTable[currentAddress].key.equals(key)) {
                        return this.hashTable[currentAddress].value;
                    } else {
                        currentAddress++;
                        if (currentAddress >= this.hashTable.length) {
                            return null;
                        }
                    }
                }
            }
        }
        return null;
    }
    public int HashFunc(String key) {
        return (int)(key.charAt(0)) % this.hashTable.length;
    }
}
