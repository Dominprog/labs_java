public static void main(String[] args) {
    Music m1 = new Music("Track 1", "Artist 1", 200);
    RockMusic r1 = new RockMusic("Rock 1", "Rock Band", 240);
    ClassicalMusic c1 = new ClassicalMusic("Symphony 1", "Orchestra", 600);

    m1.play();
    m1.play(3);
    m1.play(1.5);

    r1.play();
    r1.play(2);
    r1.play(2.0);

    c1.play();
    c1.play(1);
    c1.play(0.75);

    System.out.println();

    Music[] tracks = new Music[3];
    tracks[0] = m1;
    tracks[1] = r1;
    tracks[2] = c1;

    for (int i = 0; i < tracks.length; i++) {
        System.out.println(tracks[i].getTitle() + " — " + tracks[i].getGenre());
    }
}
