public static void main(String[] args) {
    SportGame[] games = new SportGame[5];

    games[0] = new Football("Матч 1", 22, 90, 3);
    games[1] = new Football("Матч 2", 22, 90, 1);
    games[2] = new Football("Матч 3", 22, 90, 5);
    games[3] = new Basketball("Игра 1", 10, 40, 4);
    games[4] = new Basketball("Игра 2", 10, 40, 4);

    for (int i = 0; i < games.length; i++) {
        games[i].displayInfo();
        System.out.println("Правила: " + games[i].getRules());
        System.out.println("Очки: " + games[i].getScore());
        System.out.println();
    }
}