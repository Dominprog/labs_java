public class Music {
    private String title;
    private String artist;
    private int duration;

    public Music(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void play() {
        System.out.println("Играет музыка");
    }

    public void play(int repeat) {
        System.out.println("Играет " + repeat + " раз");
    }

    public void play(double speed) {
        System.out.println("Играет со скоростью " + speed);
    }

    public String getGenre() {
        return "Неизвестный жанр";
    }
}