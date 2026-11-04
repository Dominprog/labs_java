public class Building {
    private String name;
    private int id;
    private int floors;

    public Building(String name, int id, int floors) {
        this.name = name;
        this.id = id;
        this.floors = floors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "Building{name='" + name + "', id=" + id + ", floors=" + floors + "}";
    }
}