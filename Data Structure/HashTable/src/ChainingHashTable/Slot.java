package ChainingHashTable;

public class Slot<T> {
    public String key;
    public String value;
    public Slot next;

    public Slot(String key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
