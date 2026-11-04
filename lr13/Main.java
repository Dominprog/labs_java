import java.util.ArrayList;
import java.util.List;

public static void main(String[] args) {
    List<Restaurant> restaurants = new ArrayList<>();

    System.out.println("1.Ошибка при создании");
    try {
        restaurants.add(new Restaurant(null, "Итальянская", 10, 2, "ул. Ленина 1", 10));
    } catch (InvalidRestaurantDataException e) {
        System.out.println("Ошибка: " + e.getMessage());
    } finally {
        System.out.println("Попытка создания завершена.");
    }

    System.out.println("\n2.Создание нормальных ресторанов");
    try {
        restaurants.add(new Restaurant("Италия", "Итальянская", 5, 2, "ул. Ленина 1", 2));
        restaurants.add(new Restaurant("Токио", "Японская", 4, 3, "ул. Мира 5", 0));
        System.out.println("Создано ресторанов: " + restaurants.size());
    } catch (InvalidRestaurantDataException e) {
        System.out.println("Ошибка: " + e.getMessage());
    }

    System.out.println("\n3.Бронирование");
    try {
        Restaurant r = restaurants.get(0);
        r.bookTable(4);
        r.bookTable(2);
        r.bookTable(2);
    } catch (BookingException | IndexOutOfBoundsException e) {
        System.out.println("Ошибка: " + e.getMessage());
    } finally {
        System.out.println("Попытка бронирования завершена.");
    }

    System.out.println("\n 4.Обновление рейтинга");
    try {
        Restaurant r = restaurants.get(0);
        r.updateRating(4);
        r.updateRating(-1);
    } catch (InvalidRestaurantDataException e) {
        System.out.println("Ошибка: " + e.getMessage());
    }

    System.out.println("\n 5.Нет столиков");
    try {
        Restaurant r = restaurants.get(1);
        r.bookTable(2);
    } catch (BookingException e) {
        System.out.println("Ошибка: " + e.getMessage());
    }

    System.out.println("\n 6.Поиск ресторана");
    String searchName = "Париж";
    boolean found = false;
    for (int i = 0; i < restaurants.size(); i++) {
        if (restaurants.get(i).getName().equals(searchName)) {
            found = true;
            break;
        }
    }
    if (!found) {
        try {
            throw new RestaurantNotFoundException("Ресторан \"" + searchName + "\" не найден");
        } catch (RestaurantNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}