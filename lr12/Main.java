import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public static void main(String[] args) {
    Map<String, Building> buildings = new HashMap<>();

    buildings.put("ЖК Юбилейный", new Residential("ЖК Юбилейный", 1, 10, 200));
    buildings.put("ЖК Солнечный", new Residential("ЖК Солнечный", 2, 5, 100));
    buildings.put("ЖК Лесной", new Residential("ЖК Лесной", 3, 12, 250));

    buildings.put("Бизнес-Центр А", new Office("Бизнес-Центр А", 4, 20, 50));
    buildings.put("Бизнес-Центр Б", new Office("Бизнес-Центр Б", 5, 15, 30));
    buildings.put("Бизнес-Центр В", new Office("Бизнес-Центр В", 6, 25, 60));

    buildings.put("Городская больница", new Hospital("Городская больница", 7, 5, 10));
    buildings.put("Детская больница", new Hospital("Детская больница", 8, 3, 5));

    Set<String> keys = buildings.keySet();
    String[] keysArray = keys.toArray(new String[0]);

    for (int i = 0; i < keysArray.length; i++) {
        String key = keysArray[i];
        Building value = buildings.get(key);
        System.out.println("Ключ: " + key + " | Значение: " + value);
    }
}