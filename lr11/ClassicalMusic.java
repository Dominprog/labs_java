public class ClassicalMusic extends Music {

    public ClassicalMusic(String title, String artist, int duration) {
        super(title, artist, duration);
    }

    @Override
    public String getGenre() {
        return "Классика";
    }
}