public class Tree implements Growable, Blooming {
    private String name;
    private int height;
    private int crownDiameter;

    public Tree(String name, int height, int crownDiameter) {
        this.name = name;
        this.height = height;
        this.crownDiameter = crownDiameter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getCrownDiameter() {
        return crownDiameter;
    }

    public void setCrownDiameter(int crownDiameter) {
        this.crownDiameter = crownDiameter;
    }

    @Override
    public void grow() {
        height += 1;
        System.out.println(name + " вырос до " + height + " м");
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void bloom() {
        System.out.println(name + " цветёт зелёным");
    }

    @Override
    public String getFlowerColor() {
        return "Зелёный";
    }
}