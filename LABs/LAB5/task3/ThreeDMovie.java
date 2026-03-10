public class ThreeDMovie extends Movie {
    boolean glassesRequired;

    public ThreeDMovie(int id, String title, int duration,boolean glassesRequired){
        super(id, title, duration);
        this.glassesRequired = glassesRequired;
    }

    public String info() {
        return super.info()+", glasses required: "+(glassesRequired? "yes" : "no");
    }
}
