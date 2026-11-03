public static void main(String[] args) {
        Movie m1 = new Movie("Фильм 1", "Режиссёр 1", 120);
        Movie m2 = new Movie("Фильм 2", "Режиссёр 2", 90);
        Movie m3 = new Movie("Фильм 3", "Режиссёр 3", 150);
        Movie m4 = new Movie("Фильм 4", "Режиссёр 4", 100);

        System.out.println("Всего фильмов: " + Movie.totalMovies);
        System.out.println("Общая длительность: " + Movie.totalDuration);
        System.out.println("Средняя длительность: " + Movie.getAverageDuration());
}