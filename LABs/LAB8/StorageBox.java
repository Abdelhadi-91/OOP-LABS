public class StorageBox<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }

    public void displayItem() {
        System.out.println("item: "+this.item);
    }

    
}
