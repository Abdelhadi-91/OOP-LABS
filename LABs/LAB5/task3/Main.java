public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema("Makerra");
        Movie m0 = new RegularMovie(0, "The hobbit", 156, "10");
        Movie m1 = new ThreeDMovie(1, "Venom", 120, false);
        Movie m2 = new RegularMovie(2, "Fast X", 132, "18");
        Movie m3 = new ThreeDMovie(3, "The matrix", 144, true);
        Screen s1 = new Screen(1, 10);
        Screen s2 = new Screen(2, 100);

        cinema.addMovie(m0);
        cinema.addMovie(m1);
        cinema.addMovie(m2);
        cinema.addMovie(m3);
        System.out.println("---");

        cinema.addScreen(s1);
        cinema.addScreen(s2);
        System.out.println("---");

        cinema.printScreens();
        System.out.println("---");
        cinema.printMovies();
        System.out.println("---");
        System.out.println("Movies duration: "+cinema.totalDurationMin()+"min");
        System.out.println("---");

        boolean r1 = cinema.removeMovieById(2);
        boolean r2 = cinema.removeMovieById(3);
        boolean r3 = cinema.removeMovieById(44);
        System.out.println("---");
        cinema.printMovies();
        



    }
}
