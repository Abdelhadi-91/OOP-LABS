public class Magazine extends LibraryItem {

    public Magazine(String title, String author, int year) {
        super(title, author, year);
    }
    
    @Override
    public void displayInfo(){
        System.out.println("type: magazine");
        System.out.println("title: "+this.title);
        System.out.println("author: "+this.author);
        System.out.println("year: "+this.year);
    }
}
