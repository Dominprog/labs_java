public class Hospital extends Building {
    private int departments;

    public Hospital(String name, int id, int floors, int departments) {
        super(name, id, floors);
        this.departments = departments;
    }

    public int getDepartments() {
        return departments;
    }

    public void setDepartments(int departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Hospital{name='" + getName() + "', id=" + getId() + ", floors=" + getFloors() + ", departments=" + departments + "}";
    }
}