public class Office extends Building {
    private int companies;

    public Office(String name, int id, int floors, int companies) {
        super(name, id, floors);
        this.companies = companies;
    }

    public int getCompanies() {
        return companies;
    }

    public void setCompanies(int companies) {
        this.companies = companies;
    }

    @Override
    public String toString() {
        return "Office{name='" + getName() + "', id=" + getId() + ", floors=" + getFloors() + ", companies=" + companies + "}";
    }
}