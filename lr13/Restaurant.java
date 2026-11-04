public class Restaurant {
    private String name;
    private String cuisine;
    private int rating;
    private int priceLevel;
    private String address;
    private int availableTables;

    public Restaurant(String name, String cuisine, int rating, int priceLevel, String address, int availableTables)
            throws InvalidRestaurantDataException {
        setName(name);
        setCuisine(cuisine);
        setRating(rating);
        setPriceLevel(priceLevel);
        setAddress(address);
        setAvailableTables(availableTables);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidRestaurantDataException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidRestaurantDataException("Название не может быть пустым");
        }
        this.name = name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) throws InvalidRestaurantDataException {
        if (cuisine == null || cuisine.trim().isEmpty()) {
            throw new InvalidRestaurantDataException("Кухня не может быть пустой");
        }
        this.cuisine = cuisine;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) throws InvalidRestaurantDataException {
        if (rating < 1 || rating > 5) {
            throw new InvalidRestaurantDataException("Рейтинг должен быть от 1 до 5");
        }
        this.rating = rating;
    }

    public int getPriceLevel() {
        return priceLevel;
    }

    public void setPriceLevel(int priceLevel) throws InvalidRestaurantDataException {
        if (priceLevel < 1 || priceLevel > 3) {
            throw new InvalidRestaurantDataException("Уровень цен должен быть от 1 до 3");
        }
        this.priceLevel = priceLevel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws InvalidRestaurantDataException {
        if (address == null || address.trim().isEmpty()) {
            throw new InvalidRestaurantDataException("Адрес не может быть пустым");
        }
        this.address = address;
    }

    public int getAvailableTables() {
        return availableTables;
    }

    public void setAvailableTables(int availableTables) throws InvalidRestaurantDataException {
        if (availableTables < 0) {
            throw new InvalidRestaurantDataException("Количество столиков не может быть отрицательным");
        }
        this.availableTables = availableTables;
    }

    public void bookTable(int persons) throws BookingException {
        if (persons <= 0) {
            throw new BookingException("Количество человек должно быть больше 0");
        }
        if (availableTables <= 0) {
            throw new BookingException("Нет свободных столиков в ресторане " + name);
        }
        availableTables = availableTables - 1;
        System.out.println("Забронирован столик на " + persons + " чел. в ресторане " + name + ". Осталось: " + availableTables);
    }

    public void updateRating(int newRating) throws InvalidRestaurantDataException {
        if (newRating < 1 || newRating > 5) {
            throw new InvalidRestaurantDataException("Новый рейтинг должен быть от 1 до 5");
        }
        this.rating = newRating;
        System.out.println("Рейтинг ресторана " + name + " обновлен на " + newRating);
    }
}