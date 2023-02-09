package LinearProbingHashTable;

public class Slot<T> {
    public String value;
    public String key;
    public Slot(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
