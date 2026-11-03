public class Apartment {
    private String address;
    private int rooms;
    private double price;

    public Apartment() {
    }

    public Apartment(String address, int rooms, double price) {
        this.address = address;
        this.rooms = rooms;
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Apartment[] flats = new Apartment[6];
        flats[0] = new Apartment("ул. Ленина 1", 2, 50000);
        flats[1] = new Apartment("ул. Пушкина 5", 3, 75000);
        flats[2] = new Apartment("ул. Гагарина 10", 1, 30000);
        flats[3] = new Apartment("ул. Мира 7", 4, 100000);
        flats[4] = new Apartment("ул. Советская 3", 2, 60000);
        flats[5] = new Apartment("ул. Кирова 12", 5, 120000);

        Apartment maxRooms = flats[0];
        Apartment maxPrice = flats[0];

        for (int i = 0; i < flats.length; i++) {
            if (flats[i].getRooms() > maxRooms.getRooms()) {
                maxRooms = flats[i];
            }
            if (flats[i].getPrice() > maxPrice.getPrice()) {
                maxPrice = flats[i];
            }
        }

        System.out.println("Макс. комнат: " + maxRooms.getAddress() + " (" + maxRooms.getRooms() + ")");
        System.out.println("Самая дорогая: " + maxPrice.getAddress() + " (" + maxPrice.getPrice() + ")");
    }
}