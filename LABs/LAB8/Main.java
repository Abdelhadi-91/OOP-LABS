public class Main {
    public static void main(String[] args) {
        LibraryItem i1 = new Book("Kirak", "ana", 2020);
        LibraryItem i2 = new Book("Salam", "howa", 2024);

        LibraryItem i3 = new Magazine("Lyoma", "machiAna", 2023);
        LibraryItem i4 = new Magazine("Ghadwa", "golWlh", 2018);

        Library library = new Library();

        try {
            library.addItem(i1);
            library.addItem(i2);
            library.addItem(i3);
            library.addItem(i4);

            library.addItem(i4);
        } catch (DuplicateItemException e) {
            System.out.println("Error: "+e.getMessage());
        }

        System.out.println("before sorting-----------------------------------------");
        library.displayAllItems();

        library.sortItems();
        System.out.println("after sorting-----------------------------------------");
        library.displayAllItems();

        System.out.println("TASK 2----------------------------------------------------------");
        StorageBox<String> s1 = new StorageBox<>();
        StorageBox<Integer> s2 = new StorageBox<>();
        StorageBox<Book> s3 = new StorageBox<>();

        s1.setItem("Salam");
        s2.setItem(91);
        Book book = new Book("QCM", "him", 2020);
        s3.setItem(book);

        s1.displayItem();
        s2.displayItem();
        s3.displayItem();


        
    }
}
