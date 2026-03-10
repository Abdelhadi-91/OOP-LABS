public class Movie {
    int id;
    String title;
    int duration;

    public Movie(int id, String title, int duration) {
        this.title = title;
        this.id = id;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public int duration() {
        return duration;
    }

    public String info(){
        return "id: " + id + ", title: " + title + ", duration: " + duration;
    }

}
