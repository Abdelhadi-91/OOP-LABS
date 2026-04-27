import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Library {
    
    private ArrayList<LibraryItem> items;

    public Library(){
        this.items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) throws DuplicateItemException{
        if (items.contains(item)) {
            throw new DuplicateItemException("Item already exists");
        }
        items.add(item);
    }

    public void displayAllItems(){
        Iterator<LibraryItem> iterator = items.iterator();

        while (iterator.hasNext()) {
            LibraryItem item = iterator.next();
            item.displayInfo();
            System.out.println("-------");
        }
    }

    public void sortItems() {
        Collections.sort(items);
    }


}
