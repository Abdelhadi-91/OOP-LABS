public class RegularMovie extends Movie {
    String ageRating;

    public RegularMovie(int id, String title, int duration, String ageRating){
        super(id, title, duration);
        this.ageRating = ageRating;
    }

    public String info() {
        return super.info()+", age rating: "+ageRating;
    }
}
