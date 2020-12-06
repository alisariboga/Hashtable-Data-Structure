public class Entry {
    int key;
    Object value;
    Entry next;

    public Entry() {
        next = null;
    }

    public Entry(int key, Object value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    public int getValue() {
        return key;
    }

    public Object getKey() {
        return value;
    }
}
