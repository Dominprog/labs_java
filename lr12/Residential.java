public class Residential extends Building {
    private int apartments;

    public Residential(String name, int id, int floors, int apartments) {
        super(name, id, floors);
        this.apartments = apartments;
    }

    public int getApartments() {
        return apartments;
    }

    public void setApartments(int apartments) {
        this.apartments = apartments;
    }

    @Override
    public String toString() {
        return "Residential{name='" + getName() + "', id=" + getId() + ", floors=" + getFloors() + ", apartments=" + apartments + "}";
    }
}