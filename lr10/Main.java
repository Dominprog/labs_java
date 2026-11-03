public static void main(String[] args) {
    Growable[] plants = new Growable[5];

    plants[0] = new Tree("Дуб", 10, 5);
    plants[1] = new Tree("Берёза", 8, 3);
    plants[2] = new Tree("Сосна", 12, 4);
    plants[3] = new Flower("Роза", 20, "Красный");
    plants[4] = new Flower("Тюльпан", 15, "Жёлтый");

    for (int i = 0; i < plants.length; i++) {
        plants[i].grow();
        System.out.println("Высота: " + plants[i].getHeight());
        System.out.println();
    }

    Blooming[] blooms = new Blooming[5];

    blooms[0] = new Tree("Дуб", 10, 5);
    blooms[1] = new Tree("Берёза", 8, 3);
    blooms[2] = new Tree("Сосна", 12, 4);
    blooms[3] = new Flower("Роза", 20, "Красный");
    blooms[4] = new Flower("Тюльпан", 15, "Жёлтый");

    for (int i = 0; i < blooms.length; i++) {
        blooms[i].bloom();
        System.out.println("Цвет: " + blooms[i].getFlowerColor());
        System.out.println();
    }
}
