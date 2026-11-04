public class RockMusic extends Music {

    public RockMusic(String title, String artist, int duration) {
        super(title, artist, duration);
    }

    @Override
    public String getGenre() {
        return "Рок";
    }
}