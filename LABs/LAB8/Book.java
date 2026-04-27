public class Book extends LibraryItem {

    public Book(String title, String author, int year) {
        super(title, author, year);
    }
    
    @Override
    public void displayInfo(){
        System.out.println("type: book");
        System.out.println("title: "+this.title);
        System.out.println("author: "+this.author);
        System.out.println("year: "+this.year);
    }

    @Override
    public String toString() {
        return "type: book, title: "+title+", author: "+author+", year: "+year;
    }

    

    
    
}
