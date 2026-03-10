import java.util.ArrayList;

public class Cinema {
    String name;
    ArrayList<Screen> screens;
    ArrayList<Movie> movies;

    public Cinema(String name) {
        this.name = name;
        this.screens = new ArrayList<>();
        this.movies = new ArrayList<>();
    }

    public boolean addMovie(Movie m) {
        movies.add(m);
        System.out.println("Movie of id "+m.id+" added");
        return true;
    }

    public boolean removeMovieById(int id) {
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).id==id) {
                movies.remove(i);
                System.out.println("Movie of id "+id+" removed");
                return true;
            }
        }
        System.out.println("Movie of id "+id+" not found");
        return false;
    }

    public int totalDurationMin() {
        int sum = 0;
        for (Movie movie : movies) {
            sum += movie.duration;
        }
        return sum;
    }

    public void printMovies() {
        for (Movie movie : movies) {
            System.err.println("id: " + movie.id + ", title: " + movie.title + ", duration: " + movie.duration);
        }
    }

    public boolean addScreen(Screen s) {
        screens.add(s);
        System.out.println("Screen of number "+s.screenNumber+" added");
        return true;
    }

    public void printScreens() {
        for (Screen screen : screens) {
            System.err.println("number: " + screen.screenNumber + ", capacity: " + screen.capacity);
        }
    }
}
