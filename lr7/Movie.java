public class Movie {
    private String title;
    private String director;
    private int duration;

    static int totalMovies = 0;
    static int totalDuration = 0;

    public Movie(String title, String director, int duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
        totalMovies++;
        totalDuration += duration;
    }

    public static void print(Movie movie){
        System.out.println(movie.title);
        System.out.println(movie.director);
        System.out.println(movie.duration);
        System.out.println(totalMovies);
        System.out.println(totalDuration);
    }

    public String getTitle() {
        return title; }

    public void setTitle(String title) {
        this.title = title; }

    public String getDirector() {
        return director; }

    public void setDirector(String director) {
        this.director = director; }

    public int getDuration() {
        return duration; }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public static double getAverageDuration() {
        if (totalMovies == 0)
            return 0;
        return (double) totalDuration / totalMovies;
    }
}