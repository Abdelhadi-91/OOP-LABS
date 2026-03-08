public class TransactionLog {

    Transaction[] entries;
    int size;
    int capacity;

    public TransactionLog(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.entries = new Transaction[capacity];
    }

    public void add(Transaction t) {
        if (size < capacity) {
            entries[size] = t;
            size++;
        } else {
            System.out.println("Transaction Logs are full");
        }
    }

    public Transaction get(int i) {
        if (i < size && i >= 0) {
            return entries[i];
        }
        return null;
    }

    public int count() {
        return size;
    }
}
